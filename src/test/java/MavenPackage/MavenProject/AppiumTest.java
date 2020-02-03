package MavenPackage.MavenProject;

import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */

//testng xml file from Maven
//how to execute all the test cases from test folder -mvn test

public class AppiumTest
{
    /**
     * Rigorous Test :-)
     */
    @Test (enabled=true)
    public void appiumTest1()
    {
        System.out.println("Print appium1");
    }
    @Test
    public void appiumTest2()
    {
        System.out.println("Print appium2");
        System.out.println("Print appium2");
        System.out.println("Print appium2");
        System.out.println("Print appium2");
        System.out.println("Print appium2");
    }
}
