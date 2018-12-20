import java.lang.*;
import java.util.*;
public class day2_q4{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);	
	System.out.println("Enter the principal amount : ");
	double p=sc.nextDouble();
	System.out.println("Rate of interest : ");
	double r=sc.nextDouble();
	System.out.println("Time period : ");
	double t=sc.nextDouble();
	System.out.println("Number of times interest is compounded : ");
	int n=sc.nextInt();
	
	double s_i=p*(r/100)*t;
	double c_i=p*Math.pow((1+((r/100)/n)),n*t);
	System.out.println("Simple Interest : "+s_i);
	System.out.println("Compound Interest : "+c_i);	
}
}	
