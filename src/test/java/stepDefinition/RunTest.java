package stepDefinition;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "stepDefinition",
        tags = "@Sorting",
        plugin = {"pretty", "html:target/SortingReport.html"}
)
public class RunTest {

}
