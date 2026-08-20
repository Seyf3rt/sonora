import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();
        Playlist[] playlists = new Playlist[100];
        boolean fim = false;
        int quantidadePlaylist = 0;

        do {

            System.out.println("\n\n\n=== Sonora ===\n1 - Cadastar música manualmente\n2 - Cadastrar usuário\n3"
                    +
                    " - Criar playlist e adicionar músicas\n4 - Buscar música por id\n5 - Buscar música por título\n6 - Reproduzir uma música\n"
                    + "7 - Listar acervo\n8 - Remover música de uma playlist\n9 - Reproduzir todas as músicas de uma playlist\n0 - Sair");

            if (!sc.hasNextInt()) {
                System.out.println("Opção inválida, digite um número.");
                sc.next();
                continue;
            }

            int resposta = sc.nextInt();

            switch (resposta) {

                case 1:
                    sc.nextLine();
                    System.out.println("Digite tíitulo musica:");
                    String titulo = sc.nextLine();
                    System.out.println("Digite o artista da musica:");
                    String artista = sc.nextLine();
                    System.out.println("Digite a duracao da musica:");
                    int duracao = sc.nextInt();

                    Musica musica = new Musica(titulo, artista, duracao);

                    if (plataforma.cadastrarMusica(musica)) {
                        System.out.println("\nMusica cadastrada com sucesso!\n");
                    } else {
                        System.out.println("\nNão foi possivel cadastrar!\n");
                    }

                    break;
                case 2:
                    sc.nextLine();
                    System.out.println("Digite o seu nome:");
                    String nome = sc.nextLine();
                    System.out.println("Digite o seu email:");
                    String email = sc.nextLine();
                    Usuario usuario = new Usuario(nome, email);

                    if (plataforma.cadastrarUsuario(usuario)) {
                        System.out.println("\nUsuário cadastrado com sucesso!\n");
                    } else {
                        System.out.println("\nNão foi possivel cadastrar o usuário!\n");
                    }

                    break;
                case 3:
                    sc.nextLine();
                    System.out.println("Playlist");
                    nome = sc.nextLine();
                    System.out.println();
                    for (int i = 1; i <= plataforma.getTotalUsuarios(); i++) {
                        Usuario u = plataforma.buscarUsuarioPorId(i);
                        System.out.println("USER: " + u.getNome() + " ID: " + u.getId());
                        System.out.println();
                    }

                    System.out.println("Digite o ID:");
                    int dono = sc.nextInt();

                    Usuario donoUsuario = plataforma.buscarUsuarioPorId(dono);
                    if (donoUsuario == null) {
                        System.out.println("\nUsuário não encontrado!\n");
                        break;
                    }

                    Playlist playlist = new Playlist(nome, donoUsuario);

                    boolean continuar = false;

                    do {
                        System.out.println("Digite o ID da música:");

                        int id = sc.nextInt();
                        sc.nextLine();

                        if (playlist.adicionar(plataforma.buscarMusicaPorId(id))) {
                            System.out.println("Música adicionada! Total na playlist: " + playlist.getQuantidade());
                        } else {
                            System.out.println("Não foi possível adicionar (música não encontrada ou playlist cheia).");
                        }

                        System.out.println("Deja add outra musica?");
                        if (sc.nextLine().equals("sim")) {

                        } else {
                            continuar = true;
                        }

                    } while (!continuar);

                    if (quantidadePlaylist >= playlists.length) {
                        System.out.println("\nLimite de playlists atingido, não foi possível salvar!\n");
                        break;
                    }

                    playlists[quantidadePlaylist] = playlist;
                    quantidadePlaylist++;
                    System.out.println("\nPlaylist salva com sucesso! Total de músicas: " + playlist.getQuantidade()
                            + " | Duração total (segundos): " + playlist.getDuracaoTotalSegundos() + "\n");
                    break;

                case 4:

                    System.out.println("Buscar musica por id (digite o id):");
                    int id = sc.nextInt();

                    if (plataforma.buscarMusicaPorId(id) == null) {
                        System.out.println("Musica nao encontrada...");
                    } else {
                        System.out.println("Titulo: " + plataforma.buscarMusicaPorId(id).getTitulo() + " Artista: "
                                + plataforma.buscarMusicaPorId(id).getArtista() + " Duração: "
                                + plataforma.buscarMusicaPorId(id).getDuracaoFormatada());

                    }

                    break;

                case 5:
                    sc.nextLine();
                    System.out.println("Buscar musica por titulo:");
                    titulo = sc.nextLine();

                    if (plataforma.buscarMusica(titulo) == null) {
                        System.out.println("Musica nao encontrada...");
                    } else {
                        System.out.println("Titulo: " + plataforma.buscarMusica(titulo).getTitulo() + " Artista: "
                                + plataforma.buscarMusica(titulo).getArtista() + " Duração: "
                                + plataforma.buscarMusica(titulo).getDuracaoFormatada());

                    }

                    break;

                case 6:
                    System.out.println("Digite a musica a ser reproduziada id");
                    id = sc.nextInt();
                    Musica musicaReproduzir = plataforma.buscarMusicaPorId(id);
                    if (musicaReproduzir == null) {
                        System.out.println("Musica nao encontrada...");
                    } else {
                        musicaReproduzir.reproduzir();
                        System.out.println("Reproduções: " + musicaReproduzir.getReproducoes());
                    }

                    break;
                case 7:
                    for (int i = 1; i <= plataforma.getTotalMusicas(); i++) {
                        plataforma.buscarMusicaPorId(i);

                        System.out.println("Titulo: "
                                + plataforma.buscarMusicaPorId(i).getTitulo() + " Artista: "
                                + plataforma.buscarMusicaPorId(i).getArtista() + " Duração: "
                                + plataforma.buscarMusicaPorId(i).getDuracaoFormatada());

                    }
                    break;
                case 8:
                    if (quantidadePlaylist == 0) {
                        System.out.println("\nNenhuma playlist cadastrada ainda!\n");
                        break;
                    }
                    for (int i = 0; i < quantidadePlaylist; i++) {
                        System.out.println(i + " - " + playlists[i].getNome() + " (dono: "
                                + playlists[i].getDono().getNome() + ", " + playlists[i].getQuantidade() + " música(s))");
                    }
                    System.out.println("Escolha o índice da playlist:");
                    int indicePlaylistRemover = sc.nextInt();

                    if (indicePlaylistRemover < 0 || indicePlaylistRemover >= quantidadePlaylist) {
                        System.out.println("\nPlaylist inválida!\n");
                        break;
                    }

                    System.out.println("Escolha a posição da música a remover (0 a "
                            + (playlists[indicePlaylistRemover].getQuantidade() - 1) + "):");
                    int posicaoRemover = sc.nextInt();

                    if (playlists[indicePlaylistRemover].removerNaPosicao(posicaoRemover)) {
                        System.out.println("\nMúsica removida! Total na playlist agora: "
                                + playlists[indicePlaylistRemover].getQuantidade() + "\n");
                    } else {
                        System.out.println("\nPosição inválida!\n");
                    }
                    break;
                case 9:
                    if (quantidadePlaylist == 0) {
                        System.out.println("\nNenhuma playlist cadastrada ainda!\n");
                        break;
                    }
                    for (int i = 0; i < quantidadePlaylist; i++) {
                        System.out.println(i + " - " + playlists[i].getNome());
                    }
                    System.out.println("Escolha o índice da playlist:");
                    int indicePlaylistReproduzir = sc.nextInt();

                    if (indicePlaylistReproduzir < 0 || indicePlaylistReproduzir >= quantidadePlaylist) {
                        System.out.println("\nPlaylist inválida!\n");
                        break;
                    }

                    playlists[indicePlaylistReproduzir].reproduzirTudo();
                    break;
                case 0:
                    fim = true;
                    break;

                default:
                    System.out.println("Digite novamente");
                    ;
            }

        } while (!fim);
    }
}
