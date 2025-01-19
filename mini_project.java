import java.util.Scanner;

public class mini_project {
    public static void main(String[] args) {
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("A Number Between 1 to 100 will be Randomly Generated, and you task is to Guess it.");
        System.out.println("You have only 10 Guesses. Good Luck!");
        System.out.println("LET'S PLAY!");

        System.out.println("Think a Number between 1 and 100: ");

        int finalNumber = (int) (Math.random() * 100) + 1; // Generating a random number between 1 and 100
        int count = 0; // To keep track of the number of guesses
        int guesses; // To keep track of the user's guesses
        Scanner sc = new Scanner(System.in); // To store the user input guesses


        while(true) {
            System.out.println("Enter your Guess: "); // asking the user to enter a number
            guesses = sc.nextInt(); // storing the user's guess in 'guesses' variable
            if(guesses == finalNumber) { // If the user's guess is correct
                System.out.println("Congratulations! You have successfully guessed the number.");
                break;
            }

            else if(guesses < finalNumber) { // if the guessed number is smaller than the correct number
                System.out.print("Your Guess is smaller than the correct number. Try Again!");
                count++;
                System.out.println("You have " + (10 - count) + " guesses left.");
            } else { // if the guessed number is greater than the correct number
                System.out.println("Your Guess is greater than the correct number. Try Again!"); 
                count++;
                System.out.println("You have " + (10 - count) + " guesses left.");
            }

            if(count == 10) {
                System.out.println("\n\nYour Chances are Completed.");
                System.out.println(" Game Over!");
                System.out.println("The Correct Number was: " + finalNumber);
                System.out.println("....................Better Luck Next Time!...................");
                break;
            }
        }

    }
}
    