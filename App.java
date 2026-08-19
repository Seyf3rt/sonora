import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();
        boolean fim = false;
        int quantidadePlaylist = 0;

        do {

            System.out.println("=== Sonora ===\n1 - Cadastar música manualmente\n2 - Cadastrar usuário\n3" +
                    " - Criar playlist e adicionar músicas\n4 - Buscar música por id\n5 - Buscar música por título\n6 - Reproduzir uma música\n"
                    + "7 - Listar acervo\n0 - Sair");

            int resposta = sc.nextInt();

            switch (resposta) {

                case 1:
                    System.out.println("Digite tíitulo musica:");
                    String titulo = sc.next();
                    System.out.println("Digite o artista da musica:");
                    String artista = sc.next();
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

                    System.out.println("Criação de playlist! Digite um nome:");
                    nome = sc.next();
                    System.out.println("Digite o dono:");

                    for (int i = 0; i < Usuario.contador; i++) {
                        System.out.println(
                                "USER: " + plataforma.usuarios[i].getNome() + " ID: " + plataforma.usuarios[i].getId());
                        System.out.println();
                    }

                    System.out.println("Digite o ID:");
                    int dono = sc.nextInt();

                    Playlist playlist = new Playlist(nome, plataforma.usuarios[dono]);

                    boolean continuar = false;

                    int quantidadeMusicasNaPlaylist = 0;
                    do {

                        System.out.println("Digite tíitulo musica:");
                        titulo = sc.nextLine();
                        System.out.println("Digite o artista da musica:");
                        artista = sc.nextLine();
                        System.out.println("Digite a duracao da musica:");
                        duracao = sc.nextInt();

                        musica = new Musica(titulo, artista, duracao);

                        playlist.musicas[quantidadeMusicasNaPlaylist] = musica;
                        quantidadeMusicasNaPlaylist++;

                        System.out.println("Deja add outra musica?");
                        if (sc.nextLine().equals("sim")) {
                            break;
                        } else {
                            continuar = true;
                        }

                    } while (!continuar);

                    plataforma.playlist[quantidadePlaylist] = playlist;
                    quantidadePlaylist++;
                    System.out.println("Playlist salva com sucesso!");

                case 4:

                    System.out.println("Buscar musica por id (digite o id):");
                    int id = sc.nextInt();
                    id--;

                    if (plataforma.buscarMusicaPorId(id) == null) {
                        System.out.println("Musica nao encontrada...");
                    } else {
                        System.out.println("Titulo: " + plataforma.buscarMusicaPorId(id).getTitulo() + " Artista: "
                                + plataforma.buscarMusicaPorId(id).getArtista() + " Duração: "
                                + plataforma.buscarMusicaPorId(id).getDuracaoFormatada());

                    }

                    break;

                case 5:
                    System.out.println("Buscar musica por titulo:");
                    titulo = sc.next();

                    if (plataforma.buscarMusica(titulo) == null) {
                        System.out.println("Musica nao encontrada...");
                    } else {
                        System.out.println("Titulo: " + plataforma.buscarMusica(titulo).getTitulo() + " Artista: "
                                + plataforma.buscarMusica(titulo).getArtista() + " Duração: "
                                + plataforma.buscarMusica(titulo).getDuracaoFormatada());

                    }

                    break;

                case 6:
                    System.out.println("Digite a musica a ser reproduziada (id ou titulo)");
                    
                    break;
                case 7:

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
