import java.util.Random;

public class TwoD {
    void random_2d(int n){
        Random r = new Random();

        int[][] array = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(i==j){
                    array[i][j] = 0;
                }else{
                    array[i][j] = r.nextInt();
                }
            }
        }
    }

    public static void main(String[] args) {
        TwoD obj = new TwoD();
        
        obj.random_2d(5);
    }
}
