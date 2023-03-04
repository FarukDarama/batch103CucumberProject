package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ExcelUtils;
import utilities.ReusableMethods;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class ExcelStepDefinitions {
//Page oblerini olustur
    HomePage homePage;
    LoginPage loginPage;
    ExcelUtils excelUtils;
    List<Map<String,String>> excelData;
    @Given("kullanici {string} bilgileri ile giris yapar")
    public void kullanici_bilgileri_ile_giris_yapar(String sayfaAdi) throws IOException {
     String path ="./src/test/resources/testdata/mysmoketestdata.xlsx";
     // String sheetName="customer_info";
     excelUtils= new ExcelUtils(path,sayfaAdi);
     excelData=excelUtils.getDataList();
     //Loop kodunu tamamla
       for (Map<String,String> data : excelData){
           //Ana sayfaya git
           Driver.getDriver().get(ConfigReader.getProperty("app_url"));
           homePage = new HomePage();
           loginPage= new LoginPage();
           homePage.firstLogin.click();
           ReusableMethods.waitFor(3);
           loginPage.email.sendKeys(data.get("username"));
           ReusableMethods.waitFor(3);
           loginPage.password.sendKeys(data.get("password"));
           ReusableMethods.waitFor(3);
           loginPage.login.click();
           //Giris yapıldıgını verify edelim
           //ID gorunur ıse giris basarilidir
           Assert.assertTrue(homePage.userID.isDisplayed());
           ReusableMethods.getScreenshot("Login_Goruntusu");
           homePage.userID.click();
           ReusableMethods.waitFor(1);
           homePage.logOutLink.click();
           ReusableMethods.waitFor(1);
           homePage.OK.click();
           ReusableMethods.waitFor(1);
       }
        Driver.closeDriver();

    }














}
