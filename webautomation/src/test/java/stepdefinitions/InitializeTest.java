package stepdefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InitializeTest {

  protected static WebDriver driver = new ChromeDriver();
  protected static Properties elementIds = new Properties();
  protected static Properties locatorTypes = new Properties();


  @Before
  public void before() {
    loadElementIds();
    String baseUrl = elementIds.getProperty("url");
    driver.get(baseUrl);
    driver.manage().window().maximize();
  }

  @After
  public void after() {

    //driver.quit();
  }

  private void loadElementIds() {

    try {
      elementIds.load(getClass().getResourceAsStream("/elementIds.properties"));
      locatorTypes.load(getClass().getResourceAsStream("/locatorTypes.properties"));

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}

