package day7;

public class Player {
    private int stamina;
    final int MAX_STAMINA = 100;
    final int MIN_STAMINA = 0;
    private boolean plays;
    private static int countPlayers;
    private static int allStamina;

    public Player(int stamina) {
            if (countPlayers < 6) {
                countPlayers++;
                allStamina += stamina;
                this.plays = true;
                this.stamina = stamina;
            } else {
                info();
            }
    }

    public static int getAllStamina() {
        return allStamina;
    }

    public void run() {
        if (this.stamina > 0) {
            this.stamina--;
            allStamina--;
        }
        if (this.stamina <= 0 && this.plays) {
            countPlayers--;
            this.plays = false;
        }
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public int getStamina() {
        return this.stamina;
    }

    public static void info() {
        int count = 6 - countPlayers;
        switch (countPlayers) {
            case 6:
                System.out.println("На поле нет свободных мест");
                break;
            default:
                System.out.println("Команды не полные. На поле есть еще " + count + " свободных мест");
                break;
        }
    }
}
