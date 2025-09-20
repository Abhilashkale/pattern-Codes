/*

	E	E	E	E	E
	D	D	D	D
	C	C	C
	B	B
	A

*/

class Pattern65{
	public static void main(String[] args){
		char ch='E';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(j<=6-i){
					System.out.print(ch+"   ");
				}
			}
			ch--;
			System.out.println();
		}
	}
}