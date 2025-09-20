/*

						A
					B	A
				C	B	A
			D	C	B	A
		E	D	C	B	A
		
*/

class Pattern66{
	public static void main(String[] args){
		char ch='F';
		for(int i =1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=5-i){
					System.out.print("   ");
				}else{
					System.out.print((char)(ch-j)+"  ");
				}
			}
			System.out.println();
		}
	}
}