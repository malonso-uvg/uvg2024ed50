import java.util.Arrays;

public class ArrayStack<T> implements IStack<T> {

    private static final int DEFAULT_CAPACITY = 10;
    private Object[] array;
    private int size;

    public ArrayStack() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    @Override
    public int count() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(T value) {
        ensureCapacity();
        array[size++] = value;
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("El stack está vacío");
        }
        T poppedValue = (T) array[--size];
        array[size] = null; // Liberar la referencia para evitar fugas de memoria
        return poppedValue;
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("El stack está vacío");
        }
        return (T) array[size - 1];
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
    }
}