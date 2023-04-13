package Ejercicio4;
import java.util.ArrayList;
import java.util.Scanner;

public class TestTaller {
	
    public static void main(String[] args) {
        Taller taller = new Taller();

		Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("\n=== TALLER ===");
            System.out.println("1. Ingresar coche");
            System.out.println("2. Coche reparado");
            System.out.println("3. Buscar coche");
            System.out.println("4. Listar coches en taller");
            System.out.println("0. Salir");
            System.out.println("Ingrese una opcion:");

            opcion = sc.nextInt();

            switch (opcion) {
                case 1: // ingresar coche
                    System.out.println("matricula:");
                    String matricula = sc.next();
                    System.out.println("marca:");
                    String marca = sc.next();
                    System.out.println("modelo:");
                    String modelo = sc.next();
                    System.out.println("color:");
                    String color = sc.next();
                    System.out.println("precio:");
                    double precio = sc.nextDouble();
                    System.out.println("CV:");
                    int CV = sc.nextInt();
                    System.out.println("Estado (en reparacion true o reparado false):");
                    boolean estado = sc.next() != null;
                    System.out.println("Tipo de vehiculo (1. Fosil, 2. Electrico, 3. Hibrido):");
                    int tipoVehiculo = sc.nextInt();
                    switch (tipoVehiculo) {
                    case 1: // vehiculo fosil
                        System.out.println("Ingrese la capacidad del deposito:");
                        int capacidadDeposito = sc.nextInt();
                        System.out.println("Ingrese el tipo de fosil (Gasolina o Diesel):");
                        String tipoFosil = sc.next();
                        VehiculoFosil vehiculoFosil = new VehiculoFosil(matricula, marca, modelo, color, precio, CV, estado, CV, null);
                        taller.ingresarVehiculo(vehiculoFosil);
                        break;
                    case 2: // vehiculo electrico
                        System.out.println("Ingrese la capacidad de la bateria:");
                        int kw = sc.nextInt();
                        VehiculoElectrico vehiculoElectrico = new VehiculoElectrico(matricula, marca, modelo, color, precio, CV, estado, kw);
                        taller.ingresarVehiculo(vehiculoElectrico);
                        break;
                    case 3: // vehiculo hibrido
                        System.out.println("Ingrese la capacidad de la bateria:");
                        kw = sc.nextInt();
                        System.out.println("Ingrese el tipo de fosil (Gasolina o Diesel):");
                        tipoFosil = sc.next();
                        System.out.println("Ingrese la capacidad del deposito:");
                        double capacidadDepositoH = sc.nextDouble();
                        VehiculoHibrido vehiculoHibrido = new VehiculoHibrido(matricula, marca, modelo, color, precio, CV, estado, null, kw, CV);
                        taller.ingresarVehiculo(vehiculoHibrido);
                        break;
                }
                break;
                
                case 2: // coche reparado
                    System.out.println("Ingrese la matricula del vehiculo reparado:");
                    String matriculaReparado = sc.next();
                    Vehiculo vehiculoReparado = taller.buscarVehiculo(matriculaReparado);
                    if (vehiculoReparado == null) {
                        System.out.println("El vehiculo no esta registrado en el taller");
                    } else if (vehiculoReparado.isReparado()==true) {
                        System.out.println("El vehiculo ya ha sido reparado");
                    }
                    break;
                case 3: // buscar por matricula
                    System.out.println("Ingrese la matricula del vehiculo:");
                    String matriculaBuscada = sc.next();
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
                    System.out.println("Tastalue!");
                  break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }}
            
        while (opcion!=0);
       }}             