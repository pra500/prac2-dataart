package parallelexecution;

import org.testng.annotations.Test;

public class ParallelWebDriver1 {


    @Test(priority = 1)
    public void test1() {
        System.out.println("hello 1 - " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void test2() {
        System.out.println("hello 2 - " + Thread.currentThread().getId());
    }

    @Test(priority = 3)
    public void test3() {
        System.out.println("hello 3 - " + Thread.currentThread().getId());
    }

}
