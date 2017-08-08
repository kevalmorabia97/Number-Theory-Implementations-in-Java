public class ModularExponentiation {
	public static int abModm(int a, int b, int m){
		return ((a%m)*(b%m))%m;
	}
	
	public static int bPowNModM(int b, int n, int m){
		int x = 1;
		int power = b%m;
		while(n!=0){
			if(n%2==1)
				x = abModm(x, power, m);
			power = abModm(power, power, m);
			n/=2;
		}
		return x;
	}
	
	public static void main(String[] args) {
		System.out.println(bPowNModM(345, 151, 11));
	}

}
