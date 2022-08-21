import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        tictactoe obj = new tictactoe();
        obj.startGame();
        do {    
            obj.printBoard();
            obj.move();
            if(obj.currentState==1) System.out.println("Player 1 won!");
            else if(obj.currentState==2) System.out.println("Player 2 won!");
            else if(obj.currentState==0) System.out.println("Match drawn!");
            if(obj.currentPlayer==1) obj.currentPlayer=2;
            else obj.currentPlayer=1;
        } while(obj.currentState==-1);
    }
}