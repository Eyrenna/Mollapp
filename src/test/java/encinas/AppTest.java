package encinas;

import static org.junit.Assert.assertEquals;

import encinas.componentes.Autenticacio;
import encinas.componentes.Autoritzacio;
import encinas.componentes.ProgramadorTasques;
import encinas.componentes.Vehicle;
import org.junit.Before;
import org.junit.Test;

public class AppTest {

    //VARIABLES

    private ProgramadorTasques prog;
    private Vehicle bici;

    //BEFORE

    @Before
    public void init(){
        bici = new Vehicle();
        prog = new ProgramadorTasques(bici);
    }

    //TEST

    @Test
    public void sizeFiltres(){
        prog.setTasca(new Autoritzacio());
        assertEquals(1, prog.getTasques().getTasques().size());
        prog.setTasca(new Autenticacio());
        assertEquals(2, prog.getTasques().getTasques().size());
        prog.setTasca(new Autenticacio());
        assertEquals(3, prog.getTasques().getTasques().size());
    }
}
