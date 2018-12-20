import java.util.*;
public class day2_q3{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	char[] alphabets={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	
	System.out.print("Enter the input String : ");
	String str=sc.next();
	int n=str.length();
	int i,j,sum=0;
	for(i=0;i<n;i++){
		for(j=0;j<26;j++){
			if(str.charAt(i)==alphabets[j]){
				sum+=j+1;
			}
		}
	}
	if(sum%2==0){
		System.out.println("Even");
	}
	else{
		System.out.println("Odd");
	}
}
}	
