/*

1       						9
	2     					8
  		3				7
   			4		6
				5
   			4 		6
  		3   			7
    2     					8
1       						9


*/


class Pattern59{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			for(int j=1;j<=9;j++){
				if(i==j || j==10-i){
					System.out.print(j+"   ");
				}else{
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
}