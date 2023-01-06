import java.util.*;

class tictactoe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        tictac obj = new tictac();
        String player = "Player 1";
        char symbol = 'X';
        
        char[][] board = {{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '},{'-','+','-','+','-'},{' ','|',' ','|',' '}};
        int count = 0;
        while(count<9) {
            System.out.println(player+ "'s turn:");
            obj.chance(board,player,symbol,sc);
            obj.printBoard(board);
            if(obj.checkwin(board,symbol)) {
                System.out.println(player+" wins!");
                break;
            }
            symbol = symbol=='X'?'O':'X';
            player = player=="Player 1"?"Player 2":"Player 1";
            count++;
        }
        if(count==9)
            System.out.println("It's a Draw!");
        sc.close();
    }
}

class tictac {
    tictac() {

    }
    void chance(char[][] board,String player,char symbol,Scanner sc) {
        int flag = 0;
        while(flag==0) {
        System.out.println("Enter a number between 1-9");
        int choice = sc.nextInt();
        switch(choice) {
            case 1:
                if(board[0][0] == ' ') {
                    board[0][0] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 2:
                if(board[0][2] == ' ') {
                    board[0][2] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 3:
                if(board[0][4] == ' ') {
                    board[0][4] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 4:
                if(board[2][0] == ' ') {
                    board[2][0] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 5:
                if(board[2][2] == ' ') {
                    board[2][2] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 6:
                if(board[2][4] == ' ') {
                    board[2][4] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 7:
                if(board[4][0] == ' ') {
                    board[4][0] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 8:
                if(board[4][2] == ' ') {
                    board[4][2] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            case 9:
                if(board[4][4] == ' ') {
                    board[4][4] = symbol;
                    flag = 1;
                }
                else
                    System.out.println("This place is filled. Choose another option.");
                break;
            default:
                System.out.println("Enter a valid number");
                break;
        }
        if(flag==1) {
            break;
        }
    }
    }

    void printBoard(char[][] board) {
        for(int i=0;i<board.length;i++) {
            for(int j=0;j<board[i].length;j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    boolean checkwin(char[][] board,char symbol) {
        if(board[0][0]==symbol && board[0][2]==symbol && board[0][4]==symbol ||
        board[2][0]==symbol && board[2][2]==symbol && board[2][4]==symbol || 
        board[4][0]==symbol && board[4][2]==symbol && board[4][4]==symbol || 
        board[0][0]==symbol && board[2][0]==symbol && board[4][0]==symbol || 
        board[0][2]==symbol && board[2][2]==symbol && board[4][2]==symbol || 
        board[0][4]==symbol && board[2][4]==symbol && board[4][4]==symbol || 
        board[0][0]==symbol && board[2][2]==symbol && board[4][4]==symbol || 
        board[4][0]==symbol && board[2][2]==symbol && board[0][4]==symbol) {
            return true;
        }
        return false;
    }
}
