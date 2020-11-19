package finishTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//считать состояние поля
public class Battlefield {
    public Squares[][] getArrayCells() {
        return arrayCells;
    }
    //устанавливаем корабли на поле боя
    public void setArrayCells(Squares[][] arrayCells) {
        this.arrayCells = arrayCells;
    }

    //   private User user;
//    private User userOld;
    private Squares[][] arrayCells;
    int n = 10;

    public Battlefield(){
      //  this.user = user;
        //this.userOld = userOld;
        initialize();

    }
//все поле игрока пустое
    private void initialize(){
        arrayCells = new Squares[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               arrayCells[i][j] = Squares.IS_EMPTY;
            }
        }
    }
//печать текущего поля на экран
    public String print() {
        System.out.println("   0 1 2 3  4 5 6 7  8 9");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < n) {
                    System.out.print(i + " " + arrayCells[i][j].getSymbol());
                }
                else System.out.print(arrayCells[i][j].getSymbol());
            }
            System.out.println();
        }
        return "";
    }



}
