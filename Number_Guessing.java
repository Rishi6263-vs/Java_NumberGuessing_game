import java.util.Random;
import java.util.Scanner;

public class Number_Guessing {
    public static void main(String[] args) {
Random random = new Random();

int number = random.nextInt(100) + 1;
System.out.println("Welcome to the Number Guessing Game!");
System.out.println("I have selected a number between 1 and 100. Can you guess it?");
int guess;
Scanner scanner = new Scanner(System.in);
guess = scanner.nextInt();
while (guess != number) {
    if (guess < number) {
        System.out.println("Too low! Try again.");
    } else {
        System.out.println("Too high! Try again.");
    }
    guess = scanner.nextInt();

}
System.out.println("Congratulations! You guessed the number correctly.");

    }
}