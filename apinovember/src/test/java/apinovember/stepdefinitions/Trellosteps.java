package apinovember.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Trellosteps {

    @Given("The board exists and contains the correct information")
    public void getBoardAndCheckInfo(){
        System.out.print("We execute the 1s step");
    }

    @When("I change the board title to {string}")
    public void iChangeBoardTitle(String title){
        System.out.print("The name is changed to " + title);
    }

    @And("I check the board name was updated to {string}")
    public void iCheckTatTheTitleIsCorrect(String title){
        System.out.print("The name is updated to " + title);
    }

    @And("I add a list with title {string} to the board")
    public void iCreateaListWithtitle(String title){
        System.out.print("I create a list with name " + title);
    }

    @Then("I delete the newly created list")
    public void iDeleteTheList(){
        System.out.print("The list is deleted!");
    }

}
