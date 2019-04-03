package com.pranavkapoorr;


/*
* Write a program that takes as input an integer size (can simply be a variable * - no need to deal with user input), and outputs big ASCII “X” on the console * with size rows and columns.
* 
* E.g.
* 
* size = 3
* 
*   * *
*    *
*   * *
* 
* size = 4
* 
*   *  *
*    **
*    **
*   *  *
* 
* size = 5
* 
*   *   *
*    * *
*     *
*    * *
*   *   *
*/

class Solution {
	protected void DrawX(int size) {
		for(int i=size==5?size-2:size-1;i>1;i--){ //i>1 to skip last iteration to avoid single *
			
			for(int j=1;j<=size-i;j++){//to put  " " right and left of upper section of X
				System.out.print(" ");
			}
			
			for(int j=1;j<=i*2-1;j++){
				
				if(j!=1 && j!=i*2-1) {//to put  " " in upper section of X
					System.out.print(" ");
				}else {
					System.out.print("*");//to put  * in upper section of X
				}
				
			}
			System.out.println();
		}
		
		for(int i=size==4?2:1;i<=size-(size==5?2:1);i++){//it will include last iteration to put * for X midpoint
			
			for(int j=1;j<=size-i;j++){//to put  " " right and left of lower section of X
				System.out.print(" ");
			}
			
			for(int j=1;j<=i*2-1;j++){
				
				if(j!=1 && j!=i*2-1) {//to put  " " lower-middle section of X
					System.out.print(" ");
				}else {
					System.out.print("*");//to put * in lower section of x
				}
			}
			System.out.println();//line change
		} 
	}
	
  public static void main(String[] args) {
    new Solution().DrawX(3);
  }
}
