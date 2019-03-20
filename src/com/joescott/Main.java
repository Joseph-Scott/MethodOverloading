package com.joescott;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Joe", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore(100);

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + "scored " + score + " points");
        return score * 1000;
    }

}
