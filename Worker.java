package lessons.javaCore.lambda2;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback = System.out::println;
    private int errTask;

    public Worker(OnTaskDoneListener callback, int errTask) {
        this.callback = callback;
        this.errTask = errTask;
    }

    public void start() {
        for (int i = 0; i <= 100; i++) {
            if (i == errTask) errorCallback.onError("Task " + i + " is NOT done");
            callback.onDone("Task " + i + " is done");
        }
    }
}
