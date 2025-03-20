package com.endes.entidad;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase que gestiona una lista de empleados dentro de la empresa.
 */
public class Plantilla {
    private List<Empleado> empleados;

    /**
     * Constructor de la clase Plantilla.
     * Inicializa la lista de empleados.
     */
    public Plantilla() {
        empleados = new ArrayList<>();
      
    }

    /**
     * Agrega un nuevo empleado a la plantilla.
     *
     * @param empleado El empleado a contratar.
     * @throws IllegalAccessException Si el empleado tiene el mismo DNI
     * @throws IllegalArgumentException Si el empleado es nulo.
     */
<<<<<<< HEAD
    public void contratarEmpleado(Empleado empleado) throws IllegalAccessException {
        if (empleado == null) {
=======
    public void contratarEmpleado(Empleado empleado) {
       if (empleado == null) {
>>>>>>> prueba/plantilla
            throw new IllegalArgumentException("No se puede contratar un empleado nulo");
        }else {
        	  if (empleado.getDni() == empleado.getDni()) {
              	throw new IllegalArgumentException("El empleado con DNI 11111111H ya está contratado");
              }
        }
        empleados.add(empleado);
<<<<<<< HEAD
        if (empleado.getDni() == empleado.getDni()) {
        	throw new IllegalAccessException("No se puede contratar a un empleado con el mismo DNI que otro");
        }
        empleados.add(empleado);
=======
      
>>>>>>> prueba/plantilla
    }

    /**
     * Busca empleados por nombre o apellido.
     *
     * @param filtroNombre Nombre o apellido a buscar.
     * @return Lista de empleados que coincidan con el filtro.
     * @throws RuntimeException Si no se encuentra ningún empleado.
     */
    public List<Empleado> getEmpleadosPorNombre(String filtroNombre) {
        return empleados.stream()
                .filter(e -> e.getNombre().contains(filtroNombre) || e.getApellidos().contains(filtroNombre))
                .toList();
    }
}
