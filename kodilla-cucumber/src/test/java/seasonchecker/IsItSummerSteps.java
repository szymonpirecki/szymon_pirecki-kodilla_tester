package seasonchecker;

import io.cucumber.java8.En;
import org.junit.Assert;

import java.time.MonthDay;

public class IsItSummerSteps implements En {
    private MonthDay today;
    private String answer;

    public IsItSummerSteps() {
        Given("today is the last day of December", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(12,31);
        });

        When("I ask whether it's Summer", () -> {
            // Write code here that turns the phrase above into concrete actions
            SeasonChecker seasonChecker = new SeasonChecker();
            this.answer = seasonChecker.checkIfSummer(this.today);
        });

        Then("I should be told {string}", (String string) -> {
            // Write code here that turns the phrase above into concrete actions
            Assert.assertEquals(string, this.answer);
        });
        Given("today is first day of August", () -> {
            this.today = MonthDay.of(9, 1);
        });
        Given("today is 3rd day of march", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(3, 3);
        });

        Given("today is my birthday", () -> {
            // Write code here that turns the phrase above into concrete actions
            this.today = MonthDay.of(3, 8);
        });
    }
}