package collections.interfaces;

import java.util.*;
import java.util.stream.IntStream;

public class CollectionDemo {

    public static void main(String[] args) {

/**
 * set
 */
        Set<String> set1 = Set.of("Hello", "World", "1", "2", "3", "4");
        Set<String> tree1 = new TreeSet<>();

        tree1.addAll(Set.of("Hello", "World", "1", "2", "3", "4"));
        tree1.removeAll(Set.of("Hello", "1", "2"));


/**
 * Map
 */


        Map<String, Customer> map = new HashMap<>();
        Customer customer = new Customer("123", "Michael wagih");
        Customer customer2 = new Customer("124", "Mena Fady");
        Customer customer3 = new Customer("125", "Maged Latif");

        map.put(customer.getCustomerId(), customer);
        map.put(customer2.getCustomerId(), customer2);
        map.put(customer3.getCustomerId(), customer3);
        Order order = new Order("123");

        Customer customerForOrder = map.get(order.getCustomerId());

        System.out.println(customerForOrder);

        Map<String, String> myMap = new HashMap<>();
        myMap.put("apc", null);
        System.out.println(myMap.get("apc"));

        map.forEach((s, customer1) -> System.out.println(s));

/**
 * Quoue
 */

        Queue<Customer> myQueue = new ArrayDeque<>();
        myQueue.add(new Customer("1","Mena"));
        myQueue.offer(new Customer("3","Maged"));


        System.out.println(myQueue);

//        Iterator<String> iterator = set1.iterator();
//        while (iterator.hasNext()) {
//            String next = iterator.next();
//            System.out.println(next);
//        }


//        IntStream.rangeClosed(0, 10).forEach(value -> {
//            StringBuilder names = new StringBuilder("Name").append(value);
//            strings.add(String.valueOf(names));
//        });

        // collections.stream().map(s -> {
        // return s.toUpperCase();
        // }).forEach(System.out::println);

    }

}

class Customer {
    private String customerId;
    private String customerName;

    public Customer() {
    }

    public Customer(String customerId, String customerName) {
        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", customerName='" + customerName + '\'' +
                '}';
    }
}

class Order {
    private String customerId;

    public Order(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
}
