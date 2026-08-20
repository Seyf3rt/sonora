public class Plataforma {
    private Usuario[] usuarios = new Usuario[500];
    private Musica[] musicas = new Musica[500];
    private int totalMusicas = 0;
    private int totalUsuarios = 0;

    public boolean cadastrarMusica(Musica musica) {
        if (musica == null || totalMusicas >= musicas.length) {
            return false;
        } else {
            musicas[musica.getId()] = musica;
            totalMusicas++;
            return true;
        }

    }

    public boolean cadastrarUsuario(Usuario usuario) {
        if (usuario == null || totalUsuarios >= usuarios.length) {
            return false;
        } else {
            usuarios[usuario.getId()] = usuario;
            totalUsuarios++;
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

    public Usuario buscarUsuarioPorId(int id) {
        for (int i = 0; i < usuarios.length; i++) {
            if (usuarios[i] != null && id == usuarios[i].getId()) {
                return usuarios[i];
            }
        }
        return null;
    }

    public int getTotalMusicas() {
        return totalMusicas;
    }

    public int getTotalUsuarios() {
        return totalUsuarios;
    }

}
