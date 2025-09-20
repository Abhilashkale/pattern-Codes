/*
	  	1
      1	  1
    1	2	1
  1	  3   3   1
1	4	6	4	1

*/


class Pattern57{
	public static void main(String[] args){
		for(int i=0;i<=4;i++){
			int c=0;
			for(int j=0;j<=i;j++){
				if(i==0 || j==0){
					c=1;
				}else{
				c = c*((i-j)+1)/j;
				}
				System.out.print(c+" ");
			}
			
			System.out.println();
		}
	}
}