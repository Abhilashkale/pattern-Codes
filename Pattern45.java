/*

	#	1	#	2	#
	3	#	4	#	5
	#	6	#	7	#
	8	#	9	#	10
	#	11	#	12	#

*/

class Pattern45{
	public static void 	main(String[] args){
		int count=1,flag=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(flag==1){
					System.out.print("#  ");
					flag=0;
				}else{
					System.out.print(count+"  ");
					count++;
					flag=1;
				}
			}
			System.out.println();
		}
		
	}
}