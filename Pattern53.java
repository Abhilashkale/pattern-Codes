/*

	1	0	0	0	1
	0	1	0	1	0
	0	0	1	0	0
	0	1	0	1	0
	1	0	0	0	1

*/

class Pattern53{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j==i || j==6-i){
					System.out.print(1+"   ");
				}else{
					System.out.print(0+"   ");
				}
			}
			System.out.println();
		}
	}

}