public class Test {
    public static void main(String[] args) {
        // int i = j = k = 2; //here j k are not defined that's why the compiler couldn't find them.
        int j, k;
        int i = j = k = 2;
        System.out.println(i + " " + j + " " + k);
    }
}
