package day_2;

public class SortWeight {

	public static void main(String[] args) {
		int[] weights= {105,75,45,65,125,90};
		int n= weights.length;
		for(int i=0;i<n-1;i++) {
			int max =i;
			for(int j=i+1;j<n;j++) {
				if(weights[j]>weights[max])
					max=j;
			}
		
		int temp = weights[i];
        weights[i] = weights[max];
        weights[max] = temp;		
	}
		System.out.println("Sorted weights  descending order:");
        for (int w : weights) {
            System.out.print(w + " ");

}
}
}
