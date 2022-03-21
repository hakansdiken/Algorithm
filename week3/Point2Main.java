
public class Point2Main {
	
	public static void main(String[] args) {
		
		Point2 pnt= new Point2();
		pnt.x = 3 ;
		pnt.y = 4 ;
		
		pnt.translate(2 , -1);
		
		System.out.println("point = ("+ pnt.x+" , "+pnt.y +" )" );
		System.out.println("distance from origin = "+pnt.distanceFromOrigin() );
		
	}						
}
