package encinas.componentes;

import encinas.interfaces.Target;

public class Vehicle implements Target {

    //PROPIEDADES

    private String disponible = "\nPuerta abierta "; // Este mensaje cambiaría si fuera bicis, patinetes
                                                    // o cualquier otro vehiculo sin puertas. En su herencia
                                                    // debería cambiar el mensaje de 'disponible'


    //CONSTRUCTOR

    public Vehicle() {
    }


    //MÉTODOS

    public void execucio(String mensaje){
        System.out.print(disponible + mensaje + "!");}
}
