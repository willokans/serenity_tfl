package starter;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        plugin = {"pretty"},
        tags = {"@current"},
        glue = "net.serenitybdd.excercises.lean.stepdefinitions",
        features = "src/test/resource/features"
)
public class CurrentScenario {
}
