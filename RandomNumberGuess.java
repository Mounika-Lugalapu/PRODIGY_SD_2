import java.util.Random;
import java.util.Scanner;
public class RandomNumberGuess {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your name");
        String name = scan.nextLine();

        System.out.println("Well, " + name + " I thought a number between 1 and 20");
        int myNum = getRandomNumber(1, 21);

        int attempts = 0;
        for(int i = 0; i < 6; i++){

           attempts++;

            Scanner scan1 = new Scanner(System.in);
            System.out.println("Guess it");
            int YourGuess = scan1.nextInt();

            if(YourGuess == myNum) {
                System.out.println("You guessed it correctly!");
                  System.out.println("Your attempts : " + attempts );
                break;
            }
            else if(YourGuess < myNum){
                System.out.println("Your guess is too low");
            }
            else if(YourGuess > myNum){
                System.out.println("Your guess is too high");
            }
            if( i>= 5){
                System.out.println();
                System.out.println(" Nope. The number I was thinking of was " + myNum + "!");
              
            }
        }
    }
    public static int getRandomNumber(int min, int max){
        Random random = new Random();
        return random.ints(min,max).findFirst().getAsInt();
    }
}