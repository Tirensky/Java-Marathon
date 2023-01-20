package day7.task2;

public class Player {
    private int stamina;
    private final int MAX_STAMINA = 100;
    private final int MIN_STAMINA = 0;
    private static int countOfPlayers;

    public Player(int stamina) {
        this.stamina = Math.min(stamina, MAX_STAMINA);
        if (countOfPlayers < 6) {
            countOfPlayers++;
        }
    }

    public static void countPlayers() {
        System.out.println("Игроков на поле: " + countOfPlayers);;
    }

    public int getStamina() {
        return stamina;
    }

    public void run() {
        if (stamina == 0) {
            return;
        }
        stamina--;
        if (stamina == MIN_STAMINA) {
            countOfPlayers--;
        }
    }

    public static void info() {
        if (countOfPlayers < 6) {
            System.out.println("Команды неполные. На поле есть ещё " + (6 - countOfPlayers) + " свободных мест.");
        } else {
            System.out.println("На поле нет свободных мест.");
            countPlayers();
        }
    }
}
