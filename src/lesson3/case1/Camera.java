package lesson3.case1;

public class Camera extends Product<Camera> {

    Integer pixels = 1024;

    public Integer getPixels() {
        return pixels;
    }

    public void setPixels(Integer pixels) {
        this.pixels = pixels;
    }
}
