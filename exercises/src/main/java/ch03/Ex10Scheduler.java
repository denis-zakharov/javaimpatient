package ch03;

import java.util.ArrayList;
import java.util.List;

public class Ex10Scheduler {
    public static void runTogether(Runnable... tasks) throws InterruptedException {
        List<Thread> threads = new ArrayList<>();
        for (Runnable r : tasks) {
            Thread t = new Thread(r);
            threads.add(t);
            t.start();
        }
        for (Thread t : threads) {
            t.join();
        }
        System.out.println("Completed in parallel.");
    }

    public static void runInOrder(Runnable... tasks) {
        for (Runnable r : tasks) {
            r.run();
        }
        System.out.println("Completed in order.");
    }

    public static void main(String[] args) throws InterruptedException {
        Runnable r1 = new Greeter(100, "firstTarget");
        Runnable r2 = new Greeter(20, "secondTarget");
        runInOrder(r1, r2);
        runTogether(r1, r2);

    }
}
