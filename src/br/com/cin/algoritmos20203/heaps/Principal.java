package br.com.cin.algoritmos20203.heaps;

public class Principal {
	
	public static void main(String[] args) {
		
		Heap h = new Heap();
		
		h.heapInsert(1);
		h.heapInsert(10);
		h.heapInsert(20);
		h.heapInsert(5);
		h.heapInsert(30);
		h.heapInsert(15);
		h.heapInsert(8);
		h.heapInsert(42);
		h.heapInsert(41);
		
		
		System.out.println(h.getSize());
		System.out.println(h);
		
	}

}
