public class ClassA {
    int a;
    ClassA(){
        System.out.println(++a);
    }
    public ClassA(int b){
        System.out.println(a+=b);
    }
}