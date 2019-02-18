package lesson2.case6;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static boolean find(List<? extends Product> all, Product p) {    //!!! --- if delete '? extends' - doesn't work
        //static boolean find(Product> all, Product p) {

        for (Product sp: all) {
            if (sp.isSameProduct(p)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        List<Camera> cameras = new ArrayList();
        find(cameras, new Camera());

    }

}
