import java.util.ArrayList;

public class personMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<person> persons = new ArrayList<>();
		
		persons.add(new person ("Ahmet", 24));
		persons.add(new person("Kaya", 30));
		persons.add(new person("Hayri", 40));
		persons.add(new person("Hakan", 20));
		
		for(person person:persons) {
			System.out.println("isim: "+person.getIsim()+", yas: "+person.getYas());
		}

	}

}
