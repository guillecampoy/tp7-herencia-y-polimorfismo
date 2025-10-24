package app;

import core.Ejecutable;
import feature.AnimalesYComportamientoSobrecarg;
import feature.EmpleadoYPolimorfismo;
import feature.FigurasGeomMetodosAbstractos;
import feature.VehiculoHerenciaBasica;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = leerOpcion();
            Ejecutable ejercicio = obtenerEjercicio(opcion);
            if (ejercicio != null) {
                ejercicio.execute();
            } else if (opcion != 0) {
                System.out.println("Opción no válida");
            }
            if (opcion != 0) {
                System.out.println("Presiona Enter para continuar...");
                scanner.nextLine();
            }

        }
        while (opcion != 0);
        System.out.println("Chau!");
        scanner.close();
    }

    private static void mostrarMenu() {
        UtilsColor.imprimirBloque(ContextColor.WARNING,"\n===========================================================");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"   Trabajo Práctico 7 - Herencia y Polimorfismo");
        UtilsColor.imprimirBloque(ContextColor.WARNING,"===========================================================");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"1. Vehículos y herencia básica");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"2. Figuras geométricas y métodos abstractos");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"3. Empleados y polimorfismo");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"3. Animales y comportamiento sobrescrito");
        UtilsColor.imprimirBloque(ContextColor.DEFAULT,"0. Salir");
        UtilsColor.imprimirBloque(ContextColor.INFO,"Seleccionae una opcion", 'n');
    }

    private static int leerOpcion () {
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }

    private static Ejecutable obtenerEjercicio(int opcion) {
        return switch (opcion) {
            case 1  -> new VehiculoHerenciaBasica();
            case 2  -> new FigurasGeomMetodosAbstractos();
            case 3  -> new EmpleadoYPolimorfismo();
            case 4  -> new AnimalesYComportamientoSobrecarg();
            default -> null;
        };
    }
}
