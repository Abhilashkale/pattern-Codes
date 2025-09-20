/*

			 *******
			 ******
 			 *****
 			 ****
 			 ***
 			 **
 			 *
 			 **
 			 ***
 			 ****
 			 *****
 			 ******
 			 *******
*/

class Pattern14{
	public static void main(String[] args){
		for(int i=1;i<=13;i++){
			for(int j=1;j<=7;j++){
				if((i<=7 && j<=8-i) || (i>=8 && j<=i-6)){
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
