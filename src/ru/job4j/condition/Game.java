package ru.job4j.condition;

public class Game {
    public static int checkGame(double percent, int prize, int pay) {
        int rsl = 0;
        if (percent * prize > pay) {
            rsl = (int) (percent * prize - pay);
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(checkGame(0.504, 100, 50));
    }
}
