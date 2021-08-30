public class Usuario {

    private String nome;
    private String email;
    private String endereco;

    Usuario(UsuarioBuilder usuarioBuilder) {
        this.nome = usuarioBuilder.getNome();
        this.email = usuarioBuilder.getEmail();
        this.endereco = usuarioBuilder.getEndereco();
    }

    @Override
    public String toString() {
        return "Nome= " + nome + '\'' +
                ", E-mail='" + email + '\'' +
                ", Endereco='" + endereco + '\'';
    }
}