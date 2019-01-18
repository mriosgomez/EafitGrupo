package co.com.eafit;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/cronos.feature", 
				  tags = "@Logueo",
				  glue = "co.com.eafit.definitions",
				  snippets = SnippetType.CAMELCASE )
				  
public class RunnerTags {

}
