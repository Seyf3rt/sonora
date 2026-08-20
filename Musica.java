public class Musica {
    private int id;
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private int reproducoes = 0;

    private static int quantidade = 0;


    public Musica(String titulo, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        quantidade++;
        id = quantidade;
    }

    public static int getQuantidade() {
        return quantidade;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;

    }

    public String getArtista(){
        return artista;

    }

    public int getDuracaoSegundos(){
        return duracaoSegundos;
    }

    public int getReproducoes(){
        return reproducoes;
    }

    public void reproduzir(){
        System.out.println("Tocando: "+ getTitulo());
        reproducoes++;
    }

    public String getDuracaoFormatada(){
        int minutos = getDuracaoSegundos() / 60;
        int segundos = getDuracaoSegundos() % 60;

        String minutosString = ""+minutos;
        String segundosString = ""+segundos;

        if (minutos <10){
            minutosString = "0"+minutos;
        }
        if (segundos <10){
            segundosString = "0"+segundos;
        }

        return minutosString+":"+segundosString;
    }
}
