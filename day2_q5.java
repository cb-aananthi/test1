import java.util.*;
public class day2_q5{

public static void main(String[] args)
{
	Scanner sc=new Scanner (System.in);
	int a=1,b=1,i,n,c;
	System.out.println("Enter the value of n: ");
	n=sc.nextInt();
	System.out.print(a+","+b+",");
	for(i=2;i<n;i++){
		c=a+b;
		System.out.print(c+",");
		
		a=b;
		b=c;
	}
	
}	
		
}
