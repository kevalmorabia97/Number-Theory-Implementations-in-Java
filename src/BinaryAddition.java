public class BinaryAddition {
	public static int[] BinAdd(int[] a, int[] b){
		int len1 = a.length, len2 = b.length;
		int maxRadix = Math.max(len1, len2);
		a = ExtendBits.extendBits(a, maxRadix);
		b = ExtendBits.extendBits(b, maxRadix);
		int c = 0;
		int[] sum = new int[maxRadix+1];
		int i = 0;
		for( ; i<Math.max(len1, len2); i++){
			int	d = (a[i]+b[i]+c)/2;
			sum[i] = a[i]+b[i]+c - 2*d;
			c = d;
		}
		sum[i] = c;
		return sum;
	}
	
	public static void main(String[] args){
		int[] a = {0,1,0,1,0};//10
		//a[0] = 1 --> lsb, a[4] = 0 --> msb
		int[] b = {1,0,0,1,1,1};//57
		int[] sum = BinAdd(a,b);
		System.out.println(Binary2Decimal.Bin2Dec(a)+" + "+Binary2Decimal.Bin2Dec(b)+" = "+Binary2Decimal.Bin2Dec(sum));
		//sum = {1,1,0,0,0,0,1} = 67
	}
}
