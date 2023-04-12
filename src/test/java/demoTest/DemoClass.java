package demoTest;

import org.testng.annotations.*;

public class DemoClass {

    @BeforeMethod
    public void demoBefore(){
        System.out.println("Demo Before");
    }

    @Test(groups = "group1")
    public void demoTest1(){
        System.out.println("Demo test1");
    }

    @Test(groups = "group2")
    public void demoTest2(){
        System.out.println("Demo test2");
    }

    @AfterMethod
    public void demoAfter(){
        System.out.println("Demo After");
    }

    @BeforeClass
    public void demoBeforeClass(){
        System.out.println("Demo Before Class");
    }

    @AfterClass
    public void demoAfterClass(){
        System.out.println("Demo After Class");
    }

    @BeforeTest
    public void demoBeforeTest(){
        System.out.println("Demo Before Test");
    }
    @AfterTest
    public void demoAfterTest(){
        System.out.println("Demo After Test");
    }
    @BeforeSuite
    public void demoBeforeSuite(){
        System.out.println("Demo Before Suite");
    }
    @AfterSuite
    public void demoAfterSuite(){
        System.out.println("Demo After Suite");
    }
    @BeforeGroups(groups = "group1")
    public void demoBeforeGroup(){
        System.out.println("Demo Before Group1");
    }
    @AfterGroups (groups = "group2")
    public void demoAfterGroup(){
        System.out.println("Demo After Group2");
    }
}
