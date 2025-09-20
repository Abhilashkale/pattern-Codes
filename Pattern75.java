/*

A
A	B	A
A	B	C	B	A
A	B	C	D	C	B	A
A	B	C	D	E	D	C	B	A

*/


class Pattern75{
	public static void main(String[] args){
		int n=1;
		
		for(int i=1;i<=5;i++){
			//char ch='A';
			int ch=64;
			for(int j=1;j<=9;j++){
				if(j<=n){
					if(j<=i){
						ch++;
					System.out.print((char)(ch)+"  ");
						
					}else{
						ch--;
						System.out.print((char)(ch)+"  ");
					}
					
				}
			}
			n=n+2;
			System.out.println();
		}
	}
}