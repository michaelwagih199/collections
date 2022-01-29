package designs_paterrns.factory;

/**
 * @author Michael Wagih
 */
public class ComputerFactory {

    public static Computer getComputer(ComputerType type, String ram, String hdd, String cpu){
        if(type.equals(ComputerType.PC)) return new PC(ram, hdd, cpu);
        else if(type.equals(ComputerType.SERVER)) return new Server(ram, hdd, cpu);
        return null;
    }

}
