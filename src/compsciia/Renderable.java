package compsciia;

public class Renderable {
    private String imageName;
    private int x;
    private int y;
    private int opacity;

    public Renderable(String imageName, int x, int y, int opacity) {
        this.imageName = imageName;
        this.x = x;
        this.y = y;
        this.opacity = opacity;
    }

    public String getImageName() {
        return imageName;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getOpacity() {
        return opacity;
    }
}
