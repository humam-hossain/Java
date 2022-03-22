// Constructor overloading in Java refers to the use of more than one constructor in an instance class.

public class Constructor {
    int a, b;
    String s;

    Constructor(){

    }
    Constructor(int a){
        this.a = a;
    }
    Constructor(String s, int b){
        this.s = s;
        this.b = b;
    }

    public String toString(){
        return "Constructor [a=" + this.a + ", b=" + this.b + ", s=" + this.s + "]";
    }

    public static void main(String[] args) {
        Constructor obj1 = new Constructor();
        Constructor obj2 = new Constructor(10);
        Constructor obj3 = new Constructor("bro", 100);

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
    }
}
