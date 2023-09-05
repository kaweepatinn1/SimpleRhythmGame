package SimpleRhythmGame;

public class Renderable {
    private String imagePath;
    private int x;
    private int y;
    private int opacity;

    public Renderable(String imagePath, int x, int y, int opacity) {
        this.imagePath = imagePath;
        this.x = x;
        this.y = y;
        this.opacity = opacity;
    }

    public String getImagePath() {
        return imagePath;
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
