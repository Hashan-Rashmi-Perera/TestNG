package lk.it.uom;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGPriorityTest {

    @BeforeMethod
    public void beforMethod() throws InterruptedException{
        System.out.println("Before method:");
        Thread.sleep(4000);
    }

    @Test
    public void test1() throws InterruptedException{
        System.out.println("Test 1:");
        Thread.sleep(4000);
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException{
        System.out.println("After method:");
        Thread.sleep(4000);
    }
}
