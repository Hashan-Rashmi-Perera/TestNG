package lk.it.uom;

import org.testng.annotations.Test;

public class TestNGDependencyTest {

    @Test
    public void login() throws InterruptedException{
        System.out.println("Login User");
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = {"edit"})
    public void logout() throws InterruptedException{
        System.out.println("Login User");
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = {"login"})
    public void create() throws InterruptedException{
        System.out.println("Create new Account");
        Thread.sleep(3000);
    }

    @Test(dependsOnMethods = {"create"})
    public void edit() throws InterruptedException{
        System.out.println("Edit Account");
        Thread.sleep(3000);
    }
}
