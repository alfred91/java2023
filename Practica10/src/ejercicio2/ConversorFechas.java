package ejercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ConversorFechas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una fecha en formato normal (dd/mm/yyyy): ");
        String fechaNormal = scanner.nextLine();
        System.out.println("Fecha en formato americano: " + normalToAmericano(fechaNormal));
        System.out.print("Introduce una fecha en formato americano (mm/dd/yyyy): ");
        String fechaAmericana = scanner.nextLine();
        System.out.println("Fecha en formato normal: " + americanoToNormal(fechaAmericana));
    }

    public static String normalToAmericano(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate date = LocalDate.parse(fecha, formatter);
        formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return date.format(formatter);
    }

    public static String americanoToNormal(String fecha) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(fecha, formatter);
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return date.format(formatter);
    }
}