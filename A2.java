//import java.util.*;

public class Assignment2 {
	
	public static String Validate(long cardNumber)
	{
				
				String ccValid = "";
				//String cardString = "";
				
				 //const for card length that is equal to 16
				 final int CARD_LENGHT = 16;
				 int num = 0;
				 
				 // temparary length
				 //sum1 for first part of algorithm
				 //sum2 for second part of algorithm
				 
				 int length, sum1=0, sum2=0, finalSum=0;
				 
				 // digitArray that will take in CARD_LENGTH number
				 int[] digitArray = new int[CARD_LENGHT];

				 // reads the eight digit card number
				 do
				{
					 System.out.println("Enter the 16 digit card number: " );
				 
				 //**********1st ERROR***************
				 // get the card length
				// length = (int) (Math.log10(cardNumber) + 1);
				//*******************************	
				 
				 length = ((Long.toString(cardNumber)).length());
				 
				 if (length != CARD_LENGHT)
					 {
					
					 // *********** Typo Error: 8 should be 16 and added some of my own ***********
					 //	 System.out.println("Invalid card number, need to have 8 digits");
					 	System.out.println("Invalid card number, need to have 16 digits exactly, "
					 			+ " ALSO, make sure there are no negative numbers, letters, special characters, etc.");
					 	
					 }
				 	
				 	
				 }while(length != CARD_LENGHT);


				 // get each digit from the card number and set the digitArray
				 int i = CARD_LENGHT - 1;

				 while(cardNumber > 0)
				 {
					 digitArray[i] = (int)(cardNumber%10);
					 cardNumber = cardNumber/10;
					 i = i - 1;

				 }
				 
				 //*********************ERROR 2 ****************
				 //changed** i>=2 in for loop to i>=0
				 // starting from the right most digit add every other digit to sum 1
				 for(i= CARD_LENGHT - 1;  i >=0 ; i= i -2)
				 {
					 sum1 =  sum1 + digitArray[i];
				 }

				 // get each digit not counted in above, multiply by 2 and add each digit of  multiplied
				 // numbers to sum 2
				 // r remainder int
				 
				 int r = 0;

				 
				 for(i= CARD_LENGHT - 2;  i >= 0; i= i-2)
				 {
					 	num = digitArray[i]*2;
					 
					 while(num>0)
					 {
						 r = num%10;
						 sum2 = sum2+r;
						 num = num/10;
					 }
				 }


				 // find the final sum
				 finalSum = sum1 + sum2;
				 System.out.println(finalSum);
				 
				 // check if the last digit of the final sum is 0
				 if(finalSum%10 == 0)
				 {
					 ccValid = "Valid Card";
					System.out.println(ccValid);
				 }else
				 {
					 ccValid = "Invalid Card";
					System.out.println(ccValid);
				 }
				 
				 return ccValid;
	}

	//digit array that calculates the total sum of the digits
	public static int dd(int digitArray[])
	{
		int numInteger = 0;
		int total = 0;
		String cardString = "";

		for(int i = 0; i <digitArray.length; i = i+2)
		{
			numInteger = digitArray[i]*2;
			cardString = cardString+Integer.toString(numInteger);
		}
		
		numInteger = Integer.parseInt(cardString);
		
		while(numInteger > 0 )
		{
			total = total + numInteger%10;
			numInteger = numInteger/10;
		}		
		return total;
	}
	
}