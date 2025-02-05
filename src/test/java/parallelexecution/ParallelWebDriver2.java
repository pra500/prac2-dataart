package parallelexecution;

import org.testng.annotations.Test;

public class ParallelWebDriver2 {

    @Test(priority = 1)
    public void set1() {
        System.out.println("helloset1- " + Thread.currentThread().getId());
    }

    @Test(priority = 2)
    public void set2() {
        System.out.println("helloset2 - " + Thread.currentThread().getId());
    }


}
