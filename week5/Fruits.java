import java.util.ArrayList;

public class Fruits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("Elma");
		list.add("Muz");
		list.add("Portakal");
		
		System.out.println(list);
		
		for(String fruit:list)
			System.out.println(fruit);	
	}

}
