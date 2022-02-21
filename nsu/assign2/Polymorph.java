// Task3: Create a class to print an integer and a character with two methods having the
// same name but the different sequence of the integer and the character parameters.
// For example, if the parameters of the first method are of the form (int n, char c),
// then that of the second method will be of the form (char c, int n).

public class Polymorph {
    void poly(int n, char c){
        System.out.println("first parameter: " + n + "\tsecond parameter: " + c);
    }

    void poly(char c, int n){
        System.out.println("first parameter: " + c + "\tsecond parameter: " + n);
    }
    public static void main(String[] args) {
        Polymorph obj = new Polymorph();

        obj.poly(5, 'p');
        obj.poly('p', 5);
    }
}
