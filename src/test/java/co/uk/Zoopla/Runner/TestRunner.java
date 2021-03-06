package co.uk.Zoopla.Runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
                 features={"src/test/java/co/uk/Zoopla/Features"}
                 ,plugin={"pretty","json:target/report.json","de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"
                  },glue={"co/uk/Zoopla/stepDefinitions"})

public class TestRunner {
}
