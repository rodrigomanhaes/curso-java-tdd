package br.edu.iff.nsi.academico;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Properties;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.googlecode.flyway.core.Flyway;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	HelloWorldIntegrationTest.class
})
public class AcademicoSuite {
	static RemoteWebDriver driver;
	static Flyway flyway = new Flyway(); 
	
	@BeforeClass
	public static void browserUp() {
		driver = new FirefoxDriver();
	}
	
	@BeforeClass
	public static void setupFlyway() throws Exception {
		Properties prop = new Properties();
		prop.load(new BufferedReader(new InputStreamReader(
			ClassLoader.getSystemResourceAsStream("test-database.properties"))));
		flyway.configure(prop);
	}
	
	@AfterClass
	public static void browserDown() {
		driver.quit();
	}
}
