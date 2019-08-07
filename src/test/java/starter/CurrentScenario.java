package starter;

import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (
        plugin = {"pretty"},
        tags = {},
        glue = "starter.tfl.stepdefinitions",
        features = "classpath:features"
)
public class CurrentScenario {
}
