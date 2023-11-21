import java.util.PrimitiveIterator;

public class Carpet {
    private int width;
    private int height;
    private PaintColor color;

    public Carpet(PaintColor color) {
        this.color=color;
            }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public PaintColor getColor() {
        return color;
    }

    public void setColor(PaintColor color) {
        this.color = color;
    }

    public void lying(){
        System.out.println("Carpet is lying on Bedroom floor.");
    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", height=" + height +
                ", color=" + color.name() +
                '}';
    }
}
