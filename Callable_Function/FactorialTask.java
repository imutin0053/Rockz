package Callable_Function;

import java.util.concurrent.Callable;

public class FactorialTask implements Callable<Long> {
    private int num;

    public FactorialTask(int num) {
        this.num = num;
    }

    @Override
    public Long call() {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
