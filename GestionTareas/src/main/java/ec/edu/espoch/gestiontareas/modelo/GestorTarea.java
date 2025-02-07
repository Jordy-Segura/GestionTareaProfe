
package ec.edu.espoch.gestiontareas.modelo;

public class GestorTarea {
    int tamanoVector = 5;
    Tarea[] tareas = new Tarea[tamanoVector];
    
    public String agregarTarea(Tarea tarea){
        int cont=0;
        String msg= "Ingreso exitoso";
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i]== null) {
                tareas[i].setId(i++);
                tareas[i].setTitulo(tarea.getTitulo());
                tareas[i].setDescripcion(tarea.getDescripcion());
                tareas[i].setEstado(tarea.getEstado());
            }else{
                cont++;
            }    
        }
        if (cont==tareas.length) {
            msg="El vector esta lleno";
        }
        return msg;   
    }
    public Tarea[] listarTareas(){
        
        Tarea[] auxTareas = new Tarea[tamanoVector];
        for (int i = 0; i < tareas.length; i++) {
            if (tareas[i].getEstado()) {
                auxTareas[i].setId(tareas[i].getId());
                auxTareas[i].setTitulo(tareas[i].getTitulo());
                auxTareas[i].setDescripcion(tareas[i].getDescripcion());
                auxTareas[i].setEstado(tareas[i].getEstado());
            }
        }
        return auxTareas;
    }
}
