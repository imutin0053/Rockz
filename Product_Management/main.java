package Product_Management;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class main {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Laptop", 100000),
                new Product(2, "Mobile", 50000),
                new Product(3, "Watch", 1000),
                new Product(4, "Mouse", 700),
                new Product(5, "Keyborad", 1900));
        System.out.println("Products with price >2000: ");
        products.stream()
                .filter(p -> p.getPrice() > 2000)
                .forEach(System.out::println);
        Optional<Product> product = products.stream()
                .filter(p -> p.getId() == 1)
                .findFirst();
        product.ifPresent(System.out::println);
    }
}
