public class Triangle {
    int a, b, c;

    Triangle(int a, int b, int c) throws IllegalTriangleException{
        if(a+b <= c || b+c <= a || c+a <= b){
            throw new IllegalTriangleException();
        }else{
            this.a = a;
            this.b = b;
            this.c = c;
        }
    }
}
