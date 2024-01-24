public interface IStack<T>{
    
    /**
     * Devuelve la cantidad de elementos que posee el stack
     * @return
     */
    int count();

    boolean isEmpty();

    void push(T value);

    T pop();

    T peek();

}