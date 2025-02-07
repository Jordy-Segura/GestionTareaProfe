package ec.edu.espoch.gestiontareas.controlador;

import ec.edu.espoch.gestiontareas.modelo.Tarea;
import ec.edu.espoch.gestiontareas.tester.TesterControlador;
import ec.edu.espoch.gestiontareas.vista.Principal;

/**
 *
 * @author User
 */
public class Controlador {

    private Principal pricipal;
    private TesterControlador gestorTarea;
    //Cuando hagas conexion con el modelo --> quita los /// de la linea 17
    //private GestorTarea gestorTarea;

    public Controlador(Principal pricipal) {
        this.pricipal = pricipal;
        //Cambia el constructor de la clase modelo
        this.gestorTarea = new TesterControlador();
    }

    public void agregarTarea() {

        try {
            if (this.pricipal != null) {
                Tarea objTarea = new Tarea();
                objTarea.setTitulo(this.pricipal.getTitulo());
                objTarea.setDescripcion(this.pricipal.getDescripcion());
                objTarea.setEstado(this.pricipal.getEstado());
                gestorTarea.prueba(objTarea);

            } else {
                pricipal.error("Completa los datos!");
            }
        } catch (Exception e) {
            pricipal.error("Consulta al ing Pedro");
        }
    }
}
