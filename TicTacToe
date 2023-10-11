public class TicTacToe {
    public static int isSolved(int[][] board) {

        // your code here
      
        int firstPlayer = 0;
        int secondPlayer = 0;
        // check rows only 1 row at a time
        int sumRow = 0;
        int sumColumn = 0;
        int sumCross = 0;
        boolean isRowZero = false;
        boolean isColumnZero = false;
        boolean anyZero = false;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {

                if(board[i][j] == 0){
                    isRowZero = true;
                    anyZero = true;
                }
                if(board[j][i] == 0){
                    isColumnZero = true;
                    anyZero = true;
                }
                    sumRow += board[i][j];
                    sumColumn += board[j][i];

                    if(i == j){
                        sumCross += board[i][j];
                      if(board[i][j] == 0){
                        sumCross = 20;
                      }
                    }
            }
            if (sumRow == 3 && !isRowZero) {
                firstPlayer++;
            }if (sumRow == 6 && !isRowZero) {
                secondPlayer++;
            }
            if (sumColumn == 3 && !isColumnZero) {
                firstPlayer++;
            }if (sumColumn == 6 && !isColumnZero) {
                secondPlayer++;
            }
            System.out.println(sumCross);
            
            isRowZero = false;
            isColumnZero = false;
            sumRow = 0;
            sumColumn = 0;
        }
      
      if(sumCross == 3){
              firstPlayer++;
            }if(sumCross == 6){
              secondPlayer++;
            }

        //check cross
      int backCross = 0;
      for(int i = board.length - 1; i >= 0; i--){
        for(int j = 0; j < board.length; j++){
          if((i == 0 || j == 0) && (i == board.length - 1 || j == board.length - 1) || (i == 1 && j == 1)){
            backCross += board[i][j];
            if(board[i][j] == 0){
              backCross = 20;
            }
          }
        }
      }
        if(backCross == 3){
          firstPlayer++;
        }if (backCross == 6){
          secondPlayer++;
        }

        System.out.print(firstPlayer + " " +secondPlayer);
        if (firstPlayer > secondPlayer) {
            return 1;
        } else if (secondPlayer > firstPlayer) {
            return 2;
        } else if ((firstPlayer == secondPlayer) && !anyZero) {
            return 0;
        }
        // check columns same integers

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(isSolved(new int[][] {
                { 1, 2, 0 },
                { 0, 1, 2 },
                { 0, 0, 1 } }));
    }
}
