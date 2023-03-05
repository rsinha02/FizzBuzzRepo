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
	    Assert.assertEquals("Fizz",fizzBuzz.fizzBuzzTestWhenUserInputsThree(3));
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
 
} 
	
	

