/*
	5	*	5	*	5
	4	*	4	*
	3	*	3
	2	*
	1

*/


class Pattern40{
	static public void main(String[] args){
		for(int i=5;i>=1;i--){
			for(int j=1;j<=5;j++){
				if(j<=i){
					if(j%2 !=0){
						System.out.print(i+"  ");
					}else{
						System.out.print("*  ");
					}
					
				}
			}
			System.out.println();
		}
	}

}