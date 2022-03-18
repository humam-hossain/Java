// Write a method named 'min' that will return the minimum value from an array of integers. The method header is given below. 
// You need to write the method body only. Any unnecessary code will result in zero. 

public class Mid1{
    public static void main(String[] args){
        int[] array = {10, 15, 20, 25, 30};
        doubleArray(array); 

        for(int i =0; i<5; i++){
            System.out.println(array[i]);
        }
    }

    public static void doubleArray(int[] inputArray){
        // int[] result = new int[inputArray.length];
        for(int i = 0; i < inputArray.length; i++){
            inputArray[i] = inputArray[i] * 2;
        }
        
    }
}