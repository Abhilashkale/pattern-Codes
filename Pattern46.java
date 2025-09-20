/*
	1
	2	3
	4		5
	6			7
	8	9	10	11	12

*/


class Pattern46{
	public static void 	main(String[] args){
		int count=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==5 || j==1 || i==j){
					System.out.print(count+"   ");
					count++;
				}
				else{
					System.out.print("    ");
				}
			}
			System.out.println();
		}
		
	}
}
