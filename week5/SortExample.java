import java.util.*;
public class SortExample {

	public static void main(String[] args) {
		
		ArrayList<String> words=new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("Bartýn");
		words.add("kitap");
		
		System.out.println("Sýralanmadan önce: "+words);
		System.out.println(words.get(0));	//0 indexindeki elemaný getir.
		Collections.sort(words);			//alfabeye göre sýralar.
		System.out.println("Sýralandýktan sonra: "+words);

		

	}

}
