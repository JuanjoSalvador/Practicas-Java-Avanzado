package cesar;

public class Cesar {

    int desplazamiento;

    String uppercase = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
    String lowercase = "abcdefghijklmnñopqrstuvwxyz";

    public Cesar(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public String cifrar(String mensaje) {
        StringBuffer result = new StringBuffer();
        char ch;

        for (int i = 0; i < mensaje.length(); i++) {
            if (!Character.isWhitespace(mensaje.charAt(i))) {
                if (Character.isUpperCase(mensaje.charAt(i))) {
                    ch = uppercase.charAt(uppercase.indexOf(mensaje.charAt(i)) + desplazamiento);
                } else {
                    ch = lowercase.charAt(lowercase.indexOf(mensaje.charAt(i)) + desplazamiento);
                }

                result.append(ch);
            } else {
                result.append(" ");
            }
        }
        return result.toString();
    }

    // Decrypts cipher using shift
    public String descifrar(String mensaje) {
        StringBuffer result = new StringBuffer();
        char ch;

        for (int i = 0; i < mensaje.length(); i++) {
            if (!Character.isWhitespace(mensaje.charAt(i))) {
                if (Character.isUpperCase(mensaje.charAt(i))) {
                    ch = uppercase.charAt(uppercase.indexOf(mensaje.charAt(i)) - desplazamiento);
                } else {
                    ch = lowercase.charAt(lowercase.indexOf(mensaje.charAt(i)) - desplazamiento);
                }

                result.append(ch);
            } else {
                result.append(" ");
            }
        }
        return result.toString();
    }
}
