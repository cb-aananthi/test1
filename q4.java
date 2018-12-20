import java.util.*;
import java.lang.*;


public class q4{

public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	int x,y,f=1,i=1;
	x=sc.nextInt();
	y=sc.nextInt();
	while(f==1){
		if(Math.pow(x,i)>y){
			f=0;
			break;
		}
		else
			i++;
	}
	System.out.println("Smallest value of x that is greater than y is : "+i);
}
}
