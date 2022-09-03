public class Main {
    
    public static void main(String[] args) {
        RoboGrid r1 = new RoboGrid("Melissa", 15, 40);
        RoboGrid r2 = new RoboGrid("Bob", 44, 20);

        r1.moveRight(7);
        r2.moveUp(11);

        System.out.println(r1);
        System.out.println(r2);
    }
}
