
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point p1 = new Point(7,2);	
		Point p2 = new Point(4,3);
		
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("distance from origin :" +p1.distanceFromOrigin());
		
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("distance from origin :" +p2.distanceFromOrigin());
		
		p1.translate(11, 6);
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("distance from origin :" +p1.distanceFromOrigin());
		
		System.out.println("p1 =" + p1);
	}

}
