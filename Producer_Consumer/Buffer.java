package Producer_Consumer;

public class Buffer {
    private int item;
    private boolean available = false;

    public synchronized void produce(int value) {
        while (available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Producer Interrupted");
            }
        }
        item = value;
        available = true;
        System.out.println("Produced: " + item);
        notify();
    }

    public synchronized int consume() {
        while (!available) {
            try {
                wait();
            } catch (InterruptedException e) {
                System.out.println("Consumer Interrupted");
            }
        }
        available = false;
        System.out.println("Consumed: " + item);
        notify();
        return item;
    }
}
