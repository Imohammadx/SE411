package lab02.java;

import java.util.Arrays;
import java.util.List;

public class printableList<T> {
    private final List<T> items;

  
    public printableList(T[] array) {
        this.items = Arrays.asList(array);
    }

    
    public void printAll() {
        for (T item : items) {
            System.out.println(item);
        }
    }

    
    public List<T> getItems() {
        return items;
    }
}
