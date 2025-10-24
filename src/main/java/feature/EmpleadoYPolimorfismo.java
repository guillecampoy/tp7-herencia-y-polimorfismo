package feature;

import core.Ejecutable;
import core.polimorfismo.Empleado;
import core.polimorfismo.EmpleadoPlanta;
import core.polimorfismo.EmpleadoTemporal;
import utils.ContextColor;
import utils.UtilsColor;

import java.util.ArrayList;

public class EmpleadoYPolimorfismo implements Ejecutable {
    @Override
    public void execute() {
        ArrayList<Empleado> empleados = new ArrayList<>();

        empleados.add(new EmpleadoPlanta("Luis Bacigalupo", 1500000.00));
        empleados.add(new EmpleadoTemporal("Jorge Escudero", 15, 30000));
        empleados.add(new EmpleadoPlanta("Pepe Mujica", 1600000.30));
        empleados.add( new EmpleadoTemporal("Mauri Macri", 35, 50000));
        empleados.add( new EmpleadoPlanta("Rosa Meloni", 2500000.00));
        empleados.add( new EmpleadoTemporal("Silvia Cortes", 20, 45000));
        empleados.add(new EmpleadoPlanta("Jorge Luis Borges", 1800000.00));
        empleados.add(new EmpleadoTemporal("Jose Luis Chilavert", 44, 28000));
        empleados.add(new EmpleadoPlanta("Burrito Ortega", 2000000.00));
        empleados.add(new EmpleadoTemporal("Tata Martino", 50, 35000));

        UtilsColor.imprimirBloque(ContextColor.INFO, "Listado de empleados");
        for (Empleado empleado : empleados) {
            UtilsColor.imprimirBloque(ContextColor.DEFAULT, empleado.getNombre()
                    + " cobra $"+String.format("%.2f", empleado.calcularSueldo()));

            // Uso de instanceof
            if (empleado instanceof EmpleadoPlanta) {
                UtilsColor.imprimirBloque (ContextColor.INFO, "→ Es empleado de planta");
            } else if (empleado instanceof EmpleadoTemporal) {
                UtilsColor.imprimirBloque (ContextColor.WARNING, "→ Es empleado temporal");
            }

            UtilsColor.imprimirBloque (ContextColor.DEFAULT,"--------------------------------");
        }
    }
}
