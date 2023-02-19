package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.GooglePage;
import utilities.ConfigReader;
import utilities.Driver;

public class GoogleStepDefinitions {
    GooglePage googlePage = new GooglePage();
    @Given("kullanıcı google'a gider")
    public void kullanıcı_google_a_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("google_url"));

        try {
            googlePage.popUpAccept.click();
        }catch (Exception e){

        }

    }
    @When("kullanıcı iphone icin arama yapar")
    public void kullanıcı_iphone_icin_arama_yapar() {
    googlePage.searchBox.sendKeys("Iphone"+ Keys.ENTER);

    }
    @Then("sonuclarda iphone oldugunu dogrular")
    public void sonuclarda_iphone_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("iphone"));
    }

    @Then("close the application")
    public void close_the_application() {
       Driver.closeDriver();
    }
    @When("kullanıcı tesla için arama yapar")
    public void kullanıcı_tesla_için_arama_yapar() {
       googlePage.searchBox.sendKeys("tesla",Keys.ENTER);
    }
    @Then("sonuclarda tesla oldugunu dogrular")
    public void sonuclarda_tesla_oldugunu_dogrular() {
        Assert.assertTrue(Driver.getDriver().getPageSource().contains("tesla"));
    }







}
