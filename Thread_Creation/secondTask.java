package Thread_Creation;

public class secondTask extends java.lang.Thread {
    protected int num2;

    public secondTask(int num2) {
        this.num2 = num2;
    }

    public void run() {
        for (int i = 1; i <= num2; i++) {
            System.out.printf("%d#\n", i);
        }
    }

}
