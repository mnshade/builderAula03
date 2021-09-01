import org.junit.Test;

public class VestuarioRennerTest {
    @Test
    public void vestuarioRennerAdidasTest(){
        VestuarioRenner marcas = new VestuarioRenner();
        marcas.setMarca("Adidas")
                .setTipoPeca("Camisa manga-larga")
                .setTipoTecido("Moletom")
                .setTipoTamanho("G")
                .setTipoCor("Preto")
                .setLojaReside("Cascatinha");
    }

    @Test
    public void vestuarioRennerFilaTest(){
        VestuarioRenner marcas = new VestuarioRenner();
        marcas.setMarca("Fila")
                .setTipoPeca("Calça esportiva")
                .setTipoTecido("Poliester")
                .setTipoTamanho("G")
                .setTipoCor("Azul Marinho")
                .setLojaReside("Rio Branco");
    }
}
