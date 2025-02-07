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
    //private TesterControlador testercontrolador;

    public Controlador(Principal pricipal) {
        this.pricipal = pricipal;
        //this.testercontrolador = new TesterControlador();
    }

    public void agregarTarea() {

        try {
            TesterControlador testercontrolador = new TesterControlador();
            Tarea objTarea = new Tarea();
            objTarea.setTitulo(this.pricipal.getTitulo());
            objTarea.setDescripcion(this.pricipal.getDescripcion());
            objTarea.setEstado(this.pricipal.getEstado());

            if (this.pricipal != null) {
                testercontrolador.prueba(objTarea);
            }
        } catch (Exception e) {
        }
    }
}
