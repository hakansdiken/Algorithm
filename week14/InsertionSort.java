
class InsertionSort {
	void insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int key = array[i];
			int j = i - 1;
			while(j>=0 && array[j]> key) {
				array[j+1]=array[j];
				j--;	
			}
			array[j+1]=key;
		}
	}
		void printArray(int[] array) {
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i]+" ");
			}
			System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {9,7,6,15,5,10,11};
		InsertionSort ob = new InsertionSort();
		System.out.println("Sýralý Dizi ");
		ob.insertionSort(array);
		ob.printArray(array);
		
	}

}
