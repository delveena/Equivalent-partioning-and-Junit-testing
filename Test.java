import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Assignment2Test {

	
	/*
	 //EP1:  credit card < 16 digits
	 
	@Test
	public void SR1()
	{	
		assertEquals("Invalid card", Assignment2.Validate(16578486L));
		
	}
	
	*/
	

	
	/*
	//EP2: credit card > 16 digits
	 
	@Test
	public void SR2()
	{	
		assertEquals("\"Invalid card number, need to have 16 digits only, \"\r\n" + 
			 "\" ALSO, make sure there are no negative numbers, letters, special characters, etc.\"", Assignment2.Validate(3125145643589795869L));
	}
	
	*/
	
	//EP3: checking length of credit card and making sure both sum1 and sum2 add up to 16 and when
	//		and when the sums(sum1 and sum2) get calculated individually, they pick on every other number 
	// and total sum of the algorithm is calculated correctly
	//		
	

	@Test
	public void SR3()
	{	
		assertEquals("Invalid Card", Assignment2.Validate(4444444444444444L));
	}

	
/*	@Test
	public void SR31()
	{	
		assertEquals("Invalid Card", Assignment2.Validate(9999999999999999L));
	}
	
*/
	/*	
	
	// EP4: credit card = 16 but is made up of other input such as negative numbers,(or letters, special characters). .Invalid 
	 
	@Test
	public void SR4()
	{	
		assertEquals("\"Invalid card number, need to have 16 digits only, \"\r\n" + 
			 "\" ALSO, make sure there are no negative numbers, letters, special characters, etc.\"", Assignment2.Validate(-3125145643589795L));
	}
	
	*/
	
	 //* EP5: credit card = 16 digits; however, the end result of the sum of the two steps for the algorithm doesn’t result in 0
	 
	@Test
	public void SR5()
	{	
		assertEquals("Invalid Card", Assignment2.Validate((4024007164160267L)));
		
	}
	
	
	
	 // EP6: credit card = 16 positive numbers and the end result of the sum of the two steps for the algorithm does result in 0
	 
	@Test
	public void SR6()
	{	
		assertEquals("Valid Card", Assignment2.Validate((4024007164160268L)));
		
	}
	
	
	
}