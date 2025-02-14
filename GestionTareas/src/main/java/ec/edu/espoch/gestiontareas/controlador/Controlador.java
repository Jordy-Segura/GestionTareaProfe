package ec.edu.espoch.gestiontareas.controlador;

import ec.edu.espoch.gestiontareas.modelo.GestorTarea;
import ec.edu.espoch.gestiontareas.modelo.Tarea;
import ec.edu.espoch.gestiontareas.tester.TesterControlador;
import ec.edu.espoch.gestiontareas.vista.ListarIU;
import ec.edu.espoch.gestiontareas.vista.Principal;

/**
 *
 * @author User
 */
public class Controlador {

    private Principal principal;
    private GestorTarea gestorTarea;
    private ListarIU listarIU;
    //Cuando hagas conexion con el modelo --> quita los /// de la linea 17
    //private GestorTarea gestorTarea;

    public Controlador(Principal principal, ListarIU listarIU) {
        this.principal = principal;
        this.listarIU= listarIU;
        //Cambia el constructor de la clase modelo
        this.gestorTarea = new GestorTarea();
    }

    public void agregarTarea() {

        try {
            if (this.principal != null) {
                Tarea objTarea = new Tarea();
                objTarea.setTitulo(this.principal.getTitulo());
                objTarea.setDescripcion(this.principal.getDescripcion());
                objTarea.setEstado(this.principal.getEstado());
                String msm = gestorTarea.agregarTarea(objTarea);
                principal.error(msm);

            } else {
                principal.error("Completa los datos!");
            }
        } catch (Exception e) {
            principal.error("Error controlado:" + e);
        }
    }

    public void listarTarea() {

        try {
            String msm = "";
            Tarea[] tareas = new Tarea[5];
            tareas = gestorTarea.listarTareas();
            if (tareas != null) {
                String lista = "";
                for (int i = 0; i < tareas.length; i++) {
                    if (tareas[i] != null) {
                        lista = lista + "id:" + tareas[i].getId() + "\n"
                                + "Titulo:" + tareas[i].getTitulo() + "\n"
                                + "Descripcion:" + tareas[i].getDescripcion() + "\n"
                                + "Estado:" + tareas[i].getEstado() + "\n";
                    }
                }
                msm = lista;
            } else {
                msm = "No hay datos que mostrar";
            }
            listarIU.mostrarDatos(msm);

        } catch (Exception e) {
            System.out.println("Error Controlador-listarTarea: " + e);
        }
    }
}
