package day17;

import java.util.List;

public class ChessBoard {
    ChessPiece[][] bord;

    public ChessBoard(ChessPiece[][] bord) {
        this.bord = bord;
    }

    public void print() {
        for (int i = 0; i < bord.length; i++) {
            for (int j = 0; j < bord.length; j++) {
                System.out.print(bord[i][j].getStringSymbol());
            }
            System.out.println();
        }
    }
}
