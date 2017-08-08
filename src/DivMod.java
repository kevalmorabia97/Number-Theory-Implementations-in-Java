public class DivMod {
	public static int[] division(int a, int d){//returns quotient and remainder of a/d
		int[] divMod = new int[2];//divMod[0] = a(div)d , divMod[1] = a(mod)d
		int q = 0;
		int r = Math.abs(a);
		while(r>=d){
			r-=d;
			q++;
		}
		if(a<0 && r>0){
			q=-(q+1);
			r=d-r;
		}
		divMod[0]=q;
		divMod[1]=r;
		return divMod;
	}
	public static void main(String[] args) {
		int a = -12, d = 5;
		int[] result = division(a,d);
		int quotient = result[0];
		int remainder = result[1];
		System.out.println(a+" = "+quotient+"x"+d+" + "+remainder);
	}

}
