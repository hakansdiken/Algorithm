import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words=new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("Bart�n");
		words.add("kitap");
		
		System.out.println("S�ralanmadan �nce: "+words);
		System.out.println(words.get(0));	//0 indexindeki eleman� getir.
		Collections.sort(words);			//alfabeye g�re s�ralar.
		System.out.println("S�raland�ktan sonra: "+words);

		

	}

}
