/**
 * Created by Edgar on 20/11/2016.
 */
public class ResuelveSudoku {

    public static int[][] sudokuResuelto={
            {8,9,6,1,3,2,5,4,7},
            {1,4,7,5,6,8,2,3,9},
            {2,3,5,4,9,7,1,8,6},
            {7,6,4,2,8,1,9,5,3},
            {5,8,9,3,4,6,7,2,1},
            {3,2,1,7,5,9,4,6,8},
            {6,1,2,8,7,5,3,9,4},
            {4,7,8,9,2,3,6,1,5},
            {9,5,3,6,1,4,8,7,2}
    };

    public static int[][] sudokuIncorrecto={
            {8,8,6,1,3,2,5,4,7},
            {1,4,7,5,6,8,2,3,9},
            {2,3,5,4,9,7,1,8,6},
            {7,6,4,2,8,1,9,5,3},
            {5,8,9,3,4,6,2,2,1},
            {3,2,1,7,5,9,4,6,8},
            {6,1,2,8,7,5,3,9,4},
            {4,7,8,9,2,3,6,1,5},
            {9,5,3,6,1,4,8,7,2}
    };

    public static boolean ValidarSudokuLinea(int tablero[][],int x,int y){

        int posX = x;
        int posY = y;

        while (posY < 9 && posX != 9){
            while(y < 9){
                if( posY != y){
                    if(tablero[posX][posY]==tablero[x][y] || tablero[posY][posX]==tablero[y][x]){
                        return false;
                    }
                }
                y++;
            }
            posY = y == 9?posY+1:posY;
            y = 0;
        }
        return true;
    }

    public static boolean ValidarSudoku(int tablero[][]){

           for(int j = 0;j<9;j++){
               if(!ValidarSudokuLinea(tablero,j,0))
                   return false;
           }

        return true;
    }
}
