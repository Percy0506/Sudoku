public class SudokuEngine {
    public static void main(String[] args) {
        SudokuBoard myBoard = new MySudokuBoard("boards/dirty-data.sdk");
        System.out.println(myBoard);
    }
}