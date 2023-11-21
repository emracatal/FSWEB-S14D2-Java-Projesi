public class Main {
    public static void main(String[] args) {
        System.out.println("**********");
        Wall wall1 = new Wall("right");
        Lamp lamp1 = new Lamp(true, 100, LampType.LAMP2);
        lamp1.turnOn();
        wall1.create();
        Ceiling ceiling1 = new Ceiling(3, PaintColor.BLUE);
        ceiling1.create();
        Carpet blueCarpet = new Carpet(PaintColor.BLUE);
        Bedroom bedroom1 = new Bedroom("bedroom1", wall1, new Wall("left"), new Wall("up"), new Wall("down"), new Ceiling(6, PaintColor.WHITE), new Bed(), new Lamp(true, 100, LampType.LAMP1), new Wardrobe(), blueCarpet);
        bedroom1.getBed().make();
        System.out.println(bedroom1);
        System.out.println(bedroom1.getCarpet().toString());
        //blueCarpet ismini nasıl yazdırabilirim?

    }
}