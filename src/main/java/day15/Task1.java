//1. Вам дан файл с информацией об остатках обуви на складе (src/main/resources/shoes.csv).
// Это пример реальной выгрузки остатков из 1С в csv файл (формат файла с разделителями,
// в качестве разделителя использован символ “;”). В этом файле содержится информация о названии
// модели обуви, ее размер и оставшееся на складе количество.
//
//        До преобразования в csv это была таблица с тремя колонками:
//
//        Название 						   Размер	   Кол-во
//        Ботинки HS РАН-Р 400 чер. ЗП			45		4
//        Ботинки PANDA САНИТАРИ 3916 S1 SRC бел.	37		1
//        ...
//
//        Необходимо сформировать новый файл (src/main/resources/missing_shoes.txt)
//        с информацией о моделях и размерах обуви, которой нет на складе (количество = 0).
//        Для этого реализуйте программу, которая принимает на вход csv файл и создает новый txt файл
//        следующего содержания (должно получиться 11 строк):
//
//        Ботинки СВАРЩИК ут М.1398 ЗП, 40, 0
//        Ботинки СВАРЩИК ут М.1398 ЗП, 45, 0
//        Ботинки ТОФФ БЕРКУТ И с выс.берцами ут ч, 38, 0
//        ...

package day15;

import day14.Person;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String inputFile = "src/main/resources/shoes.csv";
        String outputFile = "src/main/resources/missing_shoes.txt";

        List<Shoes> origList = parseFileToObjList(inputFile);
        List<Shoes> filterList = filterListOfObj(origList);
        fileRecord(filterList, outputFile);
    }

    public static void fileRecord(List<Shoes> shoes, String outputFile) {
        try {
            PrintWriter pw = new PrintWriter(outputFile);
            for (Shoes obj : shoes) {
                pw.println(obj);
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<Shoes> filterListOfObj(List<Shoes> shoesList) {
        List<Shoes> shoesListFilter = new ArrayList<>();
        for (Shoes shoes : shoesList) {
            if (shoes.getAmount() == 0) {
                shoesListFilter.add(shoes);
            }
        }
        System.out.println(shoesListFilter);
        return shoesListFilter;
    }


    public static List<Shoes> parseFileToObjList(String inputFile) {
        try {
            List<Shoes> shoesList = new ArrayList<>();
            File file = new File(inputFile);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String readline = scanner.nextLine();
                String[] shoes = readline.split(";");
                shoesList.add(new Shoes(shoes[0], Integer.parseInt(shoes[1]), Integer.parseInt(shoes[2])));
            }
            return shoesList;
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");

        } catch (
                IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
        return null;
    }

}
