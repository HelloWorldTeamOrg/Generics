package lesson3.case1;

import javafx.scene.shape.StrokeLineCap;

import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {

        List list = new ArrayList();


        Camera camera1 = new Camera();
        Camera camera2 = new Camera();
        Phone phone1 = new Phone();
        Phone phone2 = new Phone();
        Product product1 = new Product();
        Product product2 = new Product();

        camera1.compareTo(camera2);
        product1.compareTo(product2);
        //camera1.compareTo(phone1);

    }
}
