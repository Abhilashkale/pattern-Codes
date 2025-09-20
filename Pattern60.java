/*

1        							1
1	2							2	1
1	2	3					3	2	1
1	2	3	4			4	3	2	1
1	2	3	4	5	5	4	3	2	1

*/


class Pattern60{
	public static void main(String[] args){
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j<=i || j>=10-i){
					if(j<=5){
						System.out.print(j+"  ");
					}
					else{
						System.out.print(10-j+"  ");
					}
				}
				else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}