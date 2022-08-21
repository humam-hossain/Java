import java.util.Scanner;

public class tictactoe {
    public int currentPlayer,currentState;
    private static char[][] board=new char[3][3];
    private static char X='X',O='O',EMPTY=' ';
    public tictactoe() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) board[i][j]=EMPTY;
        }
    }

    public void startGame() {
        this.currentPlayer=1;
        this.currentState=1;
    }

    public void printBoard() {
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                if(board[i][j]==X) System.out.print(" X ");
                else if(board[i][j]==O) System.out.print(" O ");
                else System.out.print("   ");
                if(j!=2) System.out.print("|");
            }
            System.out.println();
            if(i!=2) System.out.print("-----------");
            System.out.println();
        }
    }

    public void move() {
        boolean valid=false;
        do {    
            char move;
            if(this.currentPlayer==1) {
                System.out.println("Player 1, Enter your move: ");
                move='X';
            }
            else {
                System.out.println("Player 2, Enter your move: ");
                move='0';
            }
            Scanner scan=new Scanner(System.in);
            int row=scan.nextInt()-1;
            int col=scan.nextInt()-1;
            if((row>=0 && row<=2) && (col>=0 && col<=2) && board[row][col]==EMPTY) {
                this.currentState=update(this.currentPlayer,row,col,move);
                valid=true;
            }
            else System.out.println("Invalid input! Try again: ");
        } while(!valid);
    }

    public int update(int player,int row,int col,char move) {
        board[row][col]=move;

        if(board[row][0]==move && board[row][1]==move && board[row][2]==move) return player;
        else if(board[0][col]==move && board[1][col]==move && board[2][col]==move) return player;
        else if(board[0][0]==move && board[1][1]==move && board[2][2]==move) return player;
        else if(board[0][2]==move && board[1][1]==move && board[2][0]==move) return player;
        else {
            for(int i=0;i<3;i++) {
                for(int j=0;j<3;j++) {
                    if(board[i][j]==' ') return -1;
                }
            }
            return 0;
        }
    }
}
