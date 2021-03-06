import java.util.Scanner;
public class rock_paper_scissor_game {

	public static void main(String[] args)
	{
		String userInput;
		int userChoice = -1, cpuChoice, timesWon = 0, timesLost = 0, timesTied = 0;
		boolean debug = false;
		// debug = true;
		
		Scanner kb = new Scanner(System.in);
		while( userChoice >= -1)
		{
			
			System.out.print("Please enter your choice of rock, paper, or scissor: ");
			userInput = kb.next();
			
			// Start Choice Assignments
			if( userInput.equalsIgnoreCase("rock") || userInput.equalsIgnoreCase("r") )
				userChoice = 0;
			else if( userInput.equalsIgnoreCase("paper") || userInput.equalsIgnoreCase("p") )
				userChoice = 1;
			else if( userInput.equalsIgnoreCase("scissor") || userInput.equalsIgnoreCase("s") )
				userChoice = 2;
			else if( userInput.equalsIgnoreCase("debug") && debug == true)
				userChoice = 3;
			else
			{
				System.out.println("Invalid choice"); 
				break;
			}
			
			cpuChoice = (int)(Math.random() * 3);

			
			// Initiate Winner Determination
			if( userChoice == 3) 
				System.out.println("You won! You are (wins/loses/ties): "+ ++timesWon +":"+ timesLost +":"+ timesTied);
			else if( userChoice == 0 && cpuChoice == 0) // Rock v Rock
				System.out.println("You tied! You are (wins/loses/ties): "+ ++timesWon +":"+ timesLost +":"+ ++timesTied);
			else if( userChoice == 0 && cpuChoice == 1) // Rock v Paper
				System.out.println("You lost! You are (wins/loses/ties): "+ ++timesWon +":"+ ++timesLost +":"+ timesTied);
			else if( userChoice == 0 && cpuChoice == 2) // Rock v Scissors
				System.out.println("You won! You are (wins/loses/ties): "+ ++timesWon +":"+ timesLost +":"+ timesTied);
			else if( userChoice == 1 && cpuChoice == 0) // Paper v Rock
				System.out.println("You won! You are (wins/loses/ties): "+ ++timesWon +":"+ timesLost +":"+ timesTied);
			else if( userChoice == 1 && cpuChoice == 1) // Paper v Paper
				System.out.println("You tied! You are (wins/loses/ties): "+ timesWon +":"+ timesLost +":"+ ++timesTied);
			else if( userChoice == 1 && cpuChoice == 2) // Paper v Scissors
				System.out.println("You lost! You are (wins/loses/ties): "+ timesWon +":"+ ++timesLost +":"+ timesTied);
			else if( userChoice == 2 && cpuChoice == 0) // Scissors v Rock
				System.out.println("You lost! You are (wins/loses/ties): "+ timesWon +":"+ ++timesLost +":"+ timesTied);
			else if( userChoice == 2 && cpuChoice == 1) // Scissors v Paper
				System.out.println("You won! You are (wins/loses/ties): "+ ++timesWon +":"+ timesLost +":"+ timesTied);
			else if( userChoice == 2 && cpuChoice == 2) // Scissors v Scissors
				System.out.println("You tied! You are (wins/loses/ties): "+ timesWon +":"+ timesLost +":"+ ++timesTied);
			else // Internal Error
			{
				System.err.println("Internal Error"); 
				break;
			}
			
			if(debug == true)
			{
				System.out.println("RAW INFO::userChoice=="+ userChoice +"::cpuChoice==="+ cpuChoice);
			}
			
			System.out.print("Play again(y/n)? ");
			userInput = kb.next();
			
			if( userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes") )
			{
				continue;
			}
			if ( userInput.equalsIgnoreCase("n") || userInput.equalsIgnoreCase("no") )
			{
				break;
			}
			else
			{
				System.out.println("Invalid choice...game over");
				break;
			}
		}
		kb.close();
	}
	
	// Good...especially the comments
