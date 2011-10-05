package br.edu.iff.nsi.academico;

import static br.edu.iff.nsi.academico.AcademicoSuite.driver;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

import org.junit.Test;

public class HelloWorldIntegrationTest extends FunctionalTest {
	@Test
    public void testHelloWorld() throws Exception {
    	driver.get("http://localhost:8080/academico/index.jsf");
    	driver.findElementByXPath("id(//label[contains(text(), 'Name')]/@for)").sendKeys("Javanes");
    	driver.findElementByCssSelector("input[value='Login']").click();
    	assertThat(driver.getPageSource(), containsString("Bem vindo, Javanes!"));
    }
}
