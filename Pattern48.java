/*

					1
				1		2
			1		2		3
		1		2		3		4
	1		2		3		4		5
		1		2		3		4
			1		2		3
				1		2
					1

*/



class Pattern48{
	public static void 	main(String[] args){
		boolean flag=true;
		//int count;
		for(int i=1;i<=9;i++){
			// = 1;
			for(int j=1;j<=9;j++){
				if(((i<=5 &&(j>=6-i && j<=4+i)) || (i>=6 &&(j>=i-4 && j<=14-i)))&& flag){
					System.out.print(count+"  ");
					flag=false;
					//count++;
				}
				else{
					System.out.print("   ");
					flag=true;
				}
			}
			System.out.println();
		}
		
	}
}
