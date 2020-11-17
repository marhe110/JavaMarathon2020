package finishTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ship {
    private final int length;
    private String name;
    private List<Pixel> pixels = new ArrayList<>();
    Battlefield battlefield = new Battlefield();

    public Ship(int length) throws IOException {
        this.length = length;
        setName(length);
        initializeShip();
    }


    private void initializeShip() {
        //создаем корабль массив пикселей длинной корабля
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] positionStr;
         String readline;
        System.out.println("Введи координаты корабля " + getName() + " от 0 до 9 [X,Y]");
        for (int j = 0; j < length; j++) {// вводим координаты для конкретного корабля не более его длинны
            while (true) {
                try {
                    readline = null;
                    //readline = reader.readLine();
                    readline = "9.1";
                    positionStr = readline.split(",");//добавить исключение
                    if (Integer.parseInt(positionStr[0]) >= 0 &&
                            Integer.parseInt(positionStr[0]) <= 9 &&
                            Integer.parseInt(positionStr[1]) >= 0 &&
                            Integer.parseInt(positionStr[1]) <= 9) {
                    }
                    else new Exception();

                    //if (pixels(Pixel(Squares.IS_SHIP, Integer.parseInt(positionStr[0]), Integer.parseInt(positionStr[1]))) );
                    pixels.add(new Pixel(Squares.IS_SHIP, Integer.parseInt(positionStr[0]), Integer.parseInt(positionStr[1])));
                    ;
                    List<int[][]> list = new ArrayList<>();

                    System.out.println("aaa");

                    break;
                } catch (Exception e) {
                    System.out.println("Ошибка ввода координат, повторить");
                }
            }
            //проверить что корабль единое целое, цифры попорядку горизонт или вертикаль

        }
        setShip(length);
    }

    public void setShip(int length) {
        int goodIsSquare = 0; //свободно ли место для корабля в дальенейшем и ореола
        for (Pixel pix : pixels) {
            //если пустое поле проверить чтоб весь корабль был в диапазоне
            if (battlefield.getArrayCells()[pix.getPositionX()][pix.getPositionY()].equals(Squares.IS_EMPTY)) {
                goodIsSquare++;
            }
        }
        if (goodIsSquare == length) {
            for (Pixel pix : pixels) {
                battlefield.getArrayCells()[pix.getPositionX()][pix.getPositionY()] = Squares.IS_SHIP;
            }
        } else System.out.println("невозможно установить так корабль");
        battlefield.print();
    }


    @Override
    public String toString() {
        return name;
    }

    public String getName() {
        return name;
    }

    public void setName(int length) {
        //this.name = Integer.toString(name);
        switch (length) {
            case 1:
                this.name = "\uD83D\uDEE5";
                break;
            case 2:
                this.name = "\uD83D\uDEE5\uD83D\uDEE5";
                break;
            case 3:
                this.name = "\uD83D\uDEE5\uD83D\uDEE5\uD83D\uDEE5";
                break;
            case 4:
                this.name = "\uD83D\uDEE5\uD83D\uDEE5\uD83D\uDEE5\uD83D\uDEE5";
                break;
            default:
                this.name = null;
                break;
        }
    }
}


//    COMMAND1_DECK1, COMMAND1_DECK2, COMMAND1_DOCK3, COMMAND1_DECK4,
//    COMMAND2_DECK1, COMMAND2_DECK2, COMMAND2_DOCK3, COMMAND2_DECK4,
//    EMPTY;
//
//    //длина, размер, координата начала.
//
//
//    length
//            size
//    start of deck

