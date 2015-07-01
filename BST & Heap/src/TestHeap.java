public class TestHeap {

	public static void main(String[] args) {
		Integer n[] = {10,90,60,50,20,5,100};
		Heap<Integer> heap = new Heap<Integer>(n);
		
		heap.yazdirHeap();
		System.out.println(heap.getSize());
		heap.remove();
		heap.yazdirHeap();
		System.out.println(heap.getSize());
		heap.remove();
		heap.yazdirHeap();
		heap.remove();
		heap.yazdirHeap();
		
		
		
		Heap<Integer> heap2 = new Heap<Integer>();
		
		heap2.sort(n);
	
		
		
		
		
		
	}

}
