package lesson2.case1;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static void find(List<? extends Product> all, Product p) {
    }

    public static void main(String[] args) {

        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Product product1 = new Product();
        Product product2 = new Product();

        List<Product> listProduct = new ArrayList();
        List<Camera> listCameras = new ArrayList();

        find(listProduct, product1);
        find(listProduct, camera1);
        find(listCameras, product1);
        find(listCameras, phone1); // !!! - Not safely

    }
}
