package com.pranavkapoorr;

/*
********
**    **
* *  * *
*  **  *
*  **  *
* *  * *
**    **
********
*/

class Solution {
	protected void DrawCrossInSqaure(int size) {
        int width, height;
        width = height = size;//being square

        // Loop denoting rows 
        for (int i = 1; i <= height; i++) { 
          
	        // Loop denoting columns 
	        for (int j = 1; j <= width; j++) { 
	              
		            // Checking conditions for printing 
		            // pattern 
		            if ( i==1 || j==1 || i==height || j==width || i==j || j==height-i+1 ) {
		                    System.out.print("*"); 
		            }
		            else {
		                    System.out.print(" "); 
		            }
	            } 
	            System.out.println(); 
        } 
	}
	
  public static void main(String[] args) {
    new Solution().DrawCrossInSqaure(9);
  }
}
