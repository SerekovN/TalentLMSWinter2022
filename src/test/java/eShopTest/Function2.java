package eShopTest;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Function2 implements BaseTest{
    @BeforeMethod
    public void openCatalog(){
        System.out.println("переход в каталог");
    }
    @Test(description = "этот тест проверяет на наличие",priority = 0)
    public void test21(){
        System.out.println("проверка цены продукта");
    }
    @Test(priority = 1)
    public void test22(){
        System.out.println("проверка наззвания продукта");
    }
}
