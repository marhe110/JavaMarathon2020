package day19;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ship {
    private int length;//подаем в конструкторе
    private String name; //из длинны
    private List<List<Integer>> coordinatesShip = new ArrayList<>(); // ввод с консоли
    private List<List<Integer>> coordinatesHalo = new ArrayList<>();// из координат корабля

    public Ship(int length) {
        if (length > 0 && length <= 9) {
            this.length = length;
            setName(length);

            //получим провереный лист корабля
            initShip(length);

            //получим лист ореола корабля
            initHalo();
        } else new IOException("Длинна корабля вне диапазона");
    }

    // initialization name
    private void setName(int length) {
        //this.name = Integer.toString(length);
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

    // initialization ship
    private void initShip(int length) {
        newShip(length);

    }

    //новый корабль

    private void newShip(int length) {
        BufferedReader breader = new BufferedReader(new InputStreamReader(System.in));
        String[] positionStr;
        String readline;
        List<Integer> list;
        System.out.println("Введи координаты корабля " + name + " от 0 до 9");

        for (int j = 0; j < length; j++) {// вводим координаты для конкретного корабля не более его длинны
            while (true) {
                try {
                    //readline = null;
                    System.out.print((j + 1) + ") X,Y ->");
                    readline = breader.readLine();
                    //readline = "9.1";
                    positionStr = readline.split(",");
                    list = new ArrayList<>();
                    list.add(Integer.parseInt(positionStr[0]));
                    list.add(Integer.parseInt(positionStr[1]));


                    if (list.get(0) >= 0 && list.get(0) <= 9 && list.get(1) >= 0 && list.get(1) <= 9) {// координаты в диаппазоне
                        if (!coordinatesShip.contains(list)) {// ранее не вводились
                            coordinatesShip.add(list);
                            break;
                        } else {
                            throw new Exception();
                        }

                    } else throw new Exception();

                } catch (Exception e) {
                    System.out.println("Ошибка ввода координат, повторить ввод координат для корабля сначала");
                    System.out.println("Введи координаты корабля " + name + " от 0 до 9 [X,Y]");
                    j = 0;
                    coordinatesShip.clear();
                }
            }

        }
        try {
            checkShip();
        } catch (Exception e) {
            System.out.println("Ошибка ввода координат, повторить ввод координат для корабля сначала");
            System.out.println("Введи координаты корабля " + name + " от 0 до 9 [X,Y]");
            coordinatesShip.clear();
            newShip(length);
        }
    }
    //для newShip

    private void checkShip() throws Exception {
        List<Integer> listX = new ArrayList<>();
        List<Integer> listY = new ArrayList<>();

        List<Integer> list = new ArrayList<>();
        int countX = 0;
        int countY = 0;
        for (int i = 0; i < length; i++) {
            if (coordinatesShip.get(i).get(0) == coordinatesShip.get(0).get(0)) {
                countX++;
            }
            if (coordinatesShip.get(i).get(1) == coordinatesShip.get(0).get(1)) {
                countY++;
            }
        }

        if (countX == length) {
            for (int i = 0; i < length; i++) {
                list.add(coordinatesShip.get(i).get(1));
                //    list.addAll(listY);
            }
        } else if (countY == length) {
            for (int i = 0; i < length; i++) {
                list.add(coordinatesShip.get(i).get(0));
                //    list.addAll(listX);
            }
        } else {
            throw new Exception();
        }
        Collections.sort(list);
        if (list.get(0) + length - 1 == list.get(length - 1)) {
            System.out.println("List " + list);
        } else {
            throw new Exception();
        }

        System.out.println(coordinatesShip);

    }

    private void writeCoordinates(int x, int y) {
        if (x >= 0 && x <= 9 && y >= 0 && y <= 9) {
            //добавить проверку расположения корабля и ореола в одной точке
            List<Integer> listX = new ArrayList<>();
            List<Integer> listY = new ArrayList<>();
            listX.add(x);
            listY.add(y);
            if (coordinatesHalo.isEmpty()) {
                coordinatesHalo.add(0, listX);
                coordinatesHalo.add(1, listY);
            } else
                for (int i = 0; i < coordinatesHalo.get(0).size(); i++) {
                    if (coordinatesHalo.get(0).get(i) == x && coordinatesHalo.get(1).get(i) == y) {//тут возмжна ошибка
                        break;
                    } else if (i == coordinatesHalo.get(0).size() - 1) {
                        coordinatesHalo.get(0).add(x);
                        coordinatesHalo.get(1).add(y);
                        break;
                    }
                }
        }
    }

    private void haloForSquares(int x, int y) {

        writeCoordinates(x - 1, y - 1);
        writeCoordinates(x - 1, y);
        writeCoordinates(x - 1, y + 1);
        writeCoordinates(x, y - 1);
        writeCoordinates(x, y + 1);
        writeCoordinates(x + 1, y - 1);
        writeCoordinates(x + 1, y);
        writeCoordinates(x + 1, y + 1);

    }

    //инициализация ореола

    private void initHalo() {
        for (int i = 0; i < length; i++) {
            haloForSquares(coordinatesShip.get(i).get(0), coordinatesShip.get(i).get(1));
        }
        System.out.print(" Х=" + coordinatesHalo.get(0));
        System.out.println();
        System.out.println(" Y=" + coordinatesHalo.get(1));
    }
    public List<List<Integer>> getCoordinatesShip() {
        return coordinatesShip;
    }

    public List<List<Integer>> getCoordinatesHalo() {
        return coordinatesHalo;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "name='" + name + '\'' +
                '}';
    }
}

