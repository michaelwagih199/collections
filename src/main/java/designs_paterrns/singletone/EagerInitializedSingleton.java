package designs_paterrns.singletone;

/**
 * @author Michael Wagih
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton eagerInitialized = new EagerInitializedSingleton();

     EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance(){
         return eagerInitialized;
    }

    public String greet(){
         return "Hello EagerInitializedSingleton";
    }
}
