public class Bank {
    private String code;
    private String name;

    public Bank(){

    }
    
    public Bank(String code, String name){
        this.code = code;
        this.name = name;
    }
    
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // methods
    public void getAccounts(){
        // no relation shown between bank and accounts
    }
}
