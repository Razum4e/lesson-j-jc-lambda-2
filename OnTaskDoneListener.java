package lessons.javaCore.lambda2;

@FunctionalInterface
public interface OnTaskDoneListener {
    void onDone(String result);
}
