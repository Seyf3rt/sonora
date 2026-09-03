class Playlist {
    private Usuario dono;
    private String titulo;
    private Musica[] musicas = new Musica[100];
    private int id;
    private int quantidade; // é de música
    private static int contagem; // é de playlist

    public Playlist(String titulo, Usuario dono) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome da playlist inválido: não pode ser nulo nem vazio.");
        }
        if (dono == null) {
            throw new IllegalArgumentException("A playlist precisa de um dono (não pode ser nulo).");
        }

        this.dono = dono;
        this.titulo = titulo;
        contagem++;
        id = contagem;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Usuario getDono() {
        return dono;
    }

    public static int getContagem() {
        return contagem;
    }

    public static void decContagem() {
        contagem--;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public boolean adicionar(Musica musica) {
        if (musica == null) {
            throw new IllegalArgumentException("Não é possível adicionar uma música nula à playlist.");
        }
        if (quantidade == musicas.length) {
            return false;
        }

        musicas[quantidade] = musica;
        quantidade++;
        return true;
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException(
                    "Posição " + indice + " inválida. A playlist tem " + quantidade + " música(s).");
        }

        return musicas[indice];
    }

    public boolean removerNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            throw new IndexOutOfBoundsException(
                    "Posição " + indice + " inválida. A playlist tem " + quantidade + " música(s).");
        }

        for (int i = indice; i < quantidade - 1; i++) {
            musicas[i] = musicas[i + 1];
        }
        quantidade--;
        musicas[quantidade] = null;
        return true;
    }

    public int getDuracaoSegundos() {
        int total = 0;
        for (int i = 0; i < quantidade; i++) {
            total += musicas[i].getDuracaoSegundos();
        }
        return total;
    }

    public String getTodasMusicas() {
        String todasMusicas = "";
        for (int i = 0; i < Musica.getContagem(); i++) {
            todasMusicas += musicas[i].informacoes();
        }
        return todasMusicas;

    }

    public String getDuracaoFormatada() {

        int minutos = getDuracaoSegundos() / 60;
        int segundos = getDuracaoSegundos() % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }

    public void reproduzirTudo() {
        for (int i = 0; i < getQuantidade(); i++) {
            musicas[i].reproduzir();
        }

    }

}