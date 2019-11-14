package stepdefinitions;

import static stepdefinitions.LocatorMethods.*;

import org.junit.Assert;


public class Helpers {

  public static void userClicksHelper(String arg0) {
    elementLocator(arg0).click();
  }

  public static void userShouldProceedScreenHelper(String arg0) {
    boolean isDisplayed = elementLocator(arg0).isDisplayed();
    Assert.assertEquals(isDisplayed, true);
  }

  public static void userEntersToAreaHelper(String value, String area) {
    elementLocator(area).sendKeys(value);
  }
}