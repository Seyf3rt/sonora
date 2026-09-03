
import java.util.Scanner;

class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Plataforma plataforma = new Plataforma();

        boolean fim = false;

        do {
            System.out.println("\n=== Sonora ===\n");
            System.out.println(""
                    + "1 - Música(s) \n"
                    + "2 - Playlist(s) \n"
                    + "3 - Usuário(s)\n"
                    + "4 - Sair\n");

            int opcao = lerInt(sc, "Escolha uma opcao: ");

            switch (opcao) {
                case 1:
                    System.out.println(""
                            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                            + "[MÚSICA(S)]\n"
                            + "1 - Criar\n"
                            + "2 - Listar\n"
                            + "3 - Deletar\n"
                            + "4 - Buscar\n"
                            + "5 - Reproduzir\n"
                            + "6 - Voltar\n");

                    switch (lerInt(sc, "Opcao: ")) {
                        case 1: {
                            String titulo = lerTexto(sc, "Digite o título da música: ");
                            String artista = lerTexto(sc, "Digite o artista: ");
                            int duracao = lerInt(sc, "Digite a duração (segundos): ");

                            try {
                                Musica musica = new Musica(titulo, artista, duracao);
                                plataforma.cadastrarMusica(musica);
                                System.out.println("Musica cadastrada!");
                            } catch (IllegalArgumentException e) {
                                System.out.println("Nao foi possivel cadastrar: " + e.getMessage());
                            }
                            break;
                        }
                        case 2:
                            System.out.println(plataforma.getTodasMusicas());
                            break;
                        case 3: {
                            int id = lerInt(sc, "Digite o id da música a deletar: ");
                            if (plataforma.excluirMusica(id)) {
                                System.out.println("Musica excluida.");
                            } else {
                                System.out.println("Musica nao encontrada.");
                            }
                            break;
                        }
                        case 4: {
                            System.out.println("Buscar por:\n"
                                    + "1 - Id\n"
                                    + "2 - Título\n");

                            Musica encontrada = null;
                            switch (lerInt(sc, "Opcao: ")) {
                                case 1:
                                    encontrada = plataforma.buscarMusica(lerInt(sc, "Digite o id: "));
                                    break;
                                case 2:
                                    encontrada = plataforma.buscarMusica(lerTexto(sc, "Digite o título: "));
                                    break;
                                default:
                                    System.out.println("Opção invalida");
                                    break;
                            }

                            if (encontrada == null) {
                                System.out.println("Nenhuma música encontrada.");
                            } else {
                                System.out.println(encontrada.informacoes());
                            }
                            break;
                        }
                        case 5: {
                            try {
                                int id = Integer.parseInt(lerTexto(sc, "Digite o id: ").trim());
                                Musica m = plataforma.buscarMusica(id);
                                if (m == null) {
                                    System.out.println("Essa música não existe.");
                                } else {
                                    m.reproduzir();
                                }
                            } catch (NumberFormatException e) {
                                System.out.println("O id precisa ser um numero.");
                            } finally {
                                System.out.println("--- operação finalizada ---");
                            }
                            break;
                        }
                        case 6:
                            continue;
                        default:
                            System.out.println("Valor incorreto!");
                            break;
                    }

                    break;

                case 2:

                    System.out.println(""
                            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                            + "[PLAYLIST]\n"
                            + "1 - Criar\n"
                            + "2 - Add música\n"
                            + "3 - Listar\n"
                            + "4 - Deletar música\n"
                            + "5 - Deletar playlist\n"
                            + "6 - Reproduzir playlist inteira\n"
                            + "7 - Reproduzir música (por posição)\n"
                            + "8 - Buscar\n"
                            + "9 - Voltar\n");
                    switch (lerInt(sc, "Opcao: ")) {
                        case 1: {
                            System.out.println("Selecione o proprietário da playlist:\n");
                            System.out.println(plataforma.getInfoUsuarios());

                            int id = lerInt(sc, "Digite o dono (id): ");
                            String nome = lerTexto(sc, "Digite o nome da playlist: ");

                            try {
                                if (plataforma.cadastrarPlaylist(nome, id)) {
                                    System.out.println("Playlist criada com sucesso!");
                                } else {
                                    System.out.println("Não foi possível criar a playlist..");
                                }
                            } catch (IllegalArgumentException e) {
                                System.out.println("Não foi possível criar a playlist: " + e.getMessage());
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Não foi possível criar a playlist: usuário (id) inexistente.");
                            }
                            break;
                        }
                        case 2: {
                            System.out.println(plataforma.getTodasPlaylists());
                            int idPlaylist = lerInt(sc, "\nDigite o ID da playlist: ") - 1;

                            System.out.println(plataforma.getTodasMusicas());
                            int idMusica = lerInt(sc, "\nDigite o ID da música a ser adicionada: ");

                            try {
                                boolean adicionou = plataforma.addMusicaPlaylist(idPlaylist, idMusica);
                                System.out.println(adicionou
                                        ? "Música adicionada à playlist."
                                        : "Playlist cheia. Não foi possível adicionar.");
                            } catch (IllegalArgumentException e) {
                                System.out.println("Não foi possível adicionar: " + e.getMessage());
                            } catch (IndexOutOfBoundsException | NullPointerException e) {
                                System.out.println("Playlist inexistente.");
                            }
                            break;
                        }
                        case 3:
                            System.out.println(plataforma.getTodasPlaylists());
                            break;
                        case 4: {
                            System.out.println(plataforma.getTodasPlaylists());
                            int idPlaylist = lerInt(sc, "\nDigite o ID da playlist: ") - 1;
                            int idMusica = lerInt(sc, "Digite o id da música a ser deletada: ");

                            try {
                                plataforma.excluirMusicaPlaylist(idPlaylist, idMusica);
                                System.out.println("Música removida da playlist.");
                            } catch (IndexOutOfBoundsException | NullPointerException e) {
                                System.out.println("Não foi possível remover: playlist ou posição inválida.");
                            }
                            break;
                        }
                        case 5: {
                            System.out.println(plataforma.getTodasPlaylists());
                            int idPlaylist = lerInt(sc, "Digite o id da playlist a ser excluida: ") - 1;

                            try {
                                if (plataforma.excluirPlaylist(idPlaylist)) {
                                    System.out.println("Playlist excluida.");
                                } else {
                                    System.out.println("Playlist não encontrada.");
                                }
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Playlist não encontrada.");
                            }
                            break;
                        }
                        case 6: {
                            System.out.println(plataforma.getTodasPlaylists());
                            int idPlaylist = lerInt(sc, "Digite o id da playlist a ser tocada: ") - 1;

                            try {
                                plataforma.tocarPlaylist(idPlaylist);
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Playlist não encontrada.");
                            } catch (NullPointerException e) {
                                System.out.println("Playlist vazia ou inexistente.");
                            }
                            break;
                        }
                        case 7: {

                            System.out.println(plataforma.getTodasPlaylists());
                            try {
                                int idPlaylist = Integer.parseInt(lerTexto(sc, "Id da playlist: ").trim()) - 1;
                                int pos = Integer.parseInt(lerTexto(sc, "Posição da música (começa em 0): ").trim());
                                Musica m = plataforma.getMusicaPlaylist(idPlaylist, pos);
                                m.reproduzir();
                                System.out.println("Tocando: " + m.getTitulo());
                            } catch (NumberFormatException e) {
                                System.out.println("A posição precisa ser um número.");
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Essa posição não existe na playlist. " + e.getMessage());
                            } finally {
                                System.out.println("--- reprodução finalizada ---");
                            }
                            break;
                        }
                        case 8: {
                            int idPlaylist = lerInt(sc, "Digite o id da playlist a pesquisar: ") - 1;
                            try {
                                System.out.println(plataforma.buscarPlaylist(idPlaylist));
                            } catch (IndexOutOfBoundsException | NullPointerException e) {
                                System.out.println("Playlist não encontrada.");
                            }
                            break;
                        }
                        case 9:
                            continue;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;

                case 3:
                    System.out.println(""
                            + "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
                            + "[USUÁRIO(S)]\n"
                            + "1 - Criar\n"
                            + "2 - Listar\n"
                            + "3 - Deletar\n"
                            + "4 - Buscar\n"
                            + "5 - Voltar\n");

                    switch (lerInt(sc, "Opcao: ")) {
                        case 1: {
                            String nome = lerTexto(sc, "Digite o nome: ");
                            String email = lerTexto(sc, "Digite o email: ");

                            try {
                                Usuario usuario = new Usuario(nome, email);
                                plataforma.cadastrarUsuario(usuario);
                                System.out.println("Usuario cadastrado!");
                            } catch (IllegalArgumentException e) {
                                System.out.println("Nao foi possivel cadastrar: " + e.getMessage());
                            }
                            break;
                        }
                        case 2:
                            System.out.println(plataforma.getInfoUsuarios());
                            break;
                        case 3: {
                            System.out.println(plataforma.getInfoUsuarios());
                            int id = lerInt(sc, "Digite o id do usuário a ser excluido: ") - 1;

                            try {
                                if (plataforma.excluirUsuario(id)) {
                                    System.out.println("Usuario excluido.");
                                } else {
                                    System.out.println("Usuario não encontrado.");
                                }
                            } catch (IndexOutOfBoundsException e) {
                                System.out.println("Usuario não encontrado.");
                            }
                            break;
                        }
                        case 4: {
                            int id = lerInt(sc, "Digite o id do usuário a ser buscado: ");
                            try {
                                System.out.println(plataforma.getInfoUsuario(id));
                            } catch (IndexOutOfBoundsException | NullPointerException e) {
                                System.out.println("Usuario não encontrado.");
                            }
                            break;
                        }
                        case 5:
                            continue;
                        default:
                            System.out.println("Opção invalida");
                            break;
                    }
                    break;
                case 4:

                    fim = true;
                    break;
                default:
                    System.out.println("Opção invalida");
                    break;
            }

        } while (!fim);

    }

    static int lerInt(Scanner sc, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Valor invalido. Digite um numero.");
            }
        }
    }

    static String lerTexto(Scanner sc, String prompt) {
        System.out.print(prompt);
        return sc.nextLine();
    }
}
