import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner number = new Scanner(System.in);
        int random_number = random.nextInt(11);
        System.out.println("Hello!!! Lets see if you can guess a random number.");
        System.out.println("Guess a number between 0 to 10");
        int guess_number = number.nextInt();
        do{
            if(guess_number < random_number){
                System.out.println("Oops , you guessed a smaller number. Try again.");
            }else if(guess_number > random_number){
                System.out.println("Oops , you guessed a larger number. Try again.");
            }
            System.out.println("If you want to quit , press -1");
            guess_number = number.nextInt();
        }while(guess_number != random_number || guess_number == -1);
        if(guess_number == random_number){
            System.out.println("You guessed the correct number i.e " + guess_number + "\n \tCongratulations!!!");
        }else{
            System.out.println("Sorry , you could not guessed the correct number.\n Exiting program");
        }

    }
}