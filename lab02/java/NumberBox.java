package lab02.java;

public class NumberBox<T extends Number> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

        public double add(T other) {
        if (item == null) return other.doubleValue();
        return item.doubleValue() + other.doubleValue();
    }

    
    public double sum() {
        if (item == null) return 0.0;
        return item.doubleValue() + item.doubleValue();
    }
}
