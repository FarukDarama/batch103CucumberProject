package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features",//features folder path
        glue = "stepdefinitions"//stepdefinitions path
)
public class Runner {


}
//Bu sınıf test caseleri run etmek için kullanılır
//ve konfigurasyonlar için kullanılır