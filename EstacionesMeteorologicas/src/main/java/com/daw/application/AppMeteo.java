package com.daw.application;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.daw.io.MeteoFile;
import com.daw.model.EstacionMeteorologica;
import com.daw.model.EstacionMeteorologica.Comunidad;
import com.daw.model.RegistroDatosDia;
import com.daw.service.ServicioGeneralMeteorologico;

public class AppMeteo {
    private ServicioGeneralMeteorologico servicio;
    private Scanner scanner;
    
    public AppMeteo() {
        servicio = new ServicioGeneralMeteorologico();
        scanner = new Scanner(System.in);
    }

    public void cargarDatos() {
        MeteoFile.cargarCSV();
        System.out.println("Datos cargados en memoria.");
    }

    public void mostrarMenu() {
        boolean salir = false;

        while (!salir) {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Crear estación meteorológica");
            System.out.println("2. Eliminar estación meteorológica");
            System.out.println("3. Buscar estación meteorológica por nombre");
            System.out.println("4. Buscar estación meteorológica por ID");
            System.out.println("5. Obtener temperaturas por estación");
            System.out.println("6. Obtener temperaturas por estación y año");
            System.out.println("7. Obtener temperaturas por comunidad");
            System.out.println("8. Obtener temperatura máxima registrada");
            System.out.println("9. Obtener estaciones por comunidad");
            System.out.println("10. Comprobar si hay alguna temperatura media alta");
            System.out.println("11. Borrar estaciones por comunidad");
            System.out.println("12. Obtener número de registros por comunidad");
            System.out.println("0. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    crearEstacionMeteorologica();
                    break;
                case 2:
                    eliminarEstacionMeteorologica();
                    break;
                case 3:
                    buscarEstacionPorNombre();
                    break;
                case 4:
                    buscarEstacionPorID();
                    break;
                case 5:
                    obtenerTemperaturasPorEstacion();
                    break;
                case 6:
                    obtenerTemperaturasPorEstacionYAño();
                    break;
                case 7:
                    obtenerTemperaturasPorComunidad();
                    break;
                case 8:
                    obtenerTemperaturaMaximaRegistrada();
                    break;
                case 9:
                    obtenerEstacionesPorComunidad();
                    break;
                case 10:
                    comprobarTemperaturaMediaAlta();
                    break;
                case 11:
                    borrarEstacionesPorComunidad();
                    break;
                case 12:
                    obtenerNumeroRegistrosPorComunidad();
                    break;
                case 0:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
            }
        }
        
        // Guardar los datos en los ficheros antes de salir
        MeteoFile.grabarCSV(servicio);
        System.out.println("Datos guardados en los ficheros.");
        System.out.println("Saliendo del programa...");
    }

    private void crearEstacionMeteorologica() {
        // Implementar lógica para crear una estación meteorológica
        System.out.println("Opción 'Crear estación meteorológica' seleccionada.");
    }

    private void eliminarEstacionMeteorologica() {
        // Implementar lógica para eliminar una estación meteorológica
        System.out.println("Opción 'Eliminar estación meteorológica' seleccionada.");
    }

    private void buscarEstacionPorNombre() {
        System.out.println("Opción 'Buscar estación meteorológica por nombre' seleccionada.");
        System.out.print("Ingrese el nombre de la estación: ");
        String nombre = scanner.nextLine();

        EstacionMeteorologica estacion = servicio.buscar(nombre);
        if (estacion != null) {
            System.out.println("Estación encontrada:");
            System.out.println(estacion.toString());
        } else {
            System.out.println("No se encontró ninguna estación con ese nombre.");
        }
    }

    private void buscarEstacionPorID() {
        System.out.println("Opción 'Buscar estación meteorológica por ID' seleccionada.");
        System.out.print("Ingrese el ID de la estación: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        EstacionMeteorologica estacion = servicio.buscar(id);
        if (estacion != null) {
            System.out.println("Estación encontrada:");
            System.out.println(estacion.toString());
        } else {
            System.out.println("No se encontró ninguna estación con ese ID.");
        }
    }

    private void obtenerTemperaturasPorEstacion() {
        System.out.println("Opción 'Obtener temperaturas por estación' seleccionada.");
        System.out.print("Ingrese el ID de la estación: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        List<RegistroDatosDia> registros = servicio.getTempPorEstacion(id);
        if (!registros.isEmpty()) {
            System.out.println("Temperaturas registradas para la estación:");
            for (RegistroDatosDia registro : registros) {
                System.out.println(registro.toString());
            }
        } else {
            System.out.println("No se encontraron temperaturas para esa estación.");
        }
    }

    private void obtenerTemperaturasPorEstacionYAño() {
        System.out.println("Opción 'Obtener temperaturas por estación y año' seleccionada.");
        System.out.print("Ingrese el ID de la estación: ");
        int id = scanner.nextInt();
        System.out.print("Ingrese el año: ");
        int año = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea

        List<RegistroDatosDia> registros = servicio.getTempPorAnioEstacion(id, año);
        if (!registros.isEmpty()) {
            System.out.println("Temperaturas registradas para la estación y año:");
            for (RegistroDatosDia registro : registros) {
                System.out.println(registro.toString());
            }
        } else {
            System.out.println("No se encontraron temperaturas para esa estación y año.");
        }
    }

    private void obtenerTemperaturasPorComunidad() {
        System.out.println("Opción 'Obtener temperaturas por comunidad' seleccionada.");
        System.out.print("Ingrese el nombre de la comunidad: ");
        String comunidadNombre = scanner.nextLine();
        Comunidad comunidad = Comunidad.valueOf(comunidadNombre.toUpperCase());

        List<RegistroDatosDia> registros = servicio.getTempPorComunidad(comunidad);
        if (!registros.isEmpty()) {
            System.out.println("Temperaturas registradas para la comunidad:");
            for (RegistroDatosDia registro : registros) {
                System.out.println(registro.toString());
            }
        } else {
            System.out.println("No se encontraron temperaturas para esa comunidad.");
        }
    }

    private void obtenerTemperaturaMaximaRegistrada() {
    	
        System.out.println("Opción 'Obtener temperatura máxima registrada' seleccionada.");

        RegistroDatosDia temperaturaMaxima = servicio.getTempMaxRegistrada();
       
            System.out.println(temperaturaMaxima);
        }
    

    private void obtenerEstacionesPorComunidad() {
        System.out.println("Opción 'Obtener estaciones por comunidad' seleccionada.");
        System.out.print("Ingrese el nombre de la comunidad: ");
        Comunidad comunidad = Comunidad.valueOf(scanner.nextLine());

        Map<Comunidad, List<EstacionMeteorologica>> estacionesPorComunidad = servicio.getEstacionesPorComunidad();
        List<EstacionMeteorologica> estaciones = estacionesPorComunidad.get(comunidad);

        if (estaciones != null && !estaciones.isEmpty()) {
            System.out.println("Estaciones encontradas en la comunidad:");
            for (EstacionMeteorologica estacion : estaciones) {
                System.out.println(estacion.toString());
            }
        } else {
            System.out.println("No se encontraron estaciones para esa comunidad.");
        }
    }


    private void comprobarTemperaturaMediaAlta() {
    	
        System.out.println("Opción 'Comprobar si hay alguna temperatura media alta' seleccionada.");

        boolean temperaturaAlta = servicio.isTempMediaAlta();
        if (temperaturaAlta) {
            System.out.println("Hay al menos una estación con temperatura media alta.");
        } else {
            System.out.println("No se encontraron estaciones con temperatura media alta.");
        }
    }

    private void borrarEstacionesPorComunidad() {
    	
        System.out.println("Opción 'Borrar estaciones por comunidad' seleccionada.");
        System.out.print("Ingrese el nombre de la comunidad: ");
        Comunidad comunidad = Comunidad.valueOf(scanner.nextLine());

        System.out.println("Se borraron estaciones de la comunidad.");
    }

    private void obtenerNumeroRegistrosPorComunidad() {
        System.out.println("Opción 'Obtener número de registros por comunidad' seleccionada.");
        System.out.print("Ingrese el nombre de la comunidad: ");
        Comunidad comunidad = Comunidad.valueOf(scanner.nextLine());


        Map<Comunidad, Long> numeroRegistros = servicio.getNumRegistros();
        System.out.println("Número de registros para la comunidad: " + numeroRegistros);
    }

    public static void main(String[] args) {
        AppMeteo appMeteo = new AppMeteo();
        appMeteo.cargarDatos();
        appMeteo.mostrarMenu();
    }
}
