import java.util.*;
public class day2_q2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str;		
		int[][] a=new int[10][10];	
		int i,j,n;
		System.out.println("Enter the dimension of the matrix  : ");
		n=sc.nextInt();
		
		for(i=0;i<n;i++){
			for(j=0;j<n;j++){
				a[i][j]=sc.nextInt();	
			}
		}
		System.out.println("Rotation(left/right) : ");
		str=sc.next();
		if(str.equals("left")){
			System.out.println("left");
			for(i=n-1;i>=0;i--){
				for(j=0;j<n;j++){
					System.out.print(a[j][i]);
				}
				System.out.println();
			}
		}
		else{
			for(i=0;i<n;i++){
				for(j=n-1;j>=0;j--){
					System.out.print(a[j][i]);
				}
				System.out.println();
			}		
		}
	}
}
