package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\91630\\newWorkSpace\\AmazonApp\\src\\test\\java\\Features\\AmezonFeatureFiles.feature",
        glue = "steps"
)

public class TestRunner {

}
