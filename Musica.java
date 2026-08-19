public class Musica {
    private int id;
    private String titulo;
    private String artista;
    private int duracaoSegundos;
    private int reproducao;

    static int contador = 0;


    public Musica(String titulo, String artista, int duracaoSegundos) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracaoSegundos = duracaoSegundos;
        contador++;
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
        return reproducao;
    }

    public void reproduzir(){
        reproducao++;
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
