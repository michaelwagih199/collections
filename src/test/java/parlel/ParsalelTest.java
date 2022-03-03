package parlel;

import helpers.Customer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author Michael Wagih
 */
public class ParsalelTest {

    @Test
    void parallelTest() {
        List<String> dummy = new ArrayList();

        for (int i = 0; i < 10000; i++) {
            dummy.add("ITEM :".concat(String.valueOf(i)));
        }

        boolean parallel = dummy.stream()
                .parallel()
                .isParallel();

        Assertions.assertTrue(parallel);
    }

    @Test
    public void testParallel2(){
        List<Integer> numbers = Arrays.asList(8, 2, 20, 4, 9,null);
        List<Integer> nums = numbers.parallelStream()
                .filter(entry -> entry != null)
                .map(n -> n*2)
                .filter(integer -> integer>10)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(nums);
    }

    @Test
    public void test(){
        Supplier<Stream<String>> streamSupplier =
                () -> Stream.of("d2", "a2", "b1", "b3", "c",null,"")
                        .filter(s -> s != null)
                        .filter(s -> s.startsWith("a"));

        Supplier<Stream<String>> customerSupplier =
                () -> Stream.of(new Customer("Johan",978),
                        new Customer("Mariam",659)
                        ,new Customer(null,0))
                        .filter(customer -> customer.getName() != null)
                        .filter(customer -> customer.getName().contains("a"))
                        .map(customer -> customer.getName().toUpperCase());

        customerSupplier.get().forEach(System.out::println);

    }

}
