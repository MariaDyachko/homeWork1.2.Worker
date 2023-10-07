public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener onlistener = System.out::println;
        Worker worker = new Worker(listener, onlistener);
        worker.start();
    }
}