import java.util.*;
public class day2_q6{

public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	int[] a=new int[100];
	int i;
	System.out.println("Enter the value of n: ");
	int n=sc.nextInt();
	for(i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	int min,max;
	min=a[0];max=a[0];
	for(i=0;i<n;i++){
		if(min>a[i]){
			min=a[i];
		}
		if(max<a[i]){
			max=a[i];
		}
	}
	System.out.print("Minimum value: "+min+"\nMaximum value: "+max);
}	
		
}
