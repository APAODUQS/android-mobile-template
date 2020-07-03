package automation.cucumber.steps;

import android.util.Log;

import org.junit.Assert;

import java.security.NoSuchAlgorithmException;

import javax.crypto.NoSuchPaddingException;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ExampleSteps {

    private Logic logic;
    int number1;
    int number2;

    public ExampleSteps(Logic logicP) throws NoSuchPaddingException, NoSuchAlgorithmException {
        logic = logicP;
    }

    @Given("^a first number (\\d+)$")
    public void setNumber1(int num) throws Exception {
        Log.i("Automation", "Given a number first number: " + num);
        number1 = num;
    }

    @And("^a second number (\\d+)$")
    public void setNumber2(int num) throws Exception {
        Log.i("Automation", "Given a number second number: " + num);
        number2 = num;
    }

    @When("^the operation is a (.*)$")
    public void setOperation(String operation) {
        Log.i("Automation", "the operation is a " + operation);
    }

    @Then("^the result is (\\d+)$")
    public void getResult(int expectedResult) {
        Log.i("Automation", "the result is " + expectedResult);
        int currentResult = logic.sumNumbers(number1,number2);
        Assert.assertEquals("Incorrect result : " + currentResult, expectedResult, currentResult);
    }

}
