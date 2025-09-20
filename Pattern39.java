/*
	1	*	*	*	*
	2	2	*	*	*
	3	3	3	*	*
	4	4	4	4	*
	5	5	5	5	5

*/


class Pattern39{
	static public void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=i){
					System.out.print(i+"  ");
				}else{
					System.out.print("*  ");
				}
			}
			System.out.println();
		}
	}

}