/*
			1
		1	2	1	
    1	2	3	2	1
1	2	3	4	3	2	1
 	1	2	3	2	1	
		1	2	1	
			1

*/


class Pattern56{
	public static void main(String[] args){
		int n;
		for(int i=1;i<=7;i++){
			n=1;
			for(int j=1;j<=7;j++){
				if((i<=4 && j>=5-i && j<=3+i) || (i>=5 && j>=i-3 && j<=11-i)){
					System.out.print(n+"  ");
					if(j<4){
						n++;
					}else{
						n--;
					}
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}