



/*
	1
	3	3	3
	5	5	5	5	5	
	3	3	3
	1

*/



class Pattern44{
	public static void 	main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=i){
					System.out.print(i+" ");
				}else{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		
	}
}

