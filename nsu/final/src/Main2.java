public class Main2 {
    public static void main(String[] args) {
        Designation obj = new Designation();

        try{
            obj.myDesignation("Dhaka");
            obj.myDesignation("BD");
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}
