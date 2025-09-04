package day_12;

public class TaskRunner implements Runnable {
    private String taskName;

    TaskRunner(String name) {
        this.taskName = name;
    }

   
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Thread: " + Thread.currentThread().getName() + " - Task: " + taskName + " - Count: " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        
        TaskRunner task1 = new TaskRunner("Data Processing");
        TaskRunner task2 = new TaskRunner("File Uploading");

        Thread t1 = new Thread(task1, "Worker-1");
        Thread t2 = new Thread(task2, "Worker-2");

        
        t1.start();
        t2.start();
    }
}
