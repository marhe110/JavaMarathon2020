package finishTask;

public class Pixel {//расширенный энам
    private int positionX;
    private int positionY;
    private Squares squares;

    public Pixel(Squares squares, int positionX, int positionY) {
    this.squares = squares;
    this.positionX = positionX;
    this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public Squares getSquares() {
        return squares;
    }

    public void setSquares(Squares squares) {
        this.squares = squares;
    }
//        this.positionX = positionX;
//        this.positionY = positionY;
//        this.squares = squares;
//    }
}
