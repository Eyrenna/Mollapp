package encinas.interfaces;

import encinas.componentes.ProgramadorTasques;

public interface Client {

    //MÉTODOS

    void setProgramadorTasques(ProgramadorTasques programador);

    void enviarPeticio(String peticion);
}
