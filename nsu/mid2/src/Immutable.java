// The immutable objects are objects whose value can not be changed after initialization. 
// We can not change anything once the object is created.

// Final class, which is declared as final so that it can't be extended.
// All fields should be private so that direct access to the fields is blocked.
// No Setters
// All mutable fields should be as final so that they can not be iterated once initialized.

public class Immutable {  
    private final String s; 

    Immutable(final String s) {  
        this.s = s;  
    }  
    public final String getName() {  
        return s;  
    }

    public static void main(String[] args) {  
        Immutable obj = new Immutable("Core Java Training");  
        System.out.println(obj.getName());  
    }  
}  