/*
					*
				*		*
			*		*		*
		*		*		*		*
	*		*		*		*		*
		*		*		*		*
			*		*		*
				*		*
					*


*/

class Pattern29{
	public static void 	main(String[] args){

		for(int i=1;i<=9;i++){
			boolean flag = true;
			for(int j=1;j<=9;j++){
				if((i<=5 &&(j>=6-i && j<=4+i) && flag) || (i>=6 &&(j>=8-i && j<=14-i) && flag)){
					System.out.print("*  ");
					flag = false;
				}
				else{
					System.out.print("   ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}

