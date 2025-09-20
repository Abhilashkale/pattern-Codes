/*


A								I
	B						H
		C				G
			D		F
				E	
				
*/

class Pattern73{
	public static void main(String[] args){
		//char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==i || j==10-i){
					System.out.print((char)(64+j)+"  ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}


