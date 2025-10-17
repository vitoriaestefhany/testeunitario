package aula0810.testeunitario;

public class ValidadorSenhaTest {

    public static boolean validar(String senha) {
        if (senha == null || senha.isEmpty()) {
            return false;
        }
        if (senha.length() < 6) { // Exemplo: mínimo de 6 caracteres
            return false;
        }
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) temMaiuscula = true;
            else if (Character.isLowerCase(c)) temMinuscula = true;
            else if (Character.isDigit(c)) temNumero = true;
        }

        return temMaiuscula && temMinuscula && temNumero;
    }
}