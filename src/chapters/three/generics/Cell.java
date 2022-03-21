package chapters.three.generics;

public class Cell<T, U> {

    private T data;
    private U size;

    public Cell(final T data, final U size) {
        this.data = data;
        this.size = size;
    }

    public T getData() {
        return data;
    }

    public void setData(final T data) {
        this.data = data;
    }

    public U getSize() {
        return size;
    }

    public void setSize(final U size) {
        this.size = size;
    }
}
