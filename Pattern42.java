/*

	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1
 
*/


class Pattern42{
	public static void 	main(String[] args){
		int n=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if((i<=3 && j<=n) || (i>3 && j<=n)){
					System.out.print(n+"  ");
				}
			}
			System.out.println();
			if(i<3){
				n=n+2;
			}else{
				n=n-2;
			}
			
		}
		
	}
}