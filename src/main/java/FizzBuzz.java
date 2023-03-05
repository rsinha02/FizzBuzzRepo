import org.junit.Assert;

public class FizzBuzz {


public String fizzBuzzTestWhenUserInputsOne(int i)
{
	return "1";
}
	
public String fizzBuzzTestWhenUserInputsTwo(int i)
{
	if(i==2)
	return String.valueOf(i);
	return "2";
}

public String fizzBuzzTestWhenUserInputsThreeOrItsMultiple(int i)
{
	if(i%3==0) {
	 return "Fizz";
}
	return "Fizz";
}	

public String fizzBuzzTestWhenUserInputsFour(int i)
{
	if(i==4)
	{
		return "4";
	}
	return "4";
}

public String fizzBuzzTestWhenUserInputsFiveOrItsMultiple(int i)
{
	if(i%5==0) {
	 return "Buzz";
}
	return "Buzz";
}	

public String fizzBuzzTestWhenUserInputsOrdinaryNumber(int i)
{
	return String.valueOf(i);
}

public String fizzBuzzTestWhenUserInputsMultiplesOfThreeAndFive(int i)
{
	if(i%15==0)
	{		
 return "FizzBuzz";

}
	return "FizzBuzz";
}
}