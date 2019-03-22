package com.joescott;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Joe", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetAndInchesToCentimeters(6, 0);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }

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
        // validate that its >= 0
        // return -1 if it is not true
        // But if its valid, then calculate how many feet are in the inches
        // and then here is the trick part
        // call the other overloaded method passing the correct feet and inches
        // calculated so that it can calculate correctly.
        //
        // Hints: Using double for your number datatypes is probably a good idea
        // 1 inch = 2.54cm and 1 foot = 12 inches
        // Use the link I give you to confirm your code is calculating correctly.
        // Calling another overloaded method just requires you to use the right number of parameters.
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
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
