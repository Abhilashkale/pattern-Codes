/*
	1	2	3	4	5
	2	3	4	5	6
	3	4	5	6	7
	4	5	6	7	8
	5	6	7	8	9

*/


public class Pattern34{
	public static void main(String[] args){
		int temp;
		for(int i=1;i<=5;i++){
			temp=i;
			for(int j=1;j<=5;j++){
				System.out.print(temp+"  ");
				temp++;
			}
			System.out.println();
		}
		
	}
}