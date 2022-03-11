package lessons.javaCore.lambda2;

public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener, 33);
        worker.start();
    }
}
