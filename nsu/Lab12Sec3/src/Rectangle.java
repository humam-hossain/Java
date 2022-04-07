public class Rectangle extends Shape{
    double length;
    double width;


    Rectangle(String name, double length, double width){
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    double area(){
        return this.length * this.width;
    }

    double perimeter(){
        return 2 * (this.length + this.width);
    }
}
