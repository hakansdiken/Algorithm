
class BubbleSort {
	
	void bubbleSort(int[] array) {
		
		for (int i = 0; i < array.length-1; i++) {//dýs döngü islemi defalarca yapmamýzý
			for (int index= 0; index < array.length-1; index++) { //iç döngü her seferinde bir sonraki elemanla kýyaslama yapýyor. Eðer sonraki eleman simdiki deðerden kücükse swap yapýyor. 
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
		System.out.println("Sýralý dizi " );
		ob.bubbleSort(array);
		ob.printArray(array);


	}

}
