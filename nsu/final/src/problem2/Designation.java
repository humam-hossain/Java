public class Designation{
    void myDesignation(String designation) throws InvalidDesignationException{
        if(designation.length() < 3){
            throw new InvalidDesignationException();
        }else{
            System.out.println(designation);
        }
    }
}
