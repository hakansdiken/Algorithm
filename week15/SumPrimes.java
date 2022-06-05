import java.util.*;
import java.util.stream.IntStream;
public class SumPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console =  new Scanner(System.in);
		
		System.out.println("Kac tane asal say�y� toplamak istiyorsunuz ? ");
		int count=console.nextInt();
		int sum = sumPrimes(count);
		System.out.println("sum= "+sum);
	}
	
	public static int sumPrimes(int count) {
		if(count <= 0)
			return 0;
		
		else {
			long start=System.currentTimeMillis();
			int sum=IntStream.iterate(1, n -> n+1 )//sonsuz s�n�r d�ng�s� olusturduk.//sadece �iftleri alarak maliyeti azaltabiliriz.
					.filter(SumPrimes::isPrime)//sadece prime filtresinden ge�enleri ald�.
					.limit(count)//count say�s� kadar say� �retilir.sonsuz say� sorununu ortadan kald�r�r.
					.sum();
			double elapsed=(System.currentTimeMillis()-start) / 1000.0;
			System.out.println("\nge�en zaman= " +elapsed + " saniye");
			return sum;
		}
			
		
	}
	public static boolean isPrime(int n) {		
			
		return IntStream.range(1, n+1)
				.filter(x-> n%x ==0)
				.count()==2;
			
		}
		
	}
