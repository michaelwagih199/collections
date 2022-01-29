package designs_paterrns.singletone;

import designs_paterrns.factory.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Michael Wagih
 */
public class TestFactoryDesignPattern {

    @Test
    void beforeFactory(){
        Computer pc = new PC("16GB","1TB","Core i7");
        Computer Server = new Server("128GB","5TB","2 x Core i7");
        Assertions.assertEquals(pc.getCPU(),"Core i7");
    }

    @Test
    void afterFactory(){
        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "20GB", "2TB", "core i 9");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "40GB", "5TB", "core i 9");
        Assertions.assertEquals(pc.getClass().getSimpleName(),"PC");
        Assertions.assertEquals(server.getClass().getSimpleName(),"Server");
    }

}
