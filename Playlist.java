public class Playlist {
    private String nome;
    private Usuario dono;
    Musica[] musicas = new Musica[100];
    private int quantidade = 0;

    public Playlist(String nome, Usuario dono) {
        this.nome = nome;
        this.dono = dono;

    }

    public String getNome() {
        return nome;
    }

    public Usuario getDono() {
        return dono;
    }

    public int getQuantidade() {
        return quantidade;
    }


    public boolean adicionar(Musica musica){
        if (quantidade == 100){
            return false;
        } else {
            musicas[quantidade] = musica;
            quantidade++;
            return true;
        }
        

    }



    public Musica getNaPosicao(int indice) {
        if (musicas[indice].getTitulo().equals("")){
            return null;
        } else {
            return musicas[indice];
        }
        
    }



    public boolean removerNaPosicao(int indice) {
        if (musicas[indice].getTitulo().equals("")) {
            System.out.println("Não existe música nesta posição");
            return false;
        } else {
            for (int i = indice; i < musicas.length; i++) {
                musicas[i] = musicas[i + 1];
            }
            System.out.println("Musica excluida com sucesso!");
            return true;
        }

    }

    public int getDuracaoTotalSegundos() {
        int totalTempo = 0;
        for (int i = 0; i < musicas.length; i++) {
            totalTempo += musicas[i].getDuracaoSegundos();
        }
        return totalTempo;
    }

    public void reproduzirTudo() {
        for (int i = 0; i < musicas.length; i++) {
            musicas[i].reproduzir();
        }
    }
}
