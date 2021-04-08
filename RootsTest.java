import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RootsTest {
	
	/*
	 * EP1: if a = 0 and one tries to apply the quadratic formula,
	 * this will be invalid because (0)x^2 = 0: this gets rid of the 
	 * equation being quadratic; for instance, (0)x^2 + 4x-3 = 4x-3 is not quadratic
	 * Not quadratic
	 */
	@Test
	public void SR1() 
	{
		Roots.calculate_roots(0, 4, 3);
		assertEquals(Roots.num_roots,(0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}

	
	/*
	 * EP2: b^2-4ac>0 means there exists two real roots(real-numbers)
	 * There exists two real roots(real-numbers)
	 */
	@Test
	public void SR2() 
	{
		Roots.calculate_roots(2, -11, 5);
		assertEquals(Roots.num_roots, (2));
	}
	
	/*
	 * EP3: b^2-4ac = 0 means there exists one real root(real-numbers) 
	 * There exists two real roots(real-numbers)
	 */
	@Test
	public void SR3() 
	{
		Roots.calculate_roots(-4, 12, -9);
		
		assertEquals(Roots.num_roots,(1));
	}
	
	/*
	 *b^2-4ac < 0 means there are no real root(s)(Imaginary numbers/non-real numbers)
	 *No real root(s): Imaginary numbers (non-real numbers) 
	 */
	@Test
	public void SR4() 
	{
		Roots.calculate_roots(2, -4, 4);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR5() 
	{
		Roots.calculate_roots(2, -10, 2);
		assertEquals(Roots.num_roots,(2));
		//assertEquals(Roots.root_one,());
		//assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR6() 
	{
		Roots.calculate_roots(10, 12, 0);
		assertEquals(Roots.num_roots, (2));
	//	assertEquals(Roots.root_one,(-1));
	//	assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR7() 
	{
		Roots.calculate_roots(10, 0, 0);
		assertEquals(Roots.num_roots, (1));
	//	assertEquals(Roots.root_one,(-1));
	//	assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR8() 
	{
		Roots.calculate_roots(10, 0, 1);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR9() 
	{
		Roots.calculate_roots(10, 1, 1);
		assertEquals(Roots.num_roots, (0));
	//	assertEquals(Roots.root_one,(-1));
	//	assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR10() 
	{
		Roots.calculate_roots(1, 1, 1);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR11() 
	{
		Roots.calculate_roots(1, 0, 1);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR12() 
	{
		Roots.calculate_roots(1, 0, 0);
		assertEquals(Roots.num_roots, (1));
		//assertEquals(Roots.root_one,(-1));
		//assertEquals(Roots.root_two, (-1));
	}
	@Test
	public void SR13() 
	{
		Roots.calculate_roots(12, 12, 12);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR14() 
	{
		Roots.calculate_roots(100, 100, 100);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR15() 
	{
		Roots.calculate_roots(100, 99, 100);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR16() 
	{
		Roots.calculate_roots(12,6 ,2);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR17() 
	{
		Roots.calculate_roots(50,99,50);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
	
	@Test
	public void SR18() 
	{
		Roots.calculate_roots(60,0,60);
		assertEquals(Roots.num_roots, (0));
		assertEquals(Roots.root_one,(-1));
		assertEquals(Roots.root_two, (-1));
	}
}
