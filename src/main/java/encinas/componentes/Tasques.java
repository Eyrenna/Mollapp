package encinas.componentes;

import encinas.interfaces.Filtre;
import encinas.interfaces.Target;

import java.util.ArrayList;
import java.util.List;

public class Tasques {

    //PROPIEDADES

    private Target target = null;
    private List<Filtre> filtres = new ArrayList<>();

    //CONSTRUCTOR

    public Tasques() {
    }


    //MÉTODOS

    public List<Filtre> getTasques(){
        return filtres;
    }

    public void afegirTasca(Filtre filtre){
        getTasques().add(filtre);
    }

    public void setTarget(Target target){
        this.target = target;
    }

    public Target getTarget(){
        return this.target;
    }

    public void execucio(String mensaje){
        for (Filtre tasca : getTasques()){
            tasca.execucio(mensaje);
        }
        getTarget().execucio(mensaje);
    }
}
