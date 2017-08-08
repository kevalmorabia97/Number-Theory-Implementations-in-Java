public class ExtendBits {
	public static int[] extendBits(int[] a, int radix){
		int[] b = new int[radix];//initialized to 0
		for(int i = 0; i<a.length; i++)
			b[i] = a[i];
		return b;
	}
	
	public static void main(String[] args){
		
	}
}
