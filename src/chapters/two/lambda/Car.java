package chapters.two.lambda;

public class Car {

    public int horsePower;

    public Car(final int horsePower) {
        this.horsePower = horsePower;
    }

    public boolean isFast() {
        return horsePower > 100;
    }
}
