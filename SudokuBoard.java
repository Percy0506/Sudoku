import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuBoard {

    private int[][] board;

    public SudokuBoard(String filename) {
        board = new int[9][9];
        try {
            Scanner file = new Scanner(new File(filename));
            for (int r = 0; r < 9; r++) {
                String line = file.nextLine();
                for (int c = 0; c < 9; c++) {
                    char ch = line.charAt(c);
                    if (ch == '.') {
                        board[r][c] = 0;
                    } else {
                       board[r][c] = ch - '0';
                    }
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file: " + filename);
        }
    }

    public String toString() {
      String result = "";
      for(int r = 0; r < board.length; r++) {
         for(int c = 0; c < board[0].length; c++) {
            if(board[r][c] == 0) {
               result += "X ";   
            } else {
               result += board[r][c] + " ";
            }
         }
         result += "\n";
      }

      return result;
    }
 
 
 }
 
 /*
 2 X X 1 X 5 X X 3 
X 5 4 X X X 7 1 X 
X 1 X 2 X 3 X 8 X 
6 X 2 8 X 7 3 X 4 
X X X X X X X X X 
1 X 5 3 X 9 8 X 6 
X 2 X 7 X 1 X 6 X 
 */