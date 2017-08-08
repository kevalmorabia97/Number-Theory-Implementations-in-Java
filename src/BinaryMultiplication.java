public class BinaryMultiplication {
	public static int BinMul(int[] a, int[] b){
		int len1 = a.length, len2 = b.length;
		int maxRadix = Math.max(len1, len2);
		a = ExtendBits.extendBits(a, maxRadix);
		b = ExtendBits.extendBits(b, maxRadix);
		int[] c = new int[maxRadix];//c[i] is partial product
		int mul = 0;
		for(int i = 0; i<Math.max(len1, len2); i++){
			if(b[i]==1)	c[i] = Binary2Decimal.Bin2Dec(a)<<i;
			else		c[i] = 0;
			mul+=c[i];
		}
		return mul;
	}
	
	public static void main(String[] args) {
		int[] a = {1,0,1,1,1};//14
		int[] b = {0,1,1};//6
		int product = BinMul(a,b);
		System.out.println(Binary2Decimal.Bin2Dec(a)+" x "+Binary2Decimal.Bin2Dec(b)+" = "+product);
		//sum = {1,1,0,0,0,0,1} = 67
	}
}
