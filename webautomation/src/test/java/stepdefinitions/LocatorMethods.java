package stepdefinitions;

import static stepdefinitions.InitializeTest.driver;
import static stepdefinitions.InitializeTest.elementIds;
import static stepdefinitions.InitializeTest.locatorTypes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LocatorMethods {

  public static WebElement elementLocator(String arg0) {
    String id = elementIds.getProperty(arg0);
    String type = locatorTypes.getProperty(arg0);

    WebElement element = null;

    switch (type) {
      case "id":
        element = driver.findElement(By.id(id));
        break;
      case "name":
        element = driver.findElement(By.name(id));
        break;
      case "linktext":
        element = driver.findElement(By.linkText(id));
        break;
      case "xpath":
        element = driver.findElement(By.xpath(id));
        break;
      default:
        throw new IllegalStateException("Unexpected value: " + type);
    }
    return element;
  }

}
