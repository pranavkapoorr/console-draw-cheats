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
		for (int i = 1; i <= size; i++) { 
	            for (int j = 1; j <= size; j++) { 
	                if ( i == j || j == (size - i + 1)) {            
	                    System.out.print("*");   
	                }
	                else  {         
	                    System.out.print(" "); 
	                }
	            } 
	            System.out.println(); 
	        } 
	}
	
  public static void main(String[] args) {
    new Solution().DrawX(3);
  }
}
