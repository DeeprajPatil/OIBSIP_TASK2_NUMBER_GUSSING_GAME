// Patil Deepraj Bharat
// Task-2 Number Guessing
// Java Programming


import java.io.*;
import java.util.*;
public class Number_Guessing {

	public static void Num_Guessing()
	{
		Scanner sc = new Scanner(System.in);

        //use Math.random method to generate a number randomly
		int num = 1 + (int)(99*Math.random());

		int attempts = 7; //No. of attempts

		int guess_num,i,again,points=0;
		
		System.out.println("\nWelcome to the Number Guessing game..");
		System.out.println("Input a number between 1 to 100");
		
		
		for(i=0; i<7; i++) 
        {
			System.out.println("\nTry to Guess a number..");
			guess_num=sc.nextInt();
			
			
			if(guess_num>100 || guess_num<0) 
            {
				System.out.println("Sorry!! You have to enter only number between 1 to 100");
			}
			else if(guess_num==num) 
			{
				System.out.println("Congrats!! You guessed right");
				points+=10;
				System.out.println("Your score is : "+points);
                System.out.println("\nDo you want to play again..");
                System.out.println("If you want to play again then enter 1 otherwise enter 0");
			    again=sc.nextInt();

                if(again == 1)
                {
                    Num_Guessing();
                }
                else
                {
                    System.out.println("Thank You!! See You Again....");
					break;
                }
				break;
			}
			else if (guess_num>num && i!=attempts-1) 
            {
				System.out.println("Oops! Number is less than "+guess_num);
			}
			else if(guess_num<num && i!=attempts-1) 
            {
				System.out.println("Oops! Number is greater than "+guess_num);
			}
           
        }

		if(attempts == i) 
        {
			System.out.println("\nyou have completed attempts");
			System.out.println("\nThe number is : "+num);
			System.out.println("\n\nDo you want to play again..");
			System.out.println("If you want to play again then enter 1 otherwise enter 0");
			again=sc.nextInt();
			
			
			if(again == 1) 
            {
				Num_Guessing();   //this will call method again and start game again
			}

			else 
            {
				System.out.println("Thank You!! See You Again....");
			}
		}
		sc.close();
	}
	public static void main(String[] args) {
		Num_Guessing();
	}
}