package designs_paterrns.singletone;

import designs_paterrns.factory.*;
import helpers.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author Michael Wagih
 */
public class TestFactoryDesignPattern {

    @Test
    void beforeFactory() {
        Computer pc = new PC("16GB", "1TB", "Core i7");
        Computer Server = new Server("128GB", "5TB", "2 x Core i7");
        Assertions.assertEquals(pc.getCPU(), "Core i7");
    }

    @Test
    void afterFactory() {
        Computer pc = ComputerFactory.getComputer(ComputerType.PC, "20GB", "2TB", "core i 9");
        Computer server = ComputerFactory.getComputer(ComputerType.SERVER, "40GB", "5TB", "core i 9");
        Assertions.assertEquals(pc.getClass().getSimpleName(), "PC");
        Assertions.assertEquals(server.getClass().getSimpleName(), "Server");
    }

    @Test
    void temp() {
        String result = "";
        StringBuilder b = new StringBuilder();
        List<String> strings = List.of("973HU2", "z6IWf", "GX96TeEf", "Q4Qj","d5IJc", "7v9PfrQe","3YY", "W915g2", "78Qjr1kn", "SeUT", "w5m");
        for (String item:strings) {
//            result = result.concat(item).concat("+");
            b.append(item).append("+");
        }
        System.out.println(b);

    }

    @Test
    void  testReflections() throws ClassNotFoundException, NoSuchMethodException, NoSuchFieldException, IllegalAccessException {
        Customer customer = new Customer();

        Field ageField = customer.getClass()
                .getDeclaredField("age");
        ageField.setAccessible(true);

        Field nameField = customer.getClass()
                .getDeclaredField("name");

        nameField.setAccessible(true);


        ageField.setByte(customer, (byte) 26);
        nameField.set(customer, "Michael");

        System.out.println(customer.getAge());


    }





}
