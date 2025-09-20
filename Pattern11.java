
/*	*
	*  *
	*     *
	*        *
	*  *  *  *  *
*/
	
	
import java.util.*;
class Pattern11{
	public static void main(String[] args){
		/*for(int i=1;i<7;i++){
			for(int j=1;j<=6-i;j++){
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++){
				System.out.print("* ");
			}
			System.out.println();
		}*/
		
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==5 || j==1 || i==j){
					System.out.print("*  ");
				}else{
					System.out.print("   ");
				}
				
			}
			System.out.println();
		}

	}
}