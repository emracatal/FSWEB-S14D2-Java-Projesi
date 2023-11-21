public class Lamp {
    private boolean battery;
    private int globRating;
    private LampType style;

    public Lamp(boolean battery, int globRating, LampType style) {
        this.battery = battery;
        this.globRating = globRating;
        this.style = style;
    }

    public LampType getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobalRating() {
        return globRating;
    }

    public void turnOn(){
        System.out.println(String.format("Lamp is being turned on with %d globe rating.",globRating));
    }

    @Override
    public String toString() {
        return "Lamp{" +
                "battery=" + battery +
                ", globRating=" + globRating +
                ", style=" + style.name() +
                '}';
    }
}
