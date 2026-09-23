package se.iths.pierre.Dicegame;

import java.util.random.RandomGenerator;

public class Main {


    void main() {


        String playerOnefirstName = IO.readln("Player 1: Ange ditt förnamn: ");
        IO.println(playerOnefirstName);
        String playerOnelastName = IO.readln("Player 1: Ange ditt Efternamn: ");
        IO.println(playerOnelastName);

        //skapa en instans av Player för player one

        Player playerOne = new Player(playerOnefirstName, playerOnelastName);


        //playerOne.addToScore();


        String playerTwofirstName = IO.readln("Player 2: Ange ditt förnamn: ");
        IO.println(playerTwofirstName);
        String playerTwolastName = IO.readln("Player 2: Ange ditt Efternamn: ");
        IO.println(playerTwolastName);

        //skapa en instans av Player för player two
        Player playerTwo = new Player(playerTwofirstName, playerTwolastName);


        String input = IO.readln("Player 1: kasta ditt första kast med tärningarna");
        int dice1 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice2 = RandomGenerator.getDefault().nextInt(1, 7);
        playerOne.addToScore(dice1 + dice2);    //int score = dice1 + dice2
        IO.println("Du fick poäng: " + playerOne.getScore());
        String input1 = IO.readln("Player 2: Kasta ditt första kast med tärningarna");
        int dice3 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice4 = RandomGenerator.getDefault().nextInt(1, 7);
        playerTwo.addToScore(dice3 + dice4);
        // IO.println("Du fick poäng: " + score);
        String input2 = IO.readln("Player 1: Kasta ditt andra kast med tärningarna");
        int dice5 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice6 = RandomGenerator.getDefault().nextInt(1, 7);
        playerOne.addToScore(dice5 + dice6);
        //IO.println("Du fick poäng: " + score5);
        String input3 = IO.readln("Player 2 Kasta ditt andra kast med tärningarn");
        int dice7 = RandomGenerator.getDefault().nextInt(1, 7);
        int dice8 = RandomGenerator.getDefault().nextInt(1, 7);
        playerTwo.addToScore(dice7 + dice8);
        //IO.println("Du fick poäng: " + addToScore(score8)
        int score10 = dice1 + dice2 + dice5 + dice6;
        int score11 = dice3 + dice4 + dice7 + dice8;
        int totalpoäng = score10 + score11;

        if (playerOne.getScore() > playerTwo.getScore()) {
            IO.println(playerOne.getFullName() + " " + "Du vann!");

        } else if (playerTwo.getScore() > playerOne.getScore()) {
            IO.println(playerTwo.getFullName() + " " + "Du vann!");

        } else {
            IO.println("Det blev oavgjort");
        }
    }

}
//         .println("Player 1: " + playerOne.getFullName() + " " + " " + playerOne.getScore());
//IO.println("Player 2: " + playerTwo.getFullName() + " " + " " + playerTwo.getScore());
//IO.println("Totalpoäng: " + totalpoäng);

    /* IO.println("Player1 You Start");
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


