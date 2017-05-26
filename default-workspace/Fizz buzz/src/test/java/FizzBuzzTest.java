import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void shouldSayOne() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(1); // act
		Assert.assertEquals("1", response); // assert
	}
	
	@Test
	public void shouldSayTwo() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(2); // act
		Assert.assertEquals("2", response); // assert
	}
	
	@Test
	public void shouldSayFizzForThree() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(3); // act
		Assert.assertEquals("Fizz", response); // assert
	}

	@Test
	public void shouldSayBuzzForFive() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(5); // act
		Assert.assertEquals("Buzz", response); // assert
	}
	
	@Test
	public void shouldSayFizzForSix() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(6); // act
		Assert.assertEquals("Fizz", response); // assert
	}
	
	@Test
	public void shouldSayBuzzForTen() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(10); // act
		Assert.assertEquals("Buzz", response); // assert
	}
	@Test
	public void shouldSayFizzBuzzforFifteen() {
		FizzBuzz underTest = new FizzBuzz(); // arrange
		String response = underTest.say(15); // act
		Assert.assertEquals("Buzz", response); // assert
	}
	
}