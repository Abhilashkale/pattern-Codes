/*

A      						A
A	B    				B	A
A	B	C  			C	B	A
A	B	C	D	D	C	B	A
A	B	C  			C	B	A
A	B   				B	A
A							A

*/

class Pattern81{
	public static void main(String[] args){
		for(int i=1;i<=7;i++){
			int ch=64;
			//char ch='A';
			for(int j=1;j<=8;j++){
				if((i<=4 && (j<=i || j>=9-i)) || (i>=5 && (j<=8-i || j>=i+1))){
					if(j<5){
						System.out.print((char)(ch+j)+"    ");
					}else{
						System.out.print((char)(ch+9-j)+"    ");
					}
				}else{
					System.out.print("     ");
				}
			}
			System.out.println();
		}
	}
}