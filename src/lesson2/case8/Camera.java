package lesson2.case8;

public class Camera extends Product {

    Integer pixel = 1024;

    public Camera() {
    }

    public Camera(Integer pixel) {
        this.pixel = pixel;
    }

    public Integer getPixel() {
        return pixel;
    }

    public void setPixel(Integer pixel) {
        this.pixel = pixel;
    }

}
