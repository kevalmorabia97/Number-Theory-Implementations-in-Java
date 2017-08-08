import java.util.HashSet;

public class SieveOfEratosthenes {

	static HashSet<Integer> getPrimesTill(int max) {
		HashSet<Integer> primes = new HashSet<Integer>();
		
		boolean[] isPrime = new boolean[max+1];
		for(int i = 2; i<=max; i++)	isPrime[i] = true;
		isPrime[0] = false;
		isPrime[1] = false;
		for (int i = 2; i * i <= max; i++)
			if (isPrime[i])
				for (int j = i * i; j <= max; j += i)	isPrime[j] = false;

		for (int i = 2; i <= max; i++) 
			if (isPrime[i])	primes.add(i);
		return primes;
	}

	public static void main(String[] args) {
		HashSet<Integer> primes = getPrimesTill(50);
		for(int i : primes)	System.out.println(i);
		//Iterator of HashSet does not give values in the same order
	}

}
