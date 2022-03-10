import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		ArrayList<ArrayList<Integer> > arr = 
                new ArrayList<ArrayList<Integer> >(n);
		
		for(int i=0;i<n;i++) {
			 int num = sc.nextInt();
			 ArrayList<Integer> a1 = new ArrayList<Integer>();
			
			 for(int k=0;k<num;k++) {
				 a1.add(sc.nextInt());
			 }
			 arr.add(a1);
		}
		
		System.out.println("The output is");
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int x = sc.nextInt()-1;
			int y = sc.nextInt()-1;	
			
			if(y>(arr.get(x).size()) - 1) {
				System.out.println("ERROR!");
			}
			
			else {
				System.out.println(arr.get(x).get(y));
			}
		}

	}

}