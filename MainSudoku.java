/**
 * Created by Edgar on 20/11/2016.
 */
public class MainSudoku extends ResuelveSudoku {

    public static void main (String[] args){

        String Resultado = "No verificado";

        //System.out.print("Hola Sudoku ");
        Resultado = ValidarSudoku(sudokuResuelto)== true?"Valido":"No valido";
        System.out.print(Resultado);
    }
}
