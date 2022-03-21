package chapters.three.generics;

public class GenericMethod {

    public <T, U> Cell<T, U> apply(T t, U u) {
        return new Cell<T, U>(t, u);
    }

}
