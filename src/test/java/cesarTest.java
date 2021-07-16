import cesar.Cesar;
import org.junit.Test;
import org.junit.Assert;

public class cesarTest{

    private Cesar cesar = new Cesar(3);

    @Test
    public void cifrarTest(){

        String mensaje="Hola Chato";
        String cifrado=cesar.cifrar(mensaje);
        Assert.assertNotNull(cifrado);
        Assert.assertEquals("Krñd Fkdwr", cifrado);
    }

    @Test
    public void cifrarNullTest(){
        String mensaje=null;
        Assert.assertThrows(NullPointerException.class, () -> cesar.cifrar(mensaje));
    }

    @Test
    public void descifrarTest(){
        String mensajeCifrado="Frp ñd gh klhuur txh wlhph";
        String descifrado = cesar.descifrar(mensajeCifrado);
        Assert.assertNotNull(descifrado);
        Assert.assertEquals("Con la de hierro que tiene", descifrado);
    }

    @Test
    public void descifrarNullTest(){
        String mensajeCifrado=null;
        Assert.assertThrows(NullPointerException.class, () -> cesar.descifrar(mensajeCifrado));
    }
}