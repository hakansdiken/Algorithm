import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		
		ArrayList<String> lists = new ArrayList<String>();
		
		lists.add("kalem");
		lists.add("masa");
		lists.add("bilgisayar");
		lists.add("defter");
		lists.add("kalem");
		lists.add("masa");
		lists.add(3, "dolap");
		
		System.out.println(lists);
		System.out.println(lists.size());
		
		
		
		//treeSet hashSet
		//index yoktur dizi yerine küme gibi tutulur.
		//tekrarlanan elemenlara izin vermez.
		//List sıralı bir şekilde verirken Set karışık halde verir
		Set<String> sets= new HashSet<String>();
		
		sets.add("kalem");
		sets.add("masa");
		sets.add("bilgisayar");
		sets.add("defter");
		sets.add("kalem");
		sets.add("masa");
		sets.add("dolap");
		
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("dolap"));
		
		sets.clear();
		System.out.println(sets);

		sets.addAll(lists);
		System.out.println(sets);
			
	}

}
