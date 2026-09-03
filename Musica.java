class Musica {
    private int id;
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private int reproducoes;

    private static int contagem;

    public Musica(String titulo, String artista, int duracaoSegundos) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("Título inválido: não pode ser nulo nem vazio.");
        }
        if (artista == null || artista.trim().isEmpty()) {
            throw new IllegalArgumentException("Artista inválido: não pode ser nulo nem vazio.");
        }
        if (duracaoSegundos <= 0) {
            throw new IllegalArgumentException(
                    "Duração inválida: " + duracaoSegundos + ". A duração deve ser maior que zero.");
        }
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        contagem++;
        this.id = contagem;
    }

    public static int getContagem() {
        return contagem;
    }

    public static void decContagem() {
        contagem--;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;

    }

    public String getArtista() {
        return artista;
    }

    public int getDuracaoSegundos() {
        return duracaoSegundos;
    }

    public int getReproducoes() {
        return reproducoes;
    }

    public void reproduzir() {
        reproducoes++;
        System.out.println("Tocando: " + getTitulo() + " [" + getArtista() + "] " + " (" + getDuracaoFormatada() + ")"
                + " Número de play's: " + getReproducoes());
    }

    public String getDuracaoFormatada() {

        int minutos = duracaoSegundos / 60;
        int segundos = duracaoSegundos % 60;

        return String.format("%02d:%02d", minutos, segundos);
    }

    public String informacoes() {

        return "\nTítulo: " + getTitulo() + " | Artista: " + getArtista() + " | Duração: " + getDuracaoFormatada()
                + " | Id: " + getId();
    }

}