###Cucumber Selenium Web Automation Project Sample by Beytullah Uzun
beytullahuzun@gmail.com

This automation projec provides a unique apprach to web element location strategies.
The project consist of three file types

####A. Properties files
1. The elementIds.properties file under resources folder is used to define id,name, linktext or xpath of a we element.
2. The locatorTypes.properties file under resources folder is dedicated to defined the type of web element location strategy.

####B. Feature Files
A sample feature file can be found under resources file including simple Cucumber/Gherkin scenarios. 

####C. Test Runner Class and Step Definition Files (i.e. glue codes)
There a five java classes under stepdefinitions package
1. RunTest : Use this file to define paths to feature files, report type and plugins etc.
2. InitializeTest : This class initiates web driver, loads properties files and defines Before and After steps.
3. StepDefinitions: The class consist of methods corresponding each step in feature files. Each method calls a helper method.
4. Helpers : This file consist of Helper methods to be called by step definitions.
5. LocatorMethods: This class selects the location strategy based on the locator type defined in locatorType.properties file.

