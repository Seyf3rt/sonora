public class Plataforma {
    Usuario[] usuarios = new Usuario[500];
    Musica[] musicas = new Musica[500];
    Playlist[] playlist = new Playlist[100];

    public boolean cadastrarMusica(Musica musica) {
        if (Musica.getQuantidade() == 500) {
            return false;
        } else {
            musicas[musica.getId()] = musica;
            return true;
        }

    }

    public void cadastrarMusicaPlaylist(Musica musica) {

    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (Usuario.getQuantidade() == 500) {
            return false;
        } else {
            usuarios[usuario.getId()] = usuario;
            return true;
        }
    }

    public Musica buscarMusicaPorId(int id) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null && id == musicas[i].getId()) {
                return musicas[i];
            }
        }
        return null;
    }

    public Musica buscarMusica(String titulo) {
        for (int i = 0; i < musicas.length; i++) {
            if (musicas[i] != null && titulo.equals(musicas[i].getTitulo())) {
                return musicas[i];
            }
        }
        return null;
    }

    public int getTotalMusicas() {
        return Musica.getQuantidade();
    }

    public int getTotalUsuarios() {
        return Usuario.getQuantidade();
    }

}
