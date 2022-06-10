
class BubbleSort {
	
	void bubbleSort(int[] array) {
		
		for (int i = 0; i < array.length-1; i++) {//d�s d�ng� islemi defalarca yapmam�z�
			for (int index= 0; index < array.length-1; index++) { //i� d�ng� her seferinde bir sonraki elemanla k�yaslama yap�yor. E�er sonraki eleman simdiki de�erden k�c�kse swap yap�yor. 
				if(array[index]> array[index+1]) {
					int tmp = array[index];
					array[index] = array[index+1];
					array[index+1]=tmp;
				}
			}
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
		int[] array = {10,8,6,4,2,20};
		BubbleSort ob = new BubbleSort();
		System.out.println("S�ral� dizi " );
		ob.bubbleSort(array);
		ob.printArray(array);


	}

}
