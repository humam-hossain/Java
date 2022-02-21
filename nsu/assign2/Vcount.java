// Task2: Write a method countVowels(String name) that takes a String as parameter and
// returns the number of vowels. 

public class Vcount {
    int countVowels(String name){
        int count = 0;

        for(int i=0; i<name.length(); i++){
            if(name.charAt(i)== 'a' || name.charAt(i)== 'A' || name.charAt(i)== 'e' || name.charAt(i)== 'E' || name.charAt(i)== 'i' || name.charAt(i)== 'I' || name.charAt(i)== 'o' || name.charAt(i)== 'O' || name.charAt(i)== 'u' || name.charAt(i)== 'U'){
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        Vcount obj = new Vcount();

        System.out.println(obj.countVowels("counting vowels in a string"));
    }
}
