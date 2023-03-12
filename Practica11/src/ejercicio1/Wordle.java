package ejercicio1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Wordle {

    private static final ArrayList<String> diccionario = new ArrayList<>(Arrays.asList(
            "kazoo", "parch", "parar", "besar", "cabra", "manos", "botón", "basar", "canso",
            "silla", "canto", "silla", "sable", "susto", "caper", "pardo", "bajar", "bello",
            "perro", "cuota", "parte", "lunar", "miedo", "cable", "panel", "mofar", "pulir",
            "altar", "piano", "mitra", "basal", "corso"
    ));
    private static final char[] alfabeto = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private String palabraAcertar;
    private String palabraActual;
    private ArrayList<Character> letrasNoEstan;

    public Wordle() {
        Random random = new Random(LocalDate.now().toEpochDay());
        this.palabraAcertar = diccionario.get(random.nextInt(diccionario.size()));
        this.palabraActual = "";
        for (int i = 0; i < palabraAcertar.length(); i++) {
            palabraActual += "_";
        }
        this.letrasNoEstan = new ArrayList<>();
    }

    public Wordle(String palabra) {
        if (palabra.length() != 5) {
            throw new IllegalArgumentException("La palabra debe tener 5 caracteres");
        }
        this.palabraAcertar = palabra.toUpperCase();
        this.palabraActual = "";
        for (int i = 0; i < palabraAcertar.length(); i++) {
            palabraActual += "_";
        }
        this.letrasNoEstan = new ArrayList<>();
    }

    public boolean comprobar(String intento) {
        if (intento.length() != 5) {
            throw new IllegalArgumentException("El intento debe tener 5 caracteres");
        }

        boolean acertado = true;
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < palabraAcertar.length(); i++) {
            if (palabraAcertar.charAt(i) == intento.charAt(i)) {
                resultado.append(palabraAcertar.charAt(i));
            } else if (palabraAcertar.contains(String.valueOf(intento.charAt(i)))) {
                resultado.append(Character.toLowerCase(intento.charAt(i)));
                acertado = false;
            } else {
                resultado.append("_");
                letrasNoEstan.add(intento.charAt(i));
                acertado = false;
            }
        }

        palabraActual = resultado.toString();

        return acertado;
    }

    public void addNoEstan(char c) {
        letrasNoEstan.add(Character.toUpperCase(c));
    }

    public String getPalabraAcertar() {
        return palabraAcertar;
    }

    public String getPalabraActual() {
        return palabraActual;
    }

    public ArrayList<Character> getLetrasNoEstan() {
        return letrasNoEstan;
    }

    @Override
    public String toString() {
        return "Palabra: " + palabraActual.toUpperCase() + "\n" +
                "Letras NO usadas: " + letrasNoEstan.toString();
    }
}