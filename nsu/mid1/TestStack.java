class Stack{
    int top=-1;
    int[] arr;

    Stack(){
        arr = new int[1000];
    }

    void insert(int a){

    }

    int removie(){
        return 0;
    }

    int search(int a){
        return 0;
    }

    int getStackSize(){
        return 0;
    }

    void displayStack(){

    }

    void deleteStack(){

    }
}

public class TestStack{
    public static void main(String[] abc) {
        Stack s = new Stack();
        
        s.push(1);
        s.push(5);
        s.push(8);
        s.push(80);
        s.push(2);

        s.pop();
        s.pop();

        s.displayStack();
        System.out.println("\n" + "The size of the stack: " + s.getStackSize());

    }
}