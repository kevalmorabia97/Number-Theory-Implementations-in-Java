public class EuclideanGCD {
	public static int gcd(int a, int b){
		int x = a, y= b;
		while(y!=0){
			int r = x%y;
			x = y;
			y = r;
		}
		return x;
	}
	public static void main(String[] args) {
		System.out.println(gcd(15, 9));
	}

}
