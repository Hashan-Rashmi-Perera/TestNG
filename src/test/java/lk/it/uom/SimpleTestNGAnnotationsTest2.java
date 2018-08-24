package lk.it.uom;

import org.testng.annotations.*;
import org.testng.annotations.DataProvider;

public class SimpleTestNGAnnotationsTest2 {

    @BeforeClass
    public void beforeClass() throws InterruptedException{
        System.out.println("Before class:");
        Thread.sleep(4000);
    }

    @BeforeMethod
    public void beforeMethod() throws InterruptedException{
        System.out.println("Before method:");
        Thread.sleep(4000);
    }
//here test1 and test2 method are with @test anotation and accodingt to thier aplachabitical order of name it wil execute 1st as well as before methods and after methods will run each test case.
    @Test(priority = 1)
    public void test1() throws InterruptedException{
        System.out.println("Test 1:");
        Thread.sleep(4000);
    }
    //here if you give a prority you will get the this method 1st.
    @Test (priority = 2)
    public void test2() throws InterruptedException{
        System.out.println("Test 2:");
        Thread.sleep(4000);
    }

    @AfterMethod
    public void afterMethod() throws InterruptedException{
        System.out.println("After method:");
        Thread.sleep(4000);
    }

    @AfterClass
    public void afterClass() throws InterruptedException{
        System.out.println("After class:");
        Thread.sleep(4000);
    }
}
