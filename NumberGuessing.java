import java.util.Scanner;
import java.util.Random;

class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc		= new Scanner(System.in);
        Random ran = new Random();
        
        int minNum = 1;
        int maxNum = 100;
        int targetNum = ran.nextInt(maxNum - minNum + 1) + minNum;
        
        int guess;
        int attempts = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + minNum + " and " + maxNum + ".");
        
        do {
            System.out.print("Guess the number: ");
            guess = sc.nextInt();
            attempts++;
            
            if (guess < targetNum) {
                System.out.println("Hint: The number is higher.");
            } else if (guess > targetNum) {
                System.out.println("Hint: The number is lower.");
            }
        } while (guess != targetNum);
        
        System.out.println("Congratulations! You guessed the number " + targetNum + " in " + attempts + " attempts.");
        sc.close();
    }
}
 