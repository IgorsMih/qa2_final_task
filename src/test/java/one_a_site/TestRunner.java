package one_a_site;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = "pretty",
        features = {"C:\\Java\\qa2_final_task\\src\\test\\resources\\features"},
        glue = {"one_a_site\\steps"},
        tags = "@OneALv"
)
public class TestRunner { }
