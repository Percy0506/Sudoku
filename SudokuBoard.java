import java.util.*;
import java.io.*;

public class SudokuBoard {
 
    private int[][] board;
    
    public SudokuBoard(String filename) {
      board = new int[9][9];
      try{
         Scanner file = new Scanner(new File(filename));        
         for(int r = 0; r < board.length; r++) {
            for(int c = 0; c < board[0].length; c++) {
               if(file.next() == ".") {
                  board[r][c] = 0;
                  c++;
               } else {
                  board[r][c] = file.nextInt();
               }
            }
         }
      } catch(FileNotFoundException e) {
         System.out.println("Cannot file: " + filename);
      }
      
      
    }
    
    public String toString() {
       return "";
    }
 
 
 }