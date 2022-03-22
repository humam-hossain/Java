class Stack {
    int top = -1;
    int[] arr;

    Stack(){
        this.arr = new int[1000];
    }
    Stack(int a){
        this.arr = new int[a];
    }

    void push(int a){
        this.top++;
        this.arr[this.top] = a;
    }
    int pop(){
        int removed = this.arr[this.top];
        this.arr[this.top] = 0;
        this.top--;

        return removed;
    }

    int getStackSize(){
        return this.top + 1;
    }
    void displayStack(){
        for(int i=0; i<=top; i++){
            System.out.print(this.arr[i] + " ");
        }
    }
}

public class TestStack_ {
    public static void main (String[] abc) { 
        Stack s = new Stack(); 
        s.push(1); s.push(5); s.push(8); s.push(80); s.push(2); 
        s.pop(); 
        s.pop(); 

        s.displayStack(); 
        System.out.println("\n" + "The size of the stack: " + s.getStackSize()); 
    }
}