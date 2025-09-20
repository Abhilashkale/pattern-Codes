/*
	    		1
   		      1   1
    	    1   	1
 	     1     		  1
	   1    2	3	4	1


*/



class Pattern58{
	public static void main(String[] args){
		//boolean flag=true;
		int count=2;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(j==6-i || j==4+i){
					System.out.print(1+" ");
				}
				else if(i==5){
					if(j%2 !=0){
						System.out.print(count+" ");
						count++;
					}else{
						System.out.print("  ");
					}
				}
				else{
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}