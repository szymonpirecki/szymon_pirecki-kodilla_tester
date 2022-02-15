package homework;

import io.cucumber.java8.En;
import org.junit.Assert;

public class IsNumberDivisibleBySteps implements En {
    private int number;
    private String respond;


   public IsNumberDivisibleBySteps() {
       Given("the number to be checked is {int}", (Integer int1) -> {
           // Write code here that turns the phrase above into concrete actions
           this.number = int1;
       });

       When("I ask if this number is divisible by divider", () -> {
           // Write code here that turns the phrase above into concrete actions
           FizzBuzz fizzBuzz = new FizzBuzz();
           this.respond = fizzBuzz.fizzBuzz(this.number);
       });

       Then("I should be told {string}", (String string) -> {
           // Write code here that turns the phrase above into concrete actions
           Assert.assertEquals(string, this.respond);
       });
   }}