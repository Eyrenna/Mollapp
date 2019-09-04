package encinas;

import encinas.componentes.ProgramadorTasques;
import encinas.interfaces.Client;

public class Mollapp implements Client {

    //PROPIEDADES

    private ProgramadorTasques programador = null;

    //CONSTRUCTOR

    public Mollapp() {
    }


    //MÉTODOS

    public void setProgramadorTasques(ProgramadorTasques programador){
        this.programador = programador;
    }

    public void enviarPeticio(String peticio){
        programador.executarTasques(peticio);
    }
}
