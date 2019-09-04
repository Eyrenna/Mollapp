package encinas.componentes;

import encinas.interfaces.Filtre;
import encinas.interfaces.Target;

public class ProgramadorTasques {

    //PROPIEDADES

    private Tasques tasques = new Tasques();

    //CONSTRUCTOR

    public ProgramadorTasques() {
    }

    public ProgramadorTasques(Target target) {
         tasques.setTarget(target);
    }


    //MÉTODOS

    public Tasques getTasques(){
        return this.tasques;
    }

    public void setTasca(Filtre filtre){
        getTasques().afegirTasca(filtre);
    }

    public void executarTasques(String mensaje){
        tasques.getTarget().execucio(mensaje);
    }
}
