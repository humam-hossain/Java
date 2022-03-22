class Stack {
    int top = -1;
    int[] arr;

    Stack(){
        this.arr = new int[1000];
    }

    void insert(int a){
        this.top++;
        this.arr[this.top] = a;
    }
    int remove(){
        int removed = this.arr[this.top];
        this.arr[this.top] = 0;
        this.top--;

        return removed;
    }
    int search(int a){

        for(int i=0; i<this.top; i++){
            if(this.arr[i] == a){
                return i;
            }
        }

        return -1;
    }
    int getStackSize(){
        return this.top + 1;
    }
    void displayStack(){
        for(int i=0; i<=top; i++){
            System.out.print(this.arr[i] + " ");
        }
    }
    void deleteStack(){
        for(int i=0; i<top; i++){
            this.arr[i] = 0;
        }
    }
}

public class TestStack {
    public static void main (String[] abc) { 
        Stack s = new Stack(); 
        // s.push(1); s.push(5); s.push(8); s.push(80); s.push(2); 
        // s.pop(); 
        // s.pop(); 
        s.insert(1);
        s.insert(5);
        s.insert(8);
        s.insert(80);
        s.insert(2);
        s.remove();
        s.remove();

        s.displayStack(); 
        System.out.println("\n" + "The size of the stack: " + s.getStackSize()); 
    }
}