/*
	1	2	3	4	5
	6			7
	8		9
	10	11
	12

*/

class Pattern54{
	public static void main(String[] args){
		int count=1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=5;j++){
				if(i==1 || j==1 || j==6-i){
					System.out.print(count+"\t");
					count++;
				}else{
					System.out.print(" \t");
				}
			}
			System.out.println();
		}
	}

}