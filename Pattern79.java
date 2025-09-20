/*

A	B	C	D	E	D	C	B	A	
A	B	C	D	  	D	C	B	A	
A	B	C    			C	B	A
A	B     					B	A
A       						A
A	B     					B	A
A	B	C   			C	B	A
A	B	C	D 		D	C	B	A
A	B	C	D	E	D	C	B	A


*/

class Pattern79{
	public static void main(String[] arg){
		for(int i=1;i<=9;i++){
			int ch=64;
			for(int j=1;j<=9;j++){
				if((i<=5 && j<=6-i || j>=4+i) || (i>=6 && j<=i-4 || j>=14-i)){
					if(j<=5){
						ch++;
						System.out.print((char)ch+"   ");
					}else{
						ch=64;
						System.out.print((char)(ch+(10-j))+"   ");
					}
				}else{
					System.out.print("    ");
				}
			}
			System.out.println();
		}
	}
}