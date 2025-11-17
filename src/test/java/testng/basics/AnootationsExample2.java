package testng.basics;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnootationsExample2 {
   @BeforeMethod
   public void set(){
       System.out.println("Before method");
   }

    @Test
    public void test1(){
        System.out.println("test case 1");
    }

    @Test
    public void test2(){
        System.out.println("test case 2");
    }

    @AfterMethod
    public void down(){
        System.out.println("After method");
    }
}
