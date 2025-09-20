/*

         1    
	   A   B   
     2	     3  
   B		   C	 	
 4	 5	 6	 7	 8

*/


class Pattern83{
	public static void main(String[] args){
		int count=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			for(int j=1;j<=9;j++){
				if(i<=4 && (j==6-i || j==4+i)){
					if(i%2 !=0){
						System.out.print(count+"  ");
						count++;
					}else{
						System.out.print(ch+"  ");
						ch++;
					}
					
				}
				else if(i==5){
					if(j%2 !=0){
						System.out.print(count+"  ");
						count++;
					}else{
						System.out.print("   ");
					}
				}
				
				else{
					System.out.print("   ");
				}
			}System.out.println();
		}
	}
}