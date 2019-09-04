package encinas.componentes;

import encinas.interfaces.Filtre;

public class Autoritzacio implements Filtre {

    //CONSTRUCTOR

    public Autoritzacio() {
    }


    //MÉTODOS

    public void execucio(String mensaje){
        System.out.print("\nAutoritzación OK para " + mensaje);}
}
