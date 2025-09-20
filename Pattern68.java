
/*

	A	B	C	D	E
	  A	  B	  C   D
		A	B	C
		  A   B
			A

*/

class Pattern68{
	static public void main(String[] args){
		boolean flag = true;
		for(int i=1;i<=5;i++){
			char ch='A';
			for(int j=1;j<=9;j++){
				if((j>=i && j<=10-i)&&flag){
					System.out.print(ch+" ");
					ch++;
					flag=false;
				}else{
					System.out.print("  ");
					flag = true;
				}
			}
			System.out.println();
		}
	}
}