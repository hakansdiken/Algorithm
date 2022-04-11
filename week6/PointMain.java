import java.util.*;
public class PointMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Point> points = new HashSet<Point>();
		
		points.add(new Point(3,4));
		points.add(new Point(5,12));
		
		System.out.println(points);

		for(Point p : points)
			System.out.println("("+p.getX()+","+p.getY()+")");
	}

}
