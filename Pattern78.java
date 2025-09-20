/*

A 	B 	C 	D
A     		D
A			D
A	B	C	D

*/

import java.util.*;
class Pattern78{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row");
		int row =sc.nextInt();
		System.out.println("Enter Column");
		int col =sc.nextInt();
		
		int ch=64;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=col;j++){
				if(i==1||j==1||i==row||j==col){
					System.out.print((char)(ch+j)+"  ");
				}else{
					System.out.print("   ");
				}
			}
			System.out.println();
		}
	}

}