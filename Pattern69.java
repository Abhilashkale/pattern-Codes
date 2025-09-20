/*

	A	1	2	3	4
	A	B	1	2	3
	A	B	C	1	2
	A	B	C	D	1
	A	B	C	D	E
	
*/


public class Pattern69{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			char ch='A';
			int count=1;
			for(int j=1;j<=5;j++){
				if(j<=i){
					System.out.print(ch+"  ");
					ch++;
				}else{
					System.out.print(count+"  ");
					count++;
				}
			}System.out.println();
		}
	}
}