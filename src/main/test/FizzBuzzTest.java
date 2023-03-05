import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	
	@Test
	public void fizzBuzzCheckWhenUserInputsOrdinaryNumber()
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
	}
	
	
	
	

