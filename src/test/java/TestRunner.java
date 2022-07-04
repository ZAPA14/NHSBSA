import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/CheckerTool.feature",
        glue = {"steps", "appHooks"},
        plugin = {"pretty"}
)

public class TestRunner {
}
