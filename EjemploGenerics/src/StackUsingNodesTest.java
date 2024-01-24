import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackUsingNodesTest {

    @Test
    public void testCount() {
        StackUsingNodes miStack = new StackUsingNodes();
        assertEquals(0, miStack.count());
        miStack.push(30);
        assertEquals(1, miStack.count());
        miStack.pop();
        assertEquals(0, miStack.count());
    }

    @Test
    public void testIsEmpty() {
        StackUsingNodes miStack = new StackUsingNodes();
        assertEquals(true, miStack.isEmpty());
        miStack.push(30);
        assertEquals(false, miStack.isEmpty());
        miStack.pop();
        assertEquals(true, miStack.isEmpty());
    }

    @Test
    public void testPeek() {
        StackUsingNodes miStack = new StackUsingNodes();
        miStack.push(30);
        assertEquals(30, miStack.peek());
        assertEquals(30, miStack.peek());
    }

    @Test
    public void testPop() {
        StackUsingNodes miStack = new StackUsingNodes();
        miStack.push(30);
        assertEquals(30, miStack.pop());
        miStack.push(35);
        miStack.push(50);
        assertEquals(50, miStack.pop());
        assertEquals(35, miStack.pop());
    }

    @Test
    public void testPush() {
        StackUsingNodes miStack = new StackUsingNodes();
        miStack.push(30);
        assertEquals(30, miStack.pop());
        miStack.push(35);
        miStack.push(50);
        assertEquals(50, miStack.pop());
        assertEquals(35, miStack.pop());
    }
}
