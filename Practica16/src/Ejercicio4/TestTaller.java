package Ejercicio4;
import java.util.Scanner;

public class TestTaller {
    public static void main(String[] args) {
        Taller taller = new Taller();

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n=== TALLER ===");
            System.out.println("1. Ingresar coche");
            System.out.println("2. Coche reparado");
            System.out.println("3. Buscar coche");
            System.out.println("4. Listar coches en taller");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opcion:");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: // ingresar coche
                    System.out.println("Ingrese la matricula:");
                    String matricula = scanner.next();
                    System.out.println("Ingrese la marca:");
                    String marca = scanner.next();
                    System.out.println("Ingrese el modelo:");
                    String modelo = scanner.next();
                    System.out.println("Ingrese el color:");
                    String color = scanner.next();
                    System.out.println("Ingrese el precio:");
                    double precio = scanner.nextDouble();
                    System.out.println("Ingrese los caballos de fuerza:");
                    double caballos = scanner.nextDouble();
                    System.out.println("Ingrese el estado (en reparacion o reparado):");
                    String estado = scanner.next();
                    System.out.println("Ingrese el tipo de vehiculo (1. Fosil, 2. Electrico, 3. Hibrido):");
                    int tipoVehiculo = scanner.nextInt();
                    switch (tipoVehiculo) {
                    case 1: // vehiculo fosil
                        System.out.println("Ingrese la capacidad del deposito:");
                        double capacidadDeposito = scanner.nextDouble();
                        System.out.println("Ingrese el tipo de fosil (Gasolina o Diesel):");
                        String tipoFosil = scanner.next();
                        VehiculoFosil vehiculoFosil = new VehiculoFosil(matricula, marca, modelo, color, precio, caballos, estado, capacidadDeposito, tipoFosil);
                        taller.ingresarVehiculo(vehiculoFosil);
                        break;
                    case 2: // vehiculo electrico
                        System.out.println("Ingrese la capacidad de la bateria:");
                        double kw = scanner.nextDouble();
                        VehiculoElectrico vehiculoElectrico = new VehiculoElectrico(matricula, marca, modelo, color, precio, caballos, estado, kw);
                        taller.ingresarVehiculo(vehiculoElectrico);
                        break;
                    case 3: // vehiculo hibrido
                        System.out.println("Ingrese la capacidad de la bateria:");
                        kw = scanner.nextDouble();
                        System.out.println("Ingrese el tipo de fosil (Gasolina o Diesel):");
                        tipoFosil = scanner.next();
                        System.out.println("Ingrese la capacidad del deposito:");
                        double capacidadDepositoH = scanner.nextDouble();
                        VehiculoHibrido vehiculoHibrido = new VehiculoHibrido(matricula, marca, modelo, color, precio, caballos, estado, kw, tipoFosil, capacidadDepositoH);
                        taller.ingresarVehiculo(vehiculoHibrido);
                        break;
                }
                break;
                
                case 2: // coche reparado
                    System.out.println("Ingrese la matricula del vehiculo reparado:");
                    String matriculaReparado = scanner.next();
                    Vehiculo vehiculoReparado = taller.buscarVehiculo(matriculaReparado);
                    if (vehiculoReparado == null) {
                        System.out.println("El vehiculo no esta registrado en el taller");
                    } else if (vehiculoReparado.getEstado().equals("reparado")) {
                        System.out.println("El vehiculo ya ha sido reparado");
                    } else {
                        vehiculoReparado.setEstado("reparado");
                        System.out.println("El vehiculo ha sido reparado con exito");
                    }
                    break;
                case 3: // buscar por matricula
                    System.out.println("Ingrese la matricula del vehiculo:");
                    String matriculaBuscada = scanner.next();
                    Vehiculo vehiculoEncontrado = taller.buscarVehiculo(matriculaBuscada);
                    if (vehiculoEncontrado != null) {
                        System.out.println("Vehiculo encontrado:");
                        System.out.println(vehiculoEncontrado.toString());
                    } else {
                        System.out.println("No se encontró ningún vehiculo con la matricula " + matriculaBuscada);
                    }
                    break;

                case 4: // listar coches en el taller
                    ArrayList<Vehiculo> vehiculosEnTaller = taller.getVehiculos();
                    System.out.println("Vehiculos en el taller:");
                    for (Vehiculo v : vehiculosEnTaller) {
                        System.out.println(v.toString());
                    }
                    break;

                case 5: // salir del programa
                    System.out.println("Gracias por utilizar el programa.");
                    continuar = false;
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
                }