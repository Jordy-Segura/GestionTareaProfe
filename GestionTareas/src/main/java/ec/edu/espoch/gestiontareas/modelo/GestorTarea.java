package ec.edu.espoch.gestiontareas.modelo;

public class GestorTarea {

    int tamanoVector = 5;
    Tarea[] tareas = new Tarea[tamanoVector];
    int cont = 0;

    public String agregarTarea(Tarea tarea) {
        String msg = "Ingreso exitoso";
        if (tareas.length != cont) {
            for (int i = 0; i < tareas.length; i++) {
                if (tareas[i] == null) {
                    //inicializar el objeto
                    tareas[i] = new Tarea();
                    tareas[i].setId(i);
                    tareas[i].setTitulo(tarea.getTitulo());
                    tareas[i].setDescripcion(tarea.getDescripcion());
                    tareas[i].setEstado(tarea.getEstado());
                    cont++;
                    //con esto me aseguro que los datos solo se ingresen una vez en el vector. 
                    return msg;
                }
            }
        } else {
                msg = "Ingreso no permitido, el vector esta lleno";
        }
        return msg;
    }

    public Tarea[] listarTareas() {

        Tarea[] auxTareas = new Tarea[tamanoVector];
        for (int i = 0; i < cont; i++) {

            //if (tareas[i].getEstado()) {
            auxTareas[i] = new Tarea();
            auxTareas[i].setId(tareas[i].getId());
            auxTareas[i].setTitulo(tareas[i].getTitulo());
            auxTareas[i].setDescripcion(tareas[i].getDescripcion());
            auxTareas[i].setEstado(tareas[i].getEstado());
            System.out.println("Modelo-listarTarea" + auxTareas[i].getEstado());
            // }
        }
        return auxTareas;
    }
}
