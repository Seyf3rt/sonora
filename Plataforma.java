class Plataforma {
    private Musica[] musicas = new Musica[500];
    private Usuario[] usuarios = new Usuario[500];
    private Playlist[] playlists = new Playlist[500]; // professor falou que o usuario que tem a playlist

    public boolean cadastrarMusica(Musica musica) {
        if (Musica.getContagem() >= 500 || musica == null) {
            return false;
        }

        musicas[Musica.getContagem()-1] = musica;
        return true;
    }

    public String getTodasMusicas() {
       
       
        String todasMusicas = "";
        for (int i = 0; i  < Musica.getContagem(); i++) {
            todasMusicas += musicas[i].informacoes();
        }
        return todasMusicas;

    }

    public Musica buscarMusica(int id) {
        for (int i = 0; i < Musica.getContagem(); i++) {
            if (musicas[i] != null && musicas[i].getId() == id) {
                return musicas[i];
            }
        }
        return null;
    }

    public Musica buscarMusica(String titulo) {

        for (int i = 0; i < Musica.getContagem(); i++) {
            if (musicas[i] != null && musicas[i].getTitulo().equalsIgnoreCase(titulo)) {
                return musicas[i];
            }
        }
        return null;
    }

    public boolean excluirMusica(int idMusica) {

        for (int i = 0; i < Musica.getContagem(); i++) {
            if (musicas[i].getId() == idMusica) {
                for (int j = i; j <= Musica.getContagem(); j++) {
                    musicas[j] = musicas[j + 1];
                }
                Musica.decContagem();
                return true;
            }
        }
        return false;

    }

    public boolean cadastrarUsuario(Usuario usuario) {

        if (Usuario.getContagem() >= 500 || usuario == null) {
            return false;
        }

        usuarios[Usuario.getContagem()-1] = usuario;
        return true;
    }

    public String buscarPlaylist(int id) {
        return playlists[id].getTitulo();

    }

    public boolean addMusicaPlaylist(int idPlaylist, int idMusica) {
        return playlists[idPlaylist].adicionar(buscarMusica(idMusica));
    }

    public void tocarPlaylist(int id) {
        playlists[id].reproduzirTudo();
    }

    public Musica getMusicaPlaylist(int idPlaylist, int posicao) {
        if (idPlaylist < 0 || idPlaylist >= Playlist.getContagem() || playlists[idPlaylist] == null) {
            throw new IndexOutOfBoundsException("A playlist " + idPlaylist + " não existe.");
        }
        return playlists[idPlaylist].getNaPosicao(posicao);
    }

    public String getTodasPlaylists() {
        String todasPlaylists = "";
        for (int i = 0; i < Playlist.getContagem(); i++) {

            todasPlaylists += "\nTítulo: " + playlists[i].getTitulo() + " | Dono: " + playlists[i].getDono().getNome()
                    + " | Duração total: " + playlists[i].getDuracaoFormatada() + " | Id: " + playlists[i].getId();
        }
        return todasPlaylists;

    }

    public boolean cadastrarPlaylist(String nome, int id) {
        Playlist playlist = new Playlist(nome, usuarios[id]);
        if (Playlist.getContagem() >= 100) {
            return false;
        }

        playlists[Playlist.getContagem() - 1] = playlist;
        return true;
    }

    public boolean excluirMusicaPlaylist(int idPlaylist, int idMusica) {

        int posicao = 999;
        for (int i = 0; i < playlists[idPlaylist].getQuantidade(); i++) {
            if (playlists[idPlaylist].getNaPosicao(i).getId() == idMusica) {
                posicao = i;
            }
        }

        playlists[idPlaylist].removerNaPosicao(posicao);
        return true;
    }

    public boolean excluirPlaylist(int idPlaylist) {
        if (playlists[idPlaylist] == null || idPlaylist > playlists.length) {
            return false;
        }
        for (int i = idPlaylist; i < Playlist.getContagem(); i++) {
            playlists[i] = playlists[i + 1];

        }
        playlists[Playlist.getContagem()] = null;
        Playlist.decContagem();
        return true;
    }

    public String getTodasMusicasPlaylist(int idPlaylist) {
        return playlists[idPlaylist].getTodasMusicas();

    }

    public String getInfoUsuarios() {
        String infoUsuarios = "";

        if (Usuario.getContagem() == 0){
            return "Não há usuarios.";
        }
        for (int i = 0; i < Usuario.getContagem(); i++) {
            infoUsuarios += "===================================\nNome: " + usuarios[i].getNome() + " \nEmail: "
                    + usuarios[i].getEmail() + "\nId: "
                    + usuarios[i].getId() + "\n===================================";
        }

        return infoUsuarios;

    }

    public String getInfoUsuario(int id) {

        return "===================================\nNome: " + usuarios[id].getNome() + " \nEmail: "
                + usuarios[id].getEmail() + "\nId: "
                + usuarios[id].getId() + "\n===================================";

    }

    public boolean excluirUsuario(int id) {
        if (usuarios[id] == null || id > Usuario.getContagem()) {
            return false;
        }
        for (int i = id; i < Usuario.getContagem(); i++) {
            usuarios[i] = usuarios[i + 1];

        }
        Usuario.decContagem();
        return true;
    }

}