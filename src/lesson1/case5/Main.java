package lesson1.case5;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        SomeType<?> someType = new SomeType();
        List<String> list = Arrays.asList("value");
        someType.test(list);
    }
}
