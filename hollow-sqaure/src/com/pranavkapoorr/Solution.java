package com.pranavkapoorr;

/*
**********
*        *
*        *
*        *
*        *
*        *
*        *
*        *
*        *
**********

*/

class Solution {
	protected void DrawHollowSqaure(int size) {
        int width, height;
        width = height = size;//being square

        // Loop denoting rows 
        for (int i = 0; i < height; i++) { 
          
	        // Loop denoting columns 
	        for (int j = 0; j < width; j++) { 
	              
		            // Checking conditions for printing 
		            // pattern 
		            if ( i==0 || j==0 || i==height-1 || j==width-1) {
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
    new Solution().DrawHollowSqaure(20);
  }
}
