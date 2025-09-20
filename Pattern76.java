/*

								A
						1	2	1
				A	B	C	B	A
		1	2	3	4	3	2	1
A	B	C	D	E	D	C	B	A


*/


class Pattern76{
	public static void main(String[] args){
		int n=9;
		
		for(int i=1;i<=5;i++){
			int count=1;
			char ch='A';
			for(int j=1;j<=9;j++){
				if(j<n){
					System.out.print("   ");
				}else{
					if(i%2==0){
						System.out.print(count+"  ");
						if(j<10-i){
							count++;
						}else{
							count--;
						}
						
					}else{
						System.out.print(ch+"  ");
						if(j<10-i){
								ch++;
							}else{
								ch--;
							}
					}
					
				}
			}
			n=n-2;
			System.out.println();
		}
	}
}