package chapters.two.pattern;

public class EagerSingleton {

    private int quantity = 0;

    private EagerSingleton() {
    }

    private static final EagerSingleton instance = new EagerSingleton();

    public static EagerSingleton getInstance() {
        return instance;
    }

    public synchronized void addSingleton(int amount) {
        quantity += amount;
    }

    public synchronized boolean removeSingleton(int amount) {
        if (quantity < amount) {
            return false;
        }
        quantity -= amount;
        return true;
    }

    public synchronized int getSingletonQuantity() {
        return quantity;
    }
}
