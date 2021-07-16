import cesar.Cesar;

public class main {
    public static void main(String[] args) {
        Cesar cesar = new Cesar(3);

        String mensaje = "Hola Chato";
        String cifrado = cesar.cifrar(mensaje);

        String mensajeCifrado="Frp ñd gh klhuur txh wlhph";
        String descifrado = cesar.descifrar(mensajeCifrado);

        System.out.println(cifrado);
        System.out.println(descifrado);
    }
}
