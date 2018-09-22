package ch03;

public class Ex14RunnableLambda {
    public static void main(String[] args) {
        Runnable r1 = new Greeter(3, "firstTarget");
        Runnable r2 = new Greeter(7, "secondTarget");
        Runnable r = runnablesInOrder(new Runnable[]{r1, r2});
        r.run();
    }

    private static Runnable runnablesInOrder(Runnable[] runnables) {
        return () -> {
            for (Runnable r : runnables) r.run();
        };
    }
}
