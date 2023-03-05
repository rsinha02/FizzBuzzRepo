import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	
	@Test
	public void fizzBuzzCheckWhenUserInputsOne()
	{
		FizzBuzz fizzBuzz= new FizzBuzz();
         Assert.assertEquals("1",fizzBuzz.fizzBuzzTestWhenUserInputsOne(1));
   }
	
	@Test
	public void fizzBuzzCheckWhenUserInputsTwo()
	{
	FizzBuzz fizzBuzz= new FizzBuzz();
    Assert.assertEquals("2",fizzBuzz.fizzBuzzTestWhenUserInputsTwo(2));
	}	
	
	@Test
	public void fizzCheckWhenUserInputsThree()
	{
		FizzBuzz fizzBuzz= new FizzBuzz();
	    Assert.assertEquals("Fizz",fizzBuzz.fizzBuzzTestWhenUserInputsThreeOrItsMultiple(3));
		}	
	

 @Test 
 public void fizzBuzzCheckWhenUserInputsFour() 
 {
	 FizzBuzz fizzBuzz= new FizzBuzz(); 
	 Assert.assertEquals("4", fizzBuzz.fizzBuzzTestWhenUserInputsFour(4));
	 
 }
 
 @Test
 public void fizzBuzzCheckWhenUserInputsFive()
 {
	 FizzBuzz fizzBuzz= new FizzBuzz(); 
	 Assert.assertEquals("Buzz", fizzBuzz.fizzBuzzTestWhenUserInputsFive(5));
	 
 }
 
 @Test
 public void fizzBuzzCheckWhenUserInputsSix()
 {

	 FizzBuzz fizzBuzz= new FizzBuzz(); 
	 Assert.assertEquals("Fizz", fizzBuzz.fizzBuzzTestWhenUserInputsThreeOrItsMultiple(6));
 }
 
 @Test
 public void fizzBuzzCheckWhenUserInputsOrdinaryNumber()
 {

	 FizzBuzz fizzBuzz= new FizzBuzz();
	 System.out.println("Enter the number");
	 Scanner sc=new Scanner(System.in);
     int n = sc.nextInt();
	 Assert.assertNotNull(fizzBuzz.fizzBuzzTestWhenUserInputsOrdinaryNumber(n));
	 
 }
 
 
 
 
} 
	
	

