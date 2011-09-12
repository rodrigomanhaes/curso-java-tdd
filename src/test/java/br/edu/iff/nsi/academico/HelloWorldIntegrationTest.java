package br.edu.iff.nsi.academico;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class HelloWorldIntegrationTest {

	private static RemoteWebDriver driver;

	@BeforeClass
	public static void openDriver() {
		driver = new FirefoxDriver();
	}

	@Test
    public void testHelloWorld() throws Exception {
    	driver.get("http://localhost:8080/academico/index.jsf");
    	driver.findElementByXPath("id(//label[contains(text(), 'Name')]/@for)").sendKeys("Javanes");
    	driver.findElementByCssSelector("input[value='Login']").click();
    	assertThat(driver.getPageSource(), containsString("Bem vindo, Javanes!"));
    }

	@AfterClass
	public static void closeDriver() {
		driver.quit();
	}
}
