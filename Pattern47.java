/*

					1
				2		2
			3				3
		4						4
	5								5
		4						4
			3				3
				2		2
					1
	
*/



class Pattern47{
	public static void 	main(String[] args){
	
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if((i<=5 &&(j==6-i||j==4+i)) || (i>=6 &&(j==i-4||j==14-i))){
					if(i<=5){
						System.out.print(i+" ");
					}else{
						System.out.print(10-i+" ");
					}
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}
