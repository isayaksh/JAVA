package chapter_10;

import java.util.Arrays;
import java.util.List;

public class _Quiz_10 {
    public static void main(String[] args) {

        System.out.println("미술관 입장료\n-------------");
        getCustomers().stream()
                .map(c -> c.name += c.age >= 20 ? " 5000원" : " 무료")
                .forEach(System.out::println);
    }

    private static List<Customer> getCustomers() {
        return Arrays.asList(
                new Customer("챈들러", 50),
                new Customer("레이첼", 42),
                new Customer("모니카", 21),
                new Customer("벤자민", 18),
                new Customer("제임스", 5));
    }
}

class Customer {
    String name;
    int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
