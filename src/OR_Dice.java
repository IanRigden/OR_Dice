import java.util.Random;
import java.util.Scanner;

public class OR_Dice {
    public static void main(String[] args) {
    //Set variables to 0
        int dice1 = 0;
        int dice2 = 0;
        int sixCount = 0;

        Scanner objScanner = new Scanner(System.in);
        System.out.println("How many times should I roll the dice?");
        int rolls = objScanner.nextInt();

        //Loop ??? times
        for (int i = 1; i < rolls+1; i++) {
            //Roll each dice
            dice1 = roll(6);
            dice2 = roll(6);

            //Show each roll.
            if((dice1 == 6) || (dice2 == 6)){
                //Highlight any 6
                System.out.println("Dice1 = " + dice1 + " Dice2 = " + dice2 + " *** SIX! ***");
                //Increment the counter
                sixCount++;
            } else {
                System.out.println("Dice1 = " + dice1 + " Dice2 = " + dice2);
            }
        }

        //Show the final 6 tally.
        System.out.println("A 6 was thrown " + sixCount + " times out of " + rolls + ".");
    }

    private static int roll(int sides) {
        //Return int between 1 and # of sides - always 6 at present lol.
        Random random = new Random();
        return random.nextInt(sides ) +1; // 1 to #sides

    }

}
