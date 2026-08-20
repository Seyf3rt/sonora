public class Playlist {
    private String nome;
    private Usuario dono;
    private Musica[] musicas = new Musica[100];
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
        if (musica == null || quantidade == 100){
            return false;
        } else {
            musicas[quantidade] = musica;
            quantidade++;
            return true;
        }
    }

    public Musica getNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade){
            return null;
        } else {
            return musicas[indice];
        }
    }

    public boolean removerNaPosicao(int indice) {
        if (indice < 0 || indice >= quantidade) {
            System.out.println("Não existe música nesta posição");
            return false;
        } else {
            for (int i = indice; i < quantidade - 1; i++) {
                musicas[i] = musicas[i + 1];
            }
            musicas[quantidade - 1] = null;
            quantidade--;
            System.out.println("Musica excluida com sucesso!");
            return true;
        }

    }

    public int getDuracaoTotalSegundos() {
        int totalTempo = 0;
        for (int i = 0; i < quantidade; i++) {
            totalTempo += musicas[i].getDuracaoSegundos();
        }
        return totalTempo;
    }

    public void reproduzirTudo() {
        for (int i = 0; i < quantidade; i++) {
            musicas[i].reproduzir();
        }
    }
}
