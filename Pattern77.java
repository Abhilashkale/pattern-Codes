/*


					A
				#	#	#
			A	B	C	B	A
		#	#	#	#	#	#	#
	A	B	C	D	E	D	C	B	A
		#	#	#	#	#	#	#
			A	B	C	B	A
				#	#	#
					A

*/

class Pattern77{
	public static void main(String[] args){
		for(int i=1;i<=9;i++){
			char ch='A';
			for(int j=1;j<=9;j++){
				if((i<=5 && j>=6-i && j<=4+i) || (i>=6 && j>=i-4 && j<=14-i)){
					if(i%2==0){
						System.out.print("#  ");
					}else{
						System.out.print(ch+"  ");
						if(j<5){
							ch++;
						}else{
							ch--;
						}
					}
					
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}
}