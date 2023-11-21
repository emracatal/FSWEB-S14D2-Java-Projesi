public enum LampType {
    LAMP1("classic"),
    LAMP2("modern"),
    LAMP3("elegant");
    private String style;

    LampType(String style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return "LampType{" +
                "style='" + style + '\'' +
                '}';
    }
}
