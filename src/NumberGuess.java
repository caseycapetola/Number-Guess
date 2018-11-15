import java.util.Scanner;
import java.util.Random;
/**
 * 
 * @author Casey Capetola
 * Number Guess
 *
 */
public class NumberGuess 
{

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		Random rand = new Random();
		int  n = rand.nextInt(20) + 1;
		System.out.print("Enter a number between 1 and 20: ");
		int number = Integer.parseInt(user.nextLine());
		
		if(number>20||number<0)
		{
			System.out.print("\nYour guess is invalid.");
		}
		else if(number!=n)
		{
			System.out.print("\nYour guess is incorrect. The number is: " + n);
		}
		else(n==number)
		{
			System.out.print("\nYour guess is correct. The number is: " + n);
		}
			
				

	}

}
