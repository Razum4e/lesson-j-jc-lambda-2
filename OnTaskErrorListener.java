package lessons.javaCore.lambda2;

@FunctionalInterface
public interface OnTaskErrorListener {
    void onError(String result);
}
