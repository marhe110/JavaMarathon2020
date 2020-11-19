package finishTask;

public enum Squares {
    IS_SHIP("⛵ "),
    IS_HALO("\uD83D\uDFE6 "),
    IS_EMPTY("\uD83D\uDFE5");

    private String symbol;

    Squares(String symbol){
    this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }
}

//    У игрового поля должен быть метод, который выводит это поле в консоль.
//        Свободные ячейки изображайте с помощью символа ⬜:
//        System.out.print("⬜");
//        Ячейки с кораблями изображайте с помощью символа 🛥 (код символа - \uD83D\uDEE5)
//        Ореол кораблей изображайте с помощью символа 🟦 (код символа - \uD83D\uDFE6)
//        Подбитую ячейку изображайте с помощью символа 🟥 (код символа - \uD83D\uDFE5)
