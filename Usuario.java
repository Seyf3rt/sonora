class Usuario {

    private int id;
    private String nome;
    private String email;
    private static int contagem;

    public Usuario(String nome, String email) {

        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido: não pode ser nulo nem vazio.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("E-mail inválido: não pode ser nulo nem vazio.");
        }
        if (!email.contains("@")) {
            throw new IllegalArgumentException("E-mail inválido: \"" + email + "\" não contém @.");
        }

        this.nome = nome;
        this.email = email;
        contagem++;
        id = contagem;
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

    public static int getContagem() {
        return contagem;
    }

    public static void decContagem() {
        contagem--;
    }

}