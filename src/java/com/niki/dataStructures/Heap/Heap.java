package src.java.com.niki.dataStructures.Heap;

import java.util.ArrayList;
import java.util.List;

public class Heap<T extends Comparable<T>>{
	private List<T> heap = new ArrayList<>();

	public List<T> getHeap() {
		return heap;
	}

	public void setHeap(List<T> heap) {
		this.heap = heap;
	}

	public Heap(List<T> heap) {
		super();
		this.heap = heap;
	}

	public void add(T value) {
		heap.add(value);
	}

	public T get(int i) {
		return heap.get(i);
	}

	public void replace(int i, T value) {
		heap.set(i, value);
	}

	public int size() {
		return heap.size();
	}
	//heapify, buildmax and heapsort

	public void heapify(Heap<T> heap, int i, int size) {
		int large = i;
		int l=2*i;
		int r=2*i+1;
		T val = heap.get(i);
		if(l>0 && heap.get(l).compareTo(heap.get(large))>0)	large=l;
		if(r>0 && heap.get(r).compareTo(heap.get(large))>0)	large=r;
		if(large!=i) {
			heap.replace(i, heap.get(large));
			heap.replace(large, val);
			heapify(heap,large,size);
		}
	}

	public void buildMax(Heap<T> heap,int size) {
		for(int i = size/2-1;i>=0;i--) {
			heapify(heap,i,size);
		}
	}

	public Heap<T> heapSort(Heap<T> heap) {
		T val = heap.get(0);
		int i= heap.size()-1;
		while(i>=0) {
			heap.replace(0, heap.get(i));
			heap.replace(i, val);
			heapify(heap,0,--i);
		}
		return heap;
	}

	@Override
	public String toString() {
		return "Heap [heap=" + heap.toString() + "]";
	}


}
