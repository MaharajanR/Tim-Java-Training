package com.maharajan;

public class Main {

    public static void main(String[] args) {
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculate(true, score, levelCompleted, bonus);
        score = 10000;
        levelCompleted = 8;
        bonus = 200;
        calculate(true, score, levelCompleted, bonus);
        displayHighScorePosition("Maharajan", 1);
        int returnScore = calculateHighScorePosition(1500);
        System.out.println("1500 result : "+returnScore);
         returnScore = calculateHighScorePosition(900);
        System.out.println("900 result : "+returnScore);
         returnScore = calculateHighScorePosition(400);
        System.out.println("400 result : "+returnScore);
         returnScore = calculateHighScorePosition(50);
        System.out.println("50 result : "+returnScore);

    }

    public static void calculate(boolean gameOver, int score, int levelCompleted, int bonus) {
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was " + finalScore);
        }
    }

    public static void displayHighScorePosition(String playersName, int position) {
        {
            System.out.println(playersName + " managed to get into position " + position + " on the high score table");
        }
    }

    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }
}
