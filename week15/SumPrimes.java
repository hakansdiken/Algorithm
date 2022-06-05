import java.util.*;
import java.util.stream.IntStream;
public class SumPrimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner console =  new Scanner(System.in);
		
		System.out.println("Kac tane asal sayýyý toplamak istiyorsunuz ? ");
		int count=console.nextInt();
		int sum = sumPrimes(count);
		System.out.println("sum= "+sum);
	}
	
	public static int sumPrimes(int count) {
		if(count <= 0)
			return 0;
		
		else {
			long start=System.currentTimeMillis();
			int sum=IntStream.iterate(1, n -> n+1 )//sonsuz sýnýr döngüsü olusturduk.//sadece çiftleri alarak maliyeti azaltabiliriz.
					.filter(SumPrimes::isPrime)//sadece prime filtresinden geçenleri aldý.
					.limit(count)//count sayýsý kadar sayý üretilir.sonsuz sayý sorununu ortadan kaldýrýr.
					.sum();
			double elapsed=(System.currentTimeMillis()-start) / 1000.0;
			System.out.println("\ngeçen zaman= " +elapsed + " saniye");
			return sum;
		}
			
		
	}
	public static boolean isPrime(int n) {		
			
		return IntStream.range(1, n+1)
				.filter(x-> n%x ==0)
				.count()==2;
			
		}
		
	}
