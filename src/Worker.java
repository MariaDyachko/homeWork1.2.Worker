public class Worker implements OnTaskErrorListener, OnTaskDoneListener{

    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {

            if (i == 33) {
                errorCallback.OnError("ERRROR!!! " + i);
            } else {
                callback.onDone("Task " + i + " is done");
            }
        }

    }


    public interface OnTaskDoneListener {
        void onDone(String result);
    }



    public interface OnTaskErrorListener {
        void OnError(String s);
    }

}