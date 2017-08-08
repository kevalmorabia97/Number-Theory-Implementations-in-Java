class NChooseK{
	
	static long binomial(int n, int k) {
		if (k < 0 || k > n) return 0;
		if (k > n - k) {    // take advantage of symmetry
			k = n - k;
		}
		long c = 1;
		for (int i = 1; i < k+1; ++i) {
			c = c * (n - (k - i));
			c = c / i;
		}
		return c;
	}
	
	public static void main(String[] args){
		System.out.println(binomial(5, 3));
		System.out.println(binomial(17, 2));
	}
}