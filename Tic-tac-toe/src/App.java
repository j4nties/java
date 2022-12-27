import java.util.Scanner;

public class App {
    //######################################################
    static final int ROWS = 3, COLS = 3;//arrau
    static Scanner input = new Scanner(System.in);//input
    static String[][] board = new String[ROWS][COLS];//board
    static int counter = 0;
    static int playerNumber;
    static int selectedSquare;
    static String symbol;
    static int index;
    //######################################################

    public static void main(String[] args)
    {
        display();
        while (!checkDraw() && !checkWin()) 
        {
            System.out.print(counter);
            playerNumber = (counter% 2) +1;
            symbol = (playerNumber == 1) ? "  X " : "  O ";
            getInput();
            cls();
            display();

            counter++;   
        }
        System.out.println("Game Over!");
    }
//=================================================================================================
    static void display()
    {
        System.out.println("\tPlayer-"+playerNumber);
        System.out.print("-------------------\n|");
        for (String[] row : board) {
            for (String string : row) {
                System.out.print(string+" |");
            }
            System.out.print("\n-------------------\n|");
        }
    }
//=================================================================================================
    static void cls()
    {
        //clean screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
//=================================================================================================
    static void getInput()
    {
        do {
            System.out.print("Choose a square:(between 1-9) => ");
            selectedSquare = (input.nextInt());
            index = selectedSquare-1;
        } while (board[index/3][index%3] != null);
        board[index/3][index%3] = symbol;
    }
//=================================================================================================
    static boolean checkWin()
    {
        // check lines
        for (int i = 0; i < board.length/ROWS; i++) {
            if (board[i][0] != null && board[i][0] == board[i][1] && board[i][1] == board[i][2])
            {
                System.out.println("Player-"+playerNumber+" Won!");
                return true;
            }
        }
        // check cols
        for (int i = 0; i < board.length/COLS; i++) {
            if (board[0][i] != null && board[0][i] == board[1][i] && board[1][i] == board[2][i])
            {
                System.out.println("Player-"+playerNumber+" Won!");
                return true;
            }
        }
        // check corners to corners
        if (board[1][1] != null && board[0][2] == board[1][1] && board[1][1] == board[2][0])
        {
            System.out.println("Player-"+playerNumber+" Won!");
            return true;
        }
        if (board[1][1] != null && board[0][0] == board[1][1] && board[1][1] == board[2][2])
        {
            System.out.println("Player-"+playerNumber+" Won!");
            return true;
        }
        // else return false
        return false;
    }
//=================================================================================================
    static boolean checkDraw()
    {
        if (counter == 9)
        {
            System.out.println("Draw!");
            return true;
        }
        return false;
    }
}