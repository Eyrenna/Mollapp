package encinas.componentes;

import encinas.interfaces.Filtre;
import encinas.interfaces.Target;

public class ProgramadorTasques {

    //PROPIEDADES

    private Target target = null;


    //CONSTRUCTOR

    public ProgramadorTasques() {
    }

    public ProgramadorTasques(Target target) {
        this.target = target;
    }


    //MÉTODOS

    public Tasques getTasques(){}

    public void setTasca(Filtre filtre){}

    public void executar(String mensaje){}
}
