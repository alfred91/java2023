package ejercicio2;
import java.util.Random;

public class Password {
    private int longitud;
    private String contrasena;

    public Password() {
        this.longitud = 8;
        this.contrasena = generarPassword();
    }

    public Password(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }

    public Password(Password pass) {
        this.longitud = pass.longitud;
        this.contrasena = pass.contrasena;
    }

    public boolean esFuerte() {
        int numMayus = 0, numMinus = 0, numNumeros = 0, numSimbolos = 0;

        for (int i = 0; i < contrasena.length(); i++) {
            char c = contrasena.charAt(i);
            if (Character.isUpperCase(c)) {
                numMayus++;
            } else if (Character.isLowerCase(c)) {
                numMinus++;
            } else if (Character.isDigit(c)) {
                numNumeros++;
            } else {
                numSimbolos++;
            }
        }

        return (contrasena.length() >= 8 && numMayus > 0 && numMinus > 2 && numNumeros > 2 && numSimbolos > 0);
    }

    public String generarPassword() {
        String mayus = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minus = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%^&*()_+-={}[]|\\:;\"'<>,.?/";

        String caracteres = mayus + minus + numeros + simbolos;

        Random rnd = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int index = rnd.nextInt(caracteres.length());
            sb.append(caracteres.charAt(index));
        }

        return this.contrasena = sb.toString();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
        this.contrasena = generarPassword();
    }
}