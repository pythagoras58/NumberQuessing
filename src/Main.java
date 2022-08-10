import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Ini
        Scanner scanner =  new Scanner(System.in);
        boolean hasWon = false;
        // select a number between 1 and 100
        int randomNumber = (int)( Math.random() * 100 + 1);
        System.out.println("=====Number Guessing====");
        System.out.println("Randomly Select a number between 1 and 100");

//        System.out.println(randomNumber);

        for(int i=10; i>0;i--){
            System.out.println("You have " + i + " guesses -> try again");
            int guess = scanner.nextInt();

            if(randomNumber < guess){
                System.out.println("You guess is high");
            }
            if (randomNumber > guess){
                System.out.println("You guess is low");
            }
            if(randomNumber == guess){
                hasWon = true;
                break;
            }
        }

        if(hasWon==true){
            System.out.println("You Won");
        }else {
            System.out.println("Looser");
            System.out.println("The number is " + randomNumber);
        }
    }
}
