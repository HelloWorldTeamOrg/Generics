package lesson2.case8;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void copy(List<? extends Product> src, List<? super Product> dest) {
         for (Product p: src) {
             dest.add(p);
         }
    }

    public static void main(String[] args) {
        List<Product> product1 = new ArrayList();
        List<Product> product2 = new ArrayList();
        List<Phone> phone1 = new ArrayList();
        List<Phone> phone2 = new ArrayList();
        copy(product1, product2);
        //copy(phone1, phone2);
        //copy(product1, phone1);
        copy(phone1, product1);

    }

}
