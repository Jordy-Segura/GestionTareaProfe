package ec.edu.espoch.gestiontareas.tester;

import ec.edu.espoch.gestiontareas.vista.Principal;

public class TesterVista {

    private Principal principal;

    public TesterVista(Principal principal) {
        this.principal = principal;
    }

    public void prueba() {
        //Principal principal=new Principal();
        try {
            System.out.println("Titulo: " + principal.getTitulo());
            System.out.println("Descripcion: " + principal.getDescripcion());
            System.out.println("Estado: " + principal.getEstado());

        } catch (NumberFormatException e) {
            //vista.mostrarError("Error cambiate a ambiental");
        }

    }
}
