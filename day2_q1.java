import java.util.*;
public class day2_q1{

public static void main(String[] args)
{
	int x,y,i,j,k;
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for(i=0;i<n;i++){
		for(j=0;j<(2*n)-1;){
			if(((j+i)-(n-1))==0){
				k=1;
				while(k<=(i+1)){
					System.out.print(k);
					k++;
					j++;
				}k--;
				while(k>1){
					k--;
					System.out.print(k);
					j++;
				}
			}
			else{
				System.out.print("*");
				j++;
			}
		}
		System.out.println();
	}
}
}
