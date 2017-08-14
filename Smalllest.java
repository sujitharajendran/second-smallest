package loc;
import java.util.*;
public class Smalllest {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		int t[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
			
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			t[i]=a[1];
		}
		System.out.println(a[1]);
	}

}
