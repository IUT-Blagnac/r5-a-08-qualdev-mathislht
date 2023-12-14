package hellocucumber;

import io.cucumber.java.en.*;

import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {

    @Given("an example scenario")
    public void anExampleScenario() {
    }

    @When("all step definitions are implemented")
    public void allStepDefinitionsAreImplemented() {
    }

    @Then("the scenario passes")
    public void theScenarioPasses() {
    }

}
class IsItFriday {
    static String isItFriday(String today) {
        @Given("Given today is Sunday")
    public void today_is_sunday() {
        today = Sunday
        throw new io.cucumber.java.PendingException();
    }

    @When("When I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        if(today.equals("Friday"){
            result = "Yes";
        } else {
            result = "Nope";
        })
        throw new io.cucumber.java.PendingException();
    }

    @Then("Then I should be told 'Nope'")
    public void i_should_be_told(String string) {
        assertEquals(string, result);
        throw new io.cucumber.java.PendingException();
    }
    }
}