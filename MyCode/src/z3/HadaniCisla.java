/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package z3;

/**
 *
 * @author wolfi
 */
import java.util.Scanner;
import java.util.Random;

public class HadaniCisla {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    setRange();
    boolean gaming = true;
    while (gaming==true){
            System.out.println("'Guessing numbers' game");
            System.out.println("1. Make the computer guess (Think of a number and the computer will try to guess)");
            System.out.println("2. Guess the number (The computer selects a number and you guess)");
            System.out.println("3. Set number range");
            System.out.println("4. End game");
            System.out.print("Choose action: ");
            
            int choice = sc.nextInt();
            switch(choice){
                case 1: computerGuesses(); break;
                case 2: userGuesses(); break;
                case 3: setRange(); break;
                case 4: gaming=false; break;
            }
    
    }
    
    }
    
    
    static int min = 1;
    static int max = 100;
    public static void setRange() {
        System.out.print("Enter the minimum value: ");
        min = sc.nextInt();
        System.out.print("Enter the maximum value: ");
        max = sc.nextInt();
        System.out.println("Range set to: " + min + " - " + max);
    }
    
    
    public static void computerGuesses() {
        int low = min;
        int high = max;
        int attempts = 0;

        System.out.println("Think of a number between " + min + " and " + max + ". The computer will guess it.");
        while (true) {
            int mid = low + (high - low) / 2;
            attempts++;
            System.out.println("The computer guesses: " + mid);
            System.out.println("1: Correct!");
            System.out.println("2: My number is smaller");
            System.out.println("3: My number is larger");
            System.out.print("Choose: ");
            int response = sc.nextInt();

            if (response == 1) {
                System.out.println("The computer guessed the number " + mid + " in " + attempts + " attempts.");
                break;
            } else if (response == 2) {
                high = mid - 1;
            } else if (response == 3) {
                low = mid + 1;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
        
        
        public static void userGuesses() {
            Random random = new Random();
            int thoughtNumber = random.nextInt(max - min + 1) + min;
            int attempts = 0;

            System.out.println("The computer is thinking of a number between " + min + " and " + max + ". Try to guess it.");
            while (true) {
                System.out.print("Enter your guess: ");
                int guess = sc.nextInt();
                attempts++;

                if (guess == thoughtNumber) {
                    System.out.println("You guessed the number " + thoughtNumber + " in " + attempts + " attempts.");
                    break;
                } else if (guess > thoughtNumber) {
                    System.out.println("My number is smaller.");
                } else {
                    System.out.println("My number is larger.");
                }
        }
    }

}
