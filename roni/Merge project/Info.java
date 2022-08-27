import java.util.*;
class Info {
    Scanner sc=new Scanner(System.in);

    private static int userid=2345671;
    private String password;
    private String name;
    private String mobileno;
    private String email;
    private String address;
    private String gender;
    private String bloodgroup;

    public Info(){
        userid++;
    }

    


    public void setname(String n){
        name=n;
    }
    public void setpassword(String p){
        password=p;
    }
    public void setmobileno(String m){
        mobileno=m;
    }
    public void setemail(String e){
        email=e;
    }
    public void setaddress(String a){
        address=a;
    }
    public void setgender(String g){
        gender=g;
    }
    public void setblood(String b){
        bloodgroup=b;
    }

    public int getuserid(){
        return userid;
    }
    public String getpassword(){
        return password;
    }
    public String getname(){
        return name;
    }
    public String getmobileno(){
        return mobileno;
    }
    public String getemail(){
        return email;
    }
    public String getaddress(){
        return address;
    }
    public String getgender(){
        return gender;
    }
    public String getbloodgroup(){
        return bloodgroup;
    }

    public void passwordchange(){
        String str=sc.nextLine();
        if(password==str){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            if(str1==str2){
                password=str1;
            }
            
        }

    }

}
