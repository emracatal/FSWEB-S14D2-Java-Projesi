public enum PaintColor {
    WHITE("white"),
    BLUE("blue");

    private String color;

    PaintColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "PaintColor{" +
                "color='" + color + '\'' +
                '}';
    }
}
