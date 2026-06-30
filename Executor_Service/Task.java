package Executor_Service;

public class Task implements Runnable {
    private int taskNumber;

    public Task(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is executing task " + taskNumber);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Error Occured!");
        }
        System.out.println("Task Completed: " + taskNumber);
    }
}
