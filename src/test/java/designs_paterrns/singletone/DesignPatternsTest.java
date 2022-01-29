package designs_paterrns.singletone;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Michael Wagih
 */
public class DesignPatternsTest {

    @Test
    void testLazyInitiationSingleton() {
        LazyInitializedSingleton lazy1 = LazyInitializedSingleton.getInstance();
        LazyInitializedSingleton lazy2 = LazyInitializedSingleton.getInstance();
        assertEquals(lazy1, lazy2);
    }

    @Test
    void testLazyInitiationInMultiThread() {
        final LazyInitializedSingleton[] lazy1 = {null};
        final LazyInitializedSingleton[] lazy2 = {null};

        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
            lazy1[0] = LazyInitializedSingleton.getInstance();
            lazy2[0] = LazyInitializedSingleton.getInstance();
        };
        Runnable task2 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
            lazy1[0] = LazyInitializedSingleton.getInstance();
            lazy2[0] = LazyInitializedSingleton.getInstance();
        };

        task.run();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task2);
        thread1.start();
        thread2.start();

        System.out.println(lazy1[0].equals(lazy2[0]));
    }

    @Test
    void threaSafe() {
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
            ThreadSafeSingleton threadSafeSingleton = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            ThreadSafeSingleton threadSafeSingleton2 = ThreadSafeSingleton.getInstanceUsingDoubleLocking();
            System.out.println(threadSafeSingleton.equals(threadSafeSingleton2));
        };

        task.run();
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }

    @Test
    void testBillPughSingleton() {
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton2 = BillPughSingleton.getInstance();
        assertEquals(billPughSingleton1, billPughSingleton2);
    }

    @Test
    void testDestroySingletonUsingReflections() {
        EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instanceTwo = null;
        try {
            Constructor[] constructors = EagerInitializedSingleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                //Below code will destroy the singleton pattern
                constructor.setAccessible(true);
                instanceTwo = (EagerInitializedSingleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertNotEquals(instanceOne, instanceTwo);
    }
}
