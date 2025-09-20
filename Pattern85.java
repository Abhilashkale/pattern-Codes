/*
	D
	D	C
	D	C	B
	D	C	B	A
	D	C	B
	D	C
	D

*/

class Pattern85{
	public static void main(String[] args){
		int n=1;
		int ch=64;
		for(int i=1;i<=7;i++){
			for(int j=1;j<=5;j++){
				if(j<=n){
					System.out.print((char)(ch+5-j)+"  ");
				}else{
					System.out.print("   ");
				}
			}
			if(i<4){
				n++;
			}else{
				n--;
			}
			System.out.println();
		}
	}
}