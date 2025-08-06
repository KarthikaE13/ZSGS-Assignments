package day_2;

public class DecimalBinary {

	public static void main(String[] args) {
		int num = 134;
		String res = decBin(num);
		System.out.println(res);
	}
public static String decBin(int num) {
	if(num==0) return "";
	return decBin(num/2) + (num%2);
	
}
}
