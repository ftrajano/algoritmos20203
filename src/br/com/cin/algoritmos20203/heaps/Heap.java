package br.com.cin.algoritmos20203.heaps;

import java.util.Arrays;

public class Heap {
	
	private int[] heap;
	private int size;
	
	public Heap() {
		this.heap= new int[100];
		this.size=0;
	}
	
	public int heapSize() {
		return this.heap.length;
	}
	
	public void doubleSize() {
		int[] newList = new int[this.heapSize()*2];
		for(int i = 0; i < this.heapSize(); i++) {
			newList[i]=this.heap[i];
			this.heap=newList;
		}
	}
	
	
	public int[] heapInsert(int item) {
		if(this.size==this.heapSize()) {
			this.doubleSize();
		} 
		this.heap[size]=item;
		this.size++;
		return this.bubbleUp();
		
		

	}

	public int[] bubbleUp() {
		
		int i = this.size-1;
		while(i>0 && this.heap[i]>=this.heap[(i-1)/2]) {
			int aux = this.heap[i];
			this.heap[i]=this.heap[(i-1)/2];
			this.heap[(i-1)/2]=aux;
			i=(i-1)/2;
		}
		return this.heap;
	}
	
	public int[] getHeap() {
		return heap;
	}

	@Override
	public String toString() {
		int[] newHeap = Arrays.copyOfRange(this.heap,0, this.size);
		String newHeapString = Arrays.toString(newHeap);
		return newHeapString;
	}

	public int getSize() {
		return size;
	}
	
	
}
