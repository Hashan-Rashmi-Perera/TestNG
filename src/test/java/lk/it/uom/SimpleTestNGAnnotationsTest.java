package lk.it.uom;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SimpleTestNGAnnotationsTest {

    @BeforeMethod
    public void beforeMethod() throws InterruptedException{
        System.out.println("Before method:");
    }

    @BeforeMethod
    public void vMethod() throws InterruptedException{
        System.out.println("A method:");
    }

    @Test
    public void test1() throws InterruptedException{
        System.out.println("Test 1:");
        Thread.sleep(4000);
    }

    @AfterMethod
    public void qMethod() throws InterruptedException{
        System.out.println("After method:2");
        Thread.sleep(4000);
    }
    @AfterMethod
    public void afterMethod() throws InterruptedException{
        System.out.println("After method:1");
        Thread.sleep(4000);
    }
    @DataProvider
    public Object[][] getNumber(){
        return  new Object[][]{
                {12,6,18},
                {100,51,151},
                {-1,-3,-4},
                {2147483647,2147483600,49},
                {2147483647,2147483600,48}
        };
    }
}
