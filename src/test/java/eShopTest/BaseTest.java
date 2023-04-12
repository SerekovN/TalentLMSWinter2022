package eShopTest;

import org.junit.After;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public interface BaseTest {
    @BeforeSuite
    default void setUp() {
        System.out.println("chrome");
    }

    @BeforeTest
    default void openSite() {
        System.out.println("открытие сайта");
    }

    @AfterTest(alwaysRun = true)
    default void close() {
        System.out.println("закрыть сайта");
    }
}