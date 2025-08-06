package day_4;

class BasicCalculator{
	void add(int a, int b){
		
		int sum= a+b;
		System.out.println("The sum is "+sum);
	}
	void sub(int a,int b) {
		int diff= a-b;
		System.out.println("The difference is "+diff);
	}
	void mul(int a,int b) {
		int mul= a*b;
		System.out.println("The Multiplication is "+mul);
	}
	void div(int a,int b) {
		int divi = a/b;
		System.out.println("The division is "+divi);
		System.out.println();
	}
}
class AdvancedCalculator extends BasicCalculator{
	void power(int base,int exponent) {
		double power= Math.pow(base, exponent);
		System.out.println("The power is "+power);
	}
	void mod(int a, int b) {
		int modu= a%b;
		System.out.println("The modulus is "+modu);
	}
	void sqroot(double n) {
		double sqr= Math.sqrt(n);
		System.out.println("The Square is "+sqr);
		System.out.println();
	}
	
}
class ScientificCalculator extends AdvancedCalculator{
	void sine(double angle) {
		double si= Math.sin(angle);
		System.out.println("The sine is "+si);
	}
	void cose(double angle) {
		double co= Math.cos(angle);
		System.out.println("The cosine is "+co);
	}
	void logV(double value) {
		double l= Math.log(value);
		System.out.println("The log is "+l);
	}
	void exponent(double value) {
		double e= Math.exp(value);
		System.out.println("The double is "+e);
		System.out.println();
	}
	
}
 
public class Calculator {

	public static void main(String[] args) {
		 ScientificCalculator sc = new ScientificCalculator();
		System.out.println("-----The Basic Operations------ ");
		sc.add(10, 8);
		sc.sub(15, 5);
		sc.mul(8, 7);
		sc.div(100, 10);
		System.out.println("-----Advanced Functions------");
		
		sc.power(4, 5);
		sc.mod(100,25);
		sc.sqroot(23);
		System.out.println("------Scientific Calculations------ ");
		
		sc.sine(25);
		sc.cose(45);
		sc.logV(56);
		sc.exponent(23);
		

	}

}
