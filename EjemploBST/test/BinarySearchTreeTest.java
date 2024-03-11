import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class BinarySearchTreeTest {
    @Test
    public void testCount() {

        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());
        assertEquals(0, arbolBST.count());

        arbolBST.insert(20, "Hola");
        assertEquals(1, arbolBST.count());

        arbolBST.insert(30, "Derecha");
        arbolBST.insert(10, "izqueirda");
        assertEquals(3, arbolBST.count());

    }

    @Test
    public void testFind() {

    }

    @Test
    public void testInsert() {
        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());
        assertEquals(0, arbolBST.count());

        arbolBST.insert(30, "Treinta");
        arbolBST.insert(20, "Veinte");
        arbolBST.insert(10, "Diez");
        arbolBST.insert(5, "Cinco");
        arbolBST.insert(90, "Noventa");
        arbolBST.insert(99, "Noventa y Nueve");
        arbolBST.insert(25, "Vienticinco");

        assertFalse(arbolBST.isEmpty());
        

    }

    @Test
    public void testIsEmpty() {
        BinarySearchTree<Integer, String> arbolBST = new BinarySearchTree<Integer, String>(new NumberComparator<Integer>());
        assertTrue(arbolBST.isEmpty());

        arbolBST.insert(20, "Hola");
        assertFalse(arbolBST.isEmpty());
        
    }
}
