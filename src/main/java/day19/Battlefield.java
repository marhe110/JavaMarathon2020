package day19;


import java.util.ArrayList;
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

    private Squares[][] arrayCells;
    int n = 10;


    public Battlefield() {
        //создание пустого поля
        initialize();
    }

    //все поле игрока пустое
    private void initialize() {
        //    System.out.println("new battlefield");
        arrayCells = new Squares[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arrayCells[i][j] = Squares.IS_EMPTY;
            }
        }
    }

    //печать текущего состояния поля на экран
    public String print() {
        int count = 0;
        System.out.println("  0  1 2 3  4 5 6 7  8 9");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 && i < n) {
                    System.out.print(count++ + " " + arrayCells[j][i].getSymbol());
                } else System.out.print(arrayCells[j][i].getSymbol());
            }
            System.out.println();
        }
        return "";
    }

    public boolean addShipsOnBattlefield(Ship ship) {
        boolean notError = true;
        List<Integer> tempListX = new ArrayList<>();
        List<Integer> tempListY = new ArrayList<>();

        //добавляем ореол корабля на карту
        for (int i = 0; i < ship.getCoordinatesHalo().get(0).size(); i++) {
            int x = ship.getCoordinatesHalo().get(0).get(i);
            int y = ship.getCoordinatesHalo().get(1).get(i);
//            System.out.println(" x=" + ship.getCoordinatesHalo().get(0).get(i) + " y=" + ship.getCoordinatesHalo().get(1).get(i));

            if (!getArrayCells()[x][y].equals(Squares.IS_HALO)) {//поле не занято
                tempListX.add(x);
                tempListY.add(y);
            } else
                return false;

        }


//добавляем корабль на карту

        for (int i = 0; i < ship.getCoordinatesShip().size(); i++) {
            int x = ship.getCoordinatesShip().get(i).get(0);
            int y = ship.getCoordinatesShip().get(i).get(1);
            if (!getArrayCells()[x][y].equals(Squares.IS_SHIP)) {//проверка что поле еще не занято
                getArrayCells()[x][y] = Squares.IS_SHIP;
            } else return false;
        }
        getArrayCells()[x][y].equals(Squares.IS_HALO
        return true;
    }


}
