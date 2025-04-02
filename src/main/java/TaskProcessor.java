public class TaskProcessor {

    public static void longRunningTask() {
        try {
            Thread.sleep(3000); // Simulates a long task
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
