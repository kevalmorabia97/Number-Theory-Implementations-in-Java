import java.util.Arrays;

public class Decimal2Binary {
	public static int[] dec2Bin(int n){
		int noOfBits=(int) Math.floor(Math.log(n)/Math.log(2)) + 1;
		int[] ans = new int[noOfBits];
		int i = 0;
		while(n!=0){
			ans[i++] = n%2;
			n = n/2;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] n = dec2Bin(6);//n[0] = lsb, n[noOfBits-1] = msb
		System.out.println(Arrays.toString(n));
	}

}
