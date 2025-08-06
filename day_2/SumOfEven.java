package day_2;
//Define a method to find the sum of even numbers from the series 1, 2, 3, 4, 5, ...n using continue statement.

public class SumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 10;
		int ans = evenSum(n);
		System.out.println(ans);
	}
		public  static  int evenSum(int n) {
			int sum=0;
		for(int i=1;i<=n ;i++) {
			if(i%2==0) {
				sum+=i;	
			}
			else {
				continue;
			}
		}
			return sum;
		

	}
	}


