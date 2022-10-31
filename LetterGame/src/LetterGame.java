
import java.util.Scanner;
public class LetterGame {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String cont = "yes";

        //if user answers yes, ask again
        while (cont.equals("yes")) {

        //Ask user to enter any word
        System.out.println("Please enter any word:");

        //Get word input
        String word = input.next();

        //Ask user for letter input
        System.out.println("Which letter in that word do you want to count?");

        //Get letter input
        String letter = input.next();

        //Assign count value zero
        int count = 0;

        //Use a for loop to search the word
            for (int i = 0; i < word.length(); i++) {

                //checking through word
                String currentLetter = word.substring(i, i + 1);

                //if position contains the letter chosen,
                if (currentLetter.equalsIgnoreCase(letter)) {

                    //add one to count
                    count++;

                }//end if statement

            }//end for loop

            //Print results to user
        System.out.println("The letter " + letter + " appears: " + count + " times in the word " + word + "!\n");

        //Ask user if they want to enter another word
        System.out.println("Do you want to enter another word?");

        //get answer from user
        cont = input.next();

            }//end of while loop

    }//end main

    }//end class

