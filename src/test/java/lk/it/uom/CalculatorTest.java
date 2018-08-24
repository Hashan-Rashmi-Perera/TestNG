package lk.it.uom;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest {
    CalculatorLogic calc1 = new CalculatorLogic();

    /*
    * public void testAdd(){
        CalculatorLogic calc = new CalculatorLogic();
        Assert.assertEquals(calc.add(10,15),25, "Failed to add two Integers:");// boundary value analysis what are the boundary values , o,maximum integer
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }*/

    /*getting more than one data to the unit test case*/
    @Test(dataProvider = "getNumber")
    public void testAdd(int num1, int num2, int expnum){
        CalculatorLogic calc = new CalculatorLogic();
        Assert.assertEquals(calc.add(num1,num2),expnum, "Failed to add two Integers:");// boundary value analysis what are the boundary values , o,maximum integer
        try{
            Thread.sleep(4000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    /**/
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
