/*

	1
	A	B
	1	2	3
	A	B	C	D
	1	2	3	4	5

*/

class Pattern70{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			char ch='A';
			for(int j=1;j<=5;j++){
				if(j<=i){
					if(i%2==0){
						System.out.print(ch+" ");
						ch++;
					}else{
						System.out.print(j+" ");
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}