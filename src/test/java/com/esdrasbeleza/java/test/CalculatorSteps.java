package com.esdrasbeleza.java.test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

import com.esdrasbeleza.java.Calculator;

public class CalculatorSteps {

	private Calculator calculator;
	private int number;
	private int result;
	
	@Given("a number $number")
	public void aNumber(int number) {
		calculator = new Calculator();
		this.number = number; 
	}
	
	@When("we multiply it by $number")
	public void multiplyBy(int number) {
		result = calculator.multiply(this.number, number);
	}
	
	@Then("the result is $number")
	public void assertResult(int number) {
		assertThat(result, equalTo(number));
	}
	
}
