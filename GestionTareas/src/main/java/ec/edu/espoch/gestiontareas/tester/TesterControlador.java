package ec.edu.espoch.gestiontareas.tester;

import ec.edu.espoch.gestiontareas.controlador.Controlador;
import ec.edu.espoch.gestiontareas.modelo.Tarea;

/**
 *
 * @author User
 */
public class TesterControlador {

    public void prueba(Tarea objTarea) {
        System.out.println("Titulo: " + objTarea.getTitulo());
        System.out.println("Descripcion: " + objTarea.getDescripcion());
        System.out.println("Estado: " + objTarea.getEstado());
    }

}
