
public class Main {

	public static void main(String[] args) {
		Car car1 = new Car();
		
		car1.setColor ("Beyaz");
		car1.setModel("Mercedes");
		car1.setEngine(2.0);
		car1.setDoors(4);
		 
		
		System.out.println("Arabanýn Rengi: "+ car1.getColor());
		System.out.println("Arabanýn Modeli: "+ car1.getModel());
		System.out.println("Arabanýn Motor Hacmi: "+ car1.getEngine());
		System.out.println("Arabanýn Kapý Sayýsý: "+ car1.getDoors());	
		car1.start();
		car1.stop();
	}

}
