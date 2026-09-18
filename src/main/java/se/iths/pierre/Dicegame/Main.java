package se.iths.pierre.Dicegame;

import java.util.random.RandomGenerator;

public class Main {


    void main() {


        String player1firstName = IO.readln("Player 1: Ange ditt förnamn: ");
        IO.println(player1firstName);
        String player1lastName = IO.readln("Player 1: Ange ditt Efternamn: ");
        IO.println(player1lastName);
        String player2firstName = IO.readln("Player 2: Ange ditt förnamn: ");
        IO.println(player2firstName);
        String player2lastName = IO.readln("Player 2: Ange ditt Efternamn: ");
        IO.println(player2lastName);

        String input = IO.readln("Player 1: kasta ditt första kast med tärningarna");
        int dice1 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice2 = RandomGenerator.getDefault().nextInt(1, 7);
        int score = dice1 + dice2;
        IO.println("Du fick poäng: " + score);
        String input1 = IO.readln("Player 2: Kasta ditt första kast med tärningarna");
        int dice3 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice4 = RandomGenerator.getDefault().nextInt(1, 7);
        int score2 = dice3 + dice4;
        IO.println("Du fick poäng: " + score2);
        String input2 = IO.readln("Player 1: Kasta ditt andra kast med tärningarna");
        int dice5 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice6 = RandomGenerator.getDefault().nextInt(1, 7);
        int score5 = dice5 + dice6;
        IO.println("Du fick poäng: " + score5);
        String input3 = IO.readln("Player 2 Kasta ditt andra kast med tärningarn");
        int dice7 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice8 = RandomGenerator.getDefault().nextInt(1, 7);
        int score8 = dice7 + dice8;
        IO.println("Du fick poäng: " + score8);
        int score10 = dice1 + dice2 + dice5 + dice6;
        int score11 = dice3 + dice4 + dice7 + dice8;
        int totalpoäng = score10 + score11;
        IO.println("Grattis till vinnaren!! :) ");
        IO.println("Player 1: " + player1firstName + player1lastName + score10);
        IO.println("Player 2: " + player2firstName + player2lastName + score11);
        IO.println("Totalpoäng: " + totalpoäng);
    }
}       /* IO.println("Player1 You Start");
            IO.println("Player1 roll your first dice");
            diceRoll = RandomGenerator.getDefault().nextInt(1, 7)
            public void addToScore ( int score)
            IO.println("Player1 roll your second dice");
            diceRoll = RandomGenerator.getDefault().nextInt(1, 7)





   /* public int rollDice() {
        int player1 = diceRoll = RandomGenerator.getDefault().nextInt(1, 7)
        int player1 = diceRoll = RandomGenerator.getDefault().nextInt(1, 7)
        int Score = dice1 + dice2;

        this.score += total;
        return total;*/


