/*

	#
	#	*
	#	*	#
	#	*	#	*
	#	*	#	*	#
	#	*	#	*
	#	*	#	
	#	*
	#	


*/

class Pattern24{
	public static void 	main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=5;j++){
				if((i<=5 && j<=i) || (i>=6 && j<=10-i)){
					if(j%2==0){
						System.out.print("*  ");
					}else{
						System.out.print("#  ");
					}
					
				}
			}
			System.out.println();
		}
	}
}