import java.util.ArrayList;

public class SortAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words=new ArrayList<String>();
		words.add("kalem");
		words.add("bilgisayar");
		words.add("Bart�n");
		words.add("kitap");
		
		System.out.println("D�ng� �ncesi : "+words);
		System.out.println("Liste uzunlugu : "+words.size());
		
		for(int index = 0 ; index<words.size() ; index+=2) {
			words.add(index," * ");
		}
		System.out.println("D�ng� sonras� : "+words);
		System.out.println("Liste uzunlugu : "+words.size());
		
		for(int index = 0 ; index<words.size() ; index++) {
			words.remove(index);
		}
		System.out.println("Silme sonras� : "+words);
		System.out.println("Liste uzunlugu : "+words.size());
	}

}
