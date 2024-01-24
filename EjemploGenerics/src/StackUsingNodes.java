public class StackUsingNodes<T> implements IStack<T>{

    private int size;
    private Node<T> head;

    public StackUsingNodes(){
        size = 0;
        head = null;
    }

    @Override
    public int count() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public void push(T value) {
        Node<T> newNode = new Node<T>(value);
        
        if (isEmpty()){
            head = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    @Override
    public T pop() {
        Node<T> temp = null;
        if (!isEmpty()){
            temp = head;
            head = temp.next;
            size--;
            return temp.value;
        } else {
            return null;
        }
    }

    @Override
    public T peek() {
        if (!isEmpty()){
            return head.value;
        }
        return null;
    }
    
}
