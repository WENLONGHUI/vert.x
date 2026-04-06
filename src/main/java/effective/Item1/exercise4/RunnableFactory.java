package effective.Item1.exercise4;

public class RunnableFactory {
    private RunnableFactory() {}
    public static Runnable createHelloRunnable() {
        return new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        };
    }
}