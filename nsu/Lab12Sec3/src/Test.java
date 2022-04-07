public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle("Rectangle", 2.5, 2.5);

        System.out.println("Area of " + r.name + " is " + r.area());
        System.out.println("Perimeter of " + r.name +  " is " + r.perimeter());

        PercentageDiscount p = new PercentageDiscount(10);
        ThresholdDiscount t = new ThresholdDiscount(500, 50);

        System.out.println("Price after percentage discount = " + p.discountedPrice(1000));
        System.out.println("Price after threshold discount = " + t.discountedPrice(1000));
    }
}
