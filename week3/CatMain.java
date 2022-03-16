
public class CatMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat kedi1 = new Cat();
		System.out.println(kedi1.age+" , "+kedi1.color+" , " +kedi1.name);
		
		Cat kedi2 = new Cat("Tarcin" , 2);
		System.out.println(kedi2.age+" , "+kedi2.color+" , " +kedi2.name);
		
		Cat kedi3 = new Cat("Pamuk" , "beyaz" , 1);
		System.out.println(kedi3.age+" , "+kedi3.color+" , " +kedi3.name);

		Cat kedi4 = new Cat("sdasd" , "gri" , 3);
		System.out.println(kedi4.age+" , "+kedi4.color+" , " +kedi4.name);

	}

}
