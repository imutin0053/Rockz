package Thread_Creation;

public class firstTask extends java.lang.Thread {
    protected int num1;

    public firstTask(int num1) {
        this.num1 = num1;
    }

    public void run() {
        for (int i = 1; i <= num1; i++) {
            System.out.printf("%d*\n", i);
        }
    }
}
