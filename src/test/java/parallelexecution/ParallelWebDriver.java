package parallelexecution;

import org.testng.annotations.Test;

public class ParallelWebDriver {



    
    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1 - " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("Test 2 - " + Thread.currentThread().getId());
    }



}
