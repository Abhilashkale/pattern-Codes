/*

	1	A	2	B	3
	C	4	D	5	E
	6	F	7	G	8
	H	9	I	10	J
	11	K	12	L	13

*/

class Pattern71{
	public static void main(String[] args){
		int count=1;
		char ch='A';
		boolean flag=true;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(flag){
					System.out.print(count+"  ");
					count++;
					flag = false;
				}else{
					System.out.print(ch+"  ");
					ch++;
					flag = true;
				}
			}
			System.out.println();
		}
	}
}