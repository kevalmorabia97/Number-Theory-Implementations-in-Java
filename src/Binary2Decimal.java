public class Binary2Decimal {
	public static int Bin2Dec(int[] a){
		int dec = 0;
		for(int i = 0; i<a.length; i++)
			dec+=a[i]*Math.pow(2, i);
		return dec;
	}
	
	public static void main(String[] args) {
		int[] a = {0,1,1,1};//14
		int dec = Bin2Dec(a);
		System.out.println(dec);
	}

}
