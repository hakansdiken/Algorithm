import java.util.*;
import java.util.function.*;

public class MathTutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console = new Scanner(System.in);
		giveProblems(console, 3 , " + ", (x,y)-> x+y);//(parameters)->gerçeklestirmek istediðimiz islem

	}
	
	public static void giveProblems(Scanner console, int numProblems,String text,IntBinaryOperator operator) {
		
		Random r = new Random();
		int numRight=0;
		for (int i = 0; i < numProblems; i++) {
			int x=r.nextInt(12)+1;//0-12 arasýnda rasgele sayý
			int y=r.nextInt(12)+1;
			System.out.println(x+ " "+ text + " " + y);
			int answer=operator.applyAsInt(x, y);
			int response  = console.nextInt();
			
			if(response==answer) {
				System.out.println("doðru");
				numRight++;
			}
			else
				System.out.println("yanlýs. Cevap= "+answer);
		}
		System.out.println(numProblems+ " cevaptan doðru sayýsý: " +numRight );
	}
}
