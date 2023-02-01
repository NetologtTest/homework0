class Main {
    public static void main(String[] args) {
        Worker.OnTaskDoneListener listener = System.out::println;
        Worker.OnTaskErrorListener listenerError = System.out::println;

        Worker worker = new Worker(listener, listenerError);
        worker.startError();


    }
}