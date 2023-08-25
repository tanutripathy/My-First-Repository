
 import io.cucumber.junit.Cucumber;
        import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber.html"}
               ,features ="C:\\Users\\TANU TRIPATHY\\IdeaProjects\\My-First-Repository\\NewMavenProject\\src\\test\\java\\feature"
               ,glue = {"browserControl","stepDefinition"}  ,tags = "@lucky" )


public class TestRunner {
}
