import java.util.Scanner;

public class GuessANumberGame
{

        public static void main(String[] args)
        {

                Scanner inp = new Scanner (System.in);
                int userGuess;
                int generatedNumberToGuess;

                for (int round = 1; round < 4; round++)
                {
                        generatedNumberToGuess = 0 +(int) (Math.random()* 10);
                        System.out.println("Guess a number between 0 and 10: ");
                        userGuess = inp.nextInt();

                        System.out.printf("Random number is %d\n", generatedNumberToGuess);

                    if (userGuess < generatedNumberToGuess)
                        {
                                System.out.println("Your guess was too low");
                        }

                        else if (userGuess > generatedNumberToGuess)
                        {
                                System.out.println("Your guess was too high");
                        }

                    else
                    {
                                System.out.println("Your guess was correct");
                    }
                }

                System.out.println("Bye Bye");
        }

}