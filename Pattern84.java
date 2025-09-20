/*

1	A	2	B	3  
  C	  4   D   5  
	6	E	7  
  F   8   G   9  
H	10	I	11	J


*/

class Pattern84{
	public static void main(String[] args){
		boolean flag =true;
		boolean flag2 =true;
		int count=1;
		char ch='A';
		for(int i=1;i<=5;i++){
			if(i==3){
				flag2= true;
			}
			for(int j=1;j<=9;j++){
				if((j>=i && j>=6-i && j<=10-i && j<=4+i) && flag){
					if(flag2){
						System.out.print(count+"  ");
						flag2=false;
						count++;
					}else{
						System.out.print(ch+"  ");
						flag2=true;
						ch++;
					}
					flag=false;
					
				}else{
					System.out.print("   ");
					flag = true;
				}
			}System.out.println();
		}
	}
}