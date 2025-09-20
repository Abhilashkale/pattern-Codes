/*
				1
			2	2
		3	3	3
	4	4	4	4
		3	3	3	
			2	2
				1

*/


class Pattern51{
	public static void main(String[] args){
		int n=1;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=4;j++){
				if((i<=4 &&j<=4-i) || (i>4 && j<=4-n)){
					System.out.print("   ");
				}else{
					System.out.print(n+"  ");
				}
			}
			System.out.println();
			if(i<4){
				n=n+1;
			}else{
				n=n-1;
			}
		}
	
	}

}