public class UsuarioBuilder {

    private String nome;
    private String email;
    private String endereco;

    public UsuarioBuilder nome(String nome) {
        this.nome = nome;
        return this;
    }

    public UsuarioBuilder email(String email) {
        this.email = email;
        return this;
    }

    public UsuarioBuilder endereco(String endereco) {
        this.endereco = endereco;
        return this;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return endereco;
    }

    public Usuario build() {
        return new Usuario(this);
    }
}