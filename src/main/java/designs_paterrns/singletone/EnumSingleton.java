package designs_paterrns.singletone;

/**
 * @author Michael Wagih
 */
public enum EnumSingleton {
    INSTANCE;

    public static void doSomething(){
        System.out.println(INSTANCE);
    }
}
