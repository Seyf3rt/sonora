public class Usuario {
    private int id;
    private String nome;
    private String email;
    private static int quantidade = 0;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        quantidade++;
        id = quantidade;
    }

    public static int getQuantidade(){
        return quantidade;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

}
