import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StackUsingArrayTest {

    @Test
    public void testCount() {
        IStack<Integer> miStack = new ArrayStack<Integer>();
        assertEquals(0, miStack.count());
        miStack.push(30);
        assertEquals(1, miStack.count());
        miStack.pop();
        assertEquals(0, miStack.count());
    }

    @Test
    public void testIsEmpty() {
        IStack<Integer> miStack = new ArrayStack<Integer>();
        assertEquals(true, miStack.isEmpty());
        miStack.push(30);
        assertEquals(false, miStack.isEmpty());
        miStack.pop();
        assertEquals(true, miStack.isEmpty());
    }

    @Test
    public void testPeek() {
        IStack<Integer> miStack = new ArrayStack<Integer>();
        miStack.push(30);
        assertEquals(30, (int)miStack.peek());
        assertEquals(30, (int)miStack.peek());
    }

    @Test
    public void testPop() {
        IStack<Integer> miStack = new ArrayStack<Integer>();
        miStack.push(30);
        assertEquals(30, (int)miStack.pop());
        miStack.push(35);
        miStack.push(50);
        assertEquals(50, (int)miStack.pop());
        assertEquals(35, (int)miStack.pop());
    }

    @Test
    public void testPush() {
        IStack<String> miStack = new ArrayStack<String>();
        miStack.push("hola");
        assertEquals("hola", miStack.pop());
        miStack.push("estudiantes");
        miStack.push("UVG EDS50");
        assertEquals("UVG EDS50", miStack.pop());
        assertEquals("estudiantes", miStack.pop());
    }
}
