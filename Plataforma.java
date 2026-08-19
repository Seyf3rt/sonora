public class Plataforma {
    Usuario[] usuarios = new Usuario[500];
    Musica[] musicas = new Musica[500];
    Playlist[] playlist = new Playlist[100];

    public boolean cadastrarMusica(Musica musica) {
        if (musica.getTitulo().equals("")) {
            return false;
        } else if (Musica.contador >= 500) {
            return false;
        }
        musicas[Musica.contador - 1] = musica;
        return true;

    }

    public void cadastrarMusicaPlaylist(Musica musica) {
        

    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario.getNome().equals("")) {
            return false;
        } else if (Usuario.contador >= 500) {
            return false;
        }
        usuarios[Usuario.contador - 1] = usuario;
        return true;
    }

    public Musica buscarMusicaPorId(int id) {
        for (int i = 0; i < musicas.length; i++) {
            if (id == musicas[i].getId()) {
                return musicas[i];
            }
        }
        return null;
    }

    public Musica buscarMusica(String titulo) {
        for (int i = 0; i < musicas.length; i++) {
            if (titulo.equals(musicas[i].getTitulo())) {
                return musicas[i];
            }
        }
        return null;
    }

    public int getTotalMusicas() {
        return musicas.length;
    }

    public int getTotalUsuarios() {
        return usuarios.length;
    }

}
