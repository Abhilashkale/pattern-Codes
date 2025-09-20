/*

	A	B	C	D	E
		1	2	3	4
			A	B	C
				1	2
					A
*/

class Pattern74{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			char ch='A';
			int count=1;
			for(int j=1;j<=5;j++){
				if(j<i){ 
					System.out.print("   ");
				}else{
					if(i%2==0){
						System.out.print(count+"  ");
						count++;
					}else{
						System.out.print(ch+"  ");
						ch++;
					}
				}
			}
			System.out.println();
		}
	}
}