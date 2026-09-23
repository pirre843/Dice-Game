package se.iths.pierre.Dicegame;

import java.util.random.RandomGenerator;

public class Player {


    private String firstName;
    private String lastName;
    private int score;
    private int dice1;
    private int dice2;

    //skicka in firstname och lastname här istället


    public Player(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = 0;
    }

    public String getFirstName() {
        return firstName;

    }

    public String getlastName() {
        return lastName;


    }

    public int rollDice() {
        return RandomGenerator.getDefault().nextInt(1, 7);


    }

    public void showScore() {
        IO.println("poäng: " + score);


    }

    public void addToScore(int points) {
        this.score += points;

    }

    public String getFullName() {
        return firstName + " " + lastName;


        //ska returnera firstname + " " + lastname

    }


    public int getScore() {
        return score;
    }

    //playerOne.addToScore();
    //playerTwo.addToScore();

    public int getDice1() {
        return dice1;

    }


    public int getDice2() {
        return dice2;
    }
}

/*
    private String firstname;
    private String lastname;
   // private int dice1;
    //private int dice2;

   // public Player(String firstname, String lastname) {
     //   this.firstname = firstname;
       // this.lastname = lastname;
   // }
    public String getFullName() {
        return this.firstname + " " + this.lastname;
    }



        this.random = new Random();

    }

    public int rollDice() {
        int diceRoll = RandomGenerator.getDefault().nextInt(1, 7)
        int diceRoll = RandomGenerator.getDefault().nextInt(1, 7)
        int Score = dice1 + dice2;

        this.score += total;
        return total;

    }

    public void addToScore(int score) {
        this.score += score;
    }

    public int getScore() {
        return score;
    }


    }

    public String getFullName() {
        return fullName;

    }






    //public String toString() {
       // return fullName + score;





int dice1 = RandomGenerator.getDefault().nextInt(1, 7);

public void AddToScore(int dice1, int dice2) {
    this.dice1 += dice2;
    IO.println("roll your dices" + dice1 + " and " + dice2);


}
}

*/





