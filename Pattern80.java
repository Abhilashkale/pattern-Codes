/*

A
B	C
C		D
D			E
E	F	G	H	I


*/

class Pattern80{
	public static void main(String[] args){
		
		for(int i=1;i<=5;i++){
		int ch=64;
			for(int j=1;j<=5;j++){
				if(i==j || j==1 || i==5){
					System.out.print((char)(ch+i)+"  ");
					ch++;
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}