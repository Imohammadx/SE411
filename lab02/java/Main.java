package lab02.java;

import java.util.Arrays;
import java.util.List;

public class Main {

    
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public static double sumNumbers(List<? extends Number> numbers) {
        double sum = 0.0;
        for (Number n : numbers) {
            sum += n.doubleValue();
        }
        return sum;
    }

    public static void main(String[] args) {
        
        System.out.println("=== Exercise 1 ===");
        String[] words = {"Hello", "Generics", "Java"};
        printableList<String> printable = new printableList<>(words);
        printable.printAll();

        
        System.out.println("\n=== Exercise 2 ===");
        NumberBox<Integer> intBox = new NumberBox<>();
        intBox.setItem(10);
        System.out.println("Integer stored: " + intBox.getItem());
        System.out.println("Sum with 5: " + intBox.add(5)); 
        System.out.println("Self sum: " + intBox.sum());    

        NumberBox<Double> doubleBox = new NumberBox<>();
        doubleBox.setItem(12.5);
        System.out.println("Double stored: " + doubleBox.getItem());
        System.out.println("Sum with 7.5: " + doubleBox.add(7.5)); 
        System.out.println("Self sum: " + doubleBox.sum());        

        
        System.out.println("\n=== Exercise 3 ===");
        List<String> names = Arrays.asList("Mohammad", "Bader", "Hazim");
        System.out.println("printList (Strings):");
        printList(names);

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Sum of integers: " + sumNumbers(nums));

        List<Double> decimals = Arrays.asList(2.5, 3.5, 4.0);
        System.out.println("Sum of doubles: " + sumNumbers(decimals));
    }
}
