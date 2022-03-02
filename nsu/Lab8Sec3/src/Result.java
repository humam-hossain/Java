public class Result {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 3);
        Fraction f2 = new Fraction(5, 3);

        System.out.println(f1.toString());
        System.out.println(f2.toString());

        f1.add(f2);
        System.out.println(f1.toString());

        f1.sub(f2);
        System.out.println(f1.toString());
        
        f1.multiplication(f2);
        System.out.println(f1.toString());
        
        f1.division(f2);
        System.out.println(f1.toString());
        
    }
}
