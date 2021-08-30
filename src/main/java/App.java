public class App {
    public static void main(String[] args) {

        Usuario usuario = new UsuarioBuilder()
                .nome("João")
                .email("João@joão.com")
                .endereco("Rua Trinta das onze")
                .build();

        System.out.println(usuario.toString());
    }
}