package lesson3.case1;

public class Product<T extends Product<T>> implements Comparable<T>{

    String name = "name";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }

}
