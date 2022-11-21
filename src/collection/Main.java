package collection;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ProductAlreadyExistsExceptions {

        Product orange = new Product("Апельсин", 120, 2);
        Product apple = new Product("Яблоко", 90, 1.5);
        Product pear = new Product("Груша", 115, 1.8);
        Product watermelon = new Product("Арбуз", 70, 4.5);
        Product peach = new Product("Персик", 150, 2.4);

        ProductList productList = new ProductList();
        productList.addProduct(orange);
        productList.addProduct(apple);
        productList.addProduct(pear);
        productList.addProduct(watermelon);
        productList.addProduct(peach);
        System.out.println(productList);
        numbersSetRemoveEven();
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        System.out.println(multiplicationTable);
        Task task = new Task(3, 4);
        Task task2 = new Task(4, 3);
        Set<Task> set = new HashSet<>();
        set.add(task);
        set.add(task2);
        System.out.println(set);

        Passport petrov = new Passport( 443276991,"Петров", "Петр",
                LocalDate.of(1990, 12, 12));
        Passport ivanov = new Passport( 245216941,"Иванов", "Иван",
                LocalDate.of(1995, 10, 11));
        Passport pushkin = new Passport( 231298003,"Пушкин", "Максим",
                LocalDate.of(1998, 4, 12));
        System.out.println(petrov);
        System.out.println(ivanov);
        System.out.println(pushkin);
    }
    private static void numbersSetRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        Iterator<Integer> numberIterator = numbers.iterator();
        while (numberIterator.hasNext()){
            int number = numberIterator.next();
            if (number % 2 != 0) {
                numberIterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
