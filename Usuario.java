public class Usuario {
    private int id;
    private String nome;
    private String email;
    static int contador = 0;

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
        id++;
        contador++;
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
