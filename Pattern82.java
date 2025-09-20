/*

A	B	C	D	E	D	C	B	A
A								A
A								A
A								A
A								A



*/

class Pattern82{
	public static void main(String[] arg){
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==1 || j== 9 || i==1){
					if(i==1){
						System.out.print(ch+"  ");
						if(j<5){
							ch++;
						}else{
							ch--;
						}
						
					}else{
						System.out.print("A  ");
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}