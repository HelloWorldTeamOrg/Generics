package lesson2.case6;

public class Container<T extends Product & Comparable<T>> {

    T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
