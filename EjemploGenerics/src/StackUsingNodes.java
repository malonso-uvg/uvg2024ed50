public class StackUsingNodes implements IStack{

    private int size;
    private Node head;

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
    public void push(int value) {
        Node newNode = new Node(value);
        
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
    public int pop() {
        Node temp = null;
        if (!isEmpty()){
            temp = head;
            head = temp.next;
            size--;
            return temp.value;
        } else {
            return 0;
        }
        
    }

    @Override
    public int peek() {
        if (!isEmpty()){
            return head.value;
        }
        return 0;
    }
    
}
