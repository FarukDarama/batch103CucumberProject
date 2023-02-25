package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions",//stepdefinitions path
        tags = "@scenario_outline_1",
        dryRun = false
        //hizli bir sekilde hepsini tara. tanimlanmamis adimi ver SD dosyasina ekle tekrar TC'leri calistirmak istedimiz zaman da false yap

)
public class Runner {


}
//Bu sınıf test caseleri run  dryRun