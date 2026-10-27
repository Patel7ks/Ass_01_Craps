import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rnd = new Random();

        String playAgain = "y";

        while(playAgain.equalsIgnoreCase("y")){

            System.out.println("\n--- New Craps Game ---");

            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int sum = die1 + die2;

            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Sum: " + sum);

            if (sum == 2){
                System.out.println("Craps! You lost.");
            }
            else {
                if (sum == 3){
                    System.out.println("Craps! You lost.");
                }
                else{
                    if (sum == 12){
                        System.out.println("Craps! You lost.");
                    }
                    else{
                        if (sum == 7){
                            System.out.println("Natural! You won.");
                        }
                        else{
                            if (sum == 11){
                                System.out.println("Natural! You won.");
                            }
                            else{

                                int point = sum;
                                boolean gameOver = false;

                                System.out.println("The point is " + point + ".");

                                while (!gameOver) {
                                    System.out.println("Trying for point......");

                                    die1 = rnd.nextInt(6) + 1;
                                    die2 = rnd.nextInt(6) + 1;
                                    sum = die1 + die2;

                                    System.out.println("Die 1: " + die1);
                                    System.out.println("Die 2: " + die2);
                                    System.out.println("Sum: " + sum);

                                    if (sum == point){
                                        System.out.println("Made point and Won!");

                                        gameOver = true;
                                    }
                                    else{
                                        if (sum == 7){
                                            System.out.println("Got a seven and lost.");

                                            gameOver = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            System.out.print("Do you want to play again? (y/n): ");
            playAgain = input.next();

        }
        System.out.println("Thanks for playing Craps!");

        input.close();
    }
}