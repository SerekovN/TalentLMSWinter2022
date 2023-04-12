package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGDemo {
    @Test
    public void createNewUserTest(){
        User firstUser = new User("John",30);
        Assert.assertNotNull(firstUser);
    }
    @Test(dependsOnMethods = "createNewUserTest")
    public void loginTest(){
        Assert.assertTrue(true);
    }
//    @DataProvider(name = "inputValues")
//    public Object[][] getInputValues(){
//        {"john@gmail.com", "ValidPass"};
//        {"johngmail.com", "ValidPass"},
//        {"john@gmail.com", "InvalidPass"}
//        };
//    }
//    @Test(dataProvider = "inputValues")
//    public void TestLoginFun(String userName, String password) {
//        System.out.println(userName + "" + password);
//   }
}
