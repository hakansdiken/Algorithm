
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Point point1 = new Point();
		point1.x = 5  ; 
		point1.y = -4 ;
		
		Point point2 = new Point();
		point2.x = -3;
		point2.y = 4 ;
		
		System.out.println(" ("+point1.x +" , " +point1.y+ ")" );
		double dist = Math.sqrt(point1.x * point1.x + point1.y * point1.y);
		System.out.println("distance from origin : " +dist);		
		
		System.out.println(" ("+point2.x +" , " +point2.y+ ")" );
		double dist2 = Math.sqrt(point2.x * point2.x + point2.y * point2.y);
		System.out.println("distance from origin : " +dist2);
		
		point1.x += 10 ; 
		point1.y += 6;
		point2.x += 1 ; 
		point2.y += 7;
		System.out.println("\nnew point1 = ("+point1.x +" , " +point1.y+ ")" );
		System.out.println("new point2 =("+point2.x +" , " +point2.y+ ")" );
		
		
	}

}
