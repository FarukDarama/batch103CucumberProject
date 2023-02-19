package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GooglePage {
    public GooglePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    //Driver.getDriver().findElement(By.xpath("(//*[@class='QS5gu sy4vM'])[2]")).click()
    @FindBy(xpath = "(//*[@class='QS5gu sy4vM'])[2]")
    public WebElement popUpAccept;

    @FindBy(xpath = "//input[@name='q']")
    public WebElement searchBox;
}
