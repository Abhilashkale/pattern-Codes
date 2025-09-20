/*

	1	2	3	4	5	6	7	8	9
		1	2	3	4	5	6	7
			1	2	3	4	5	
				1	2	3
					1
*/

class Pattern38{
	public static void main(String[] args){
		int count;
		for(int i=1;i<=9;i++){
			count=1;
			for(int j=1;j<=9;j++){
				if(j>=i && j<=10-i){
					System.out.print(count+"  ");
					count++;
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}