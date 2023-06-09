package Test_Runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/java/Features"},
        glue = {"StepDefinitions"},

        plugin = {"json:target/cucumber.json"}

)

public class TesterRunner {
}
