package day17;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<ChessPiece> list = new ArrayList<>();
        list.add(ChessPiece.PAWN_WHITE);
        list.add(ChessPiece.PAWN_WHITE);
        list.add(ChessPiece.PAWN_WHITE);
        list.add(ChessPiece.PAWN_WHITE);
        list.add(ChessPiece.ROOK_BLACK);
        list.add(ChessPiece.ROOK_BLACK);
        list.add(ChessPiece.ROOK_BLACK);
        list.add(ChessPiece.ROOK_BLACK);

        for (ChessPiece figure : list){
            System.out.print(figure.getStringSymbol() + " ");
        }
    }
}