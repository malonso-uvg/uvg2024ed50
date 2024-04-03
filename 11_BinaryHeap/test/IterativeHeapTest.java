import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IterativeHeapTest {

	@Test
	void test() {
		HeapUsingIterativeBinaryTree<Integer, String> myHeap = new HeapUsingIterativeBinaryTree<Integer, String>(new ComparadorNumeros<Integer>());
		myHeap.Insert(20, "veinte");
		myHeap.Insert(10, "diez");
		myHeap.Insert(15, "quince");
		myHeap.Insert(5, "cinco");
		myHeap.Insert(10, "diez");
		myHeap.Insert(15, "quince");
		
		assertEquals("veinte", myHeap.remove());
		assertEquals("quince", myHeap.remove());
		assertEquals("quince", myHeap.remove());
		assertEquals("diez", myHeap.remove());
		assertEquals("diez", myHeap.remove());
		assertEquals("cinco", myHeap.remove());
		
		
	}

	@Test
	void test_Automoviles() {
		ComparadorCadenas<String> ComparaCadena = new ComparadorCadenas<String>();
		HeapUsingIterativeBinaryTree<String, Automovil> myHeap = new HeapUsingIterativeBinaryTree<String, Automovil>(ComparaCadena);

		myHeap.Insert("P655HCC", new Automovil("Toyota", 2000));
		myHeap.Insert("C773BCC", new Automovil("Hino", 1995));
		myHeap.Insert("M345DGG", new Automovil("Yamaha", 2008));

		//assertEquals("Auto marca: Toyota modelo 2000", myHeap.remove().toString());
		//assertEquals("Auto marca: Yamaha modelo 2008", myHeap.remove().toString());
		//assertEquals("Auto marca: Hino modelo 1995", myHeap.remove().toString());
		assertEquals("Auto marca: Hino modelo 1995", myHeap.remove().toString());
		assertEquals("Auto marca: Yamaha modelo 2008", myHeap.remove().toString());
		assertEquals("Auto marca: Toyota modelo 2000", myHeap.remove().toString());
		
		
		
	}

}
