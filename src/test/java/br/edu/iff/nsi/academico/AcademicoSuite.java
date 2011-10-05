package br.edu.iff.nsi.academico;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HelloWorldIntegrationTest.class
})
public class AcademicoSuite {
	static RemoteWebDriver driver;
	
	@BeforeClass
	public static void browserUp() {
		driver = new FirefoxDriver();
	}
	
	@AfterClass
	public static void browserDown() {
		driver.quit();
	}
}
