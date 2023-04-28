package triprunner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/TripFeatures/tripfeatures.feature", glue={"trip"}, monochrome=true, plugin={"pretty","json:target/HtmlReports/reports.json"})
public class TripRunner {

}
