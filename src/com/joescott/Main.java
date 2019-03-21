package com.joescott;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Joe", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

        // Create a method called calcFeetAndInchesToCentimeters
        // It needs to have two parameters.
        // feet is the first parameter, inches is the 2nd parameter
        //
        // You should validate that the first parameter feet is >= 0
        // You should validate that the 2nd parameter inches is >= 0 and <= 12
        // return -1 from the method if either of the above is not true
        //
        // If the parameters are valid, then calculate how many centimeters
        // comprise the feet and inches passed to this method and return
        // that value.
        //
        // Create a 2nd method of the same name but with only one parameter
        // inches is the parameter
        //

        }

    }

    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player " + "scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore() {
        System.out.println("No player name, no player score. ");
        return 0;
    }

}
