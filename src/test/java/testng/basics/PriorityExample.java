package testng.basics;

import org.testng.annotations.Test;

public class PriorityExample {
    @Test(priority = 4)
    public void testX(){
        System.out.println("test X" );
    }

    @Test(priority = 2)
    public void testY(){
        System.out.println("test Y");
    }

    @Test(priority = 3)
    public void testP(){
        System.out.println("test P");
    }

    @Test(priority = 4)
    public void testM(){
        System.out.println("test M");

        
    }
}


