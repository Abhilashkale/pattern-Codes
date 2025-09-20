/*
	A	B	C	D	E
	B	C	D	E	F
	C	D	E	F	G
	D	E	F	G	H
	E	F	G	H	I

*/

class Pattern63{
	public static void main(String[] args){
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				System.out.print(ch+"   ");
				ch++;
			}
			ch='A';
			ch+=i;
			System.out.println();
		}
	}
}