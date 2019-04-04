package com.pranavkapoorr;

/*
    *
   ***
  *****
 
height should be odd number like 1, 3, 5 ,etc.
*/

class Solution {
	protected void DrawEquilateralTriangle(int height) {
        //for first line spacing
        for(int x = 1;x<=height;x++){
            System.out.print(" ");
        }
        //first line *
        System.out.print("*");
        //line change
        System.out.println();
        //height-1 to avoid last iteration as first line done above
        for (int i = 1; i <= height-1; i++) { 
            //add spacing
            for (int k = 1; k <= height-i; k++) { 
                System.out.print(" "); 
            }
            //left half right angle triangle
            for (int k = 1; k <= i+1; k++) { 
                System.out.print("*"); 
            }
            //right half right angle triangle
            for (int k = 1; k <= i; k++) { 
                System.out.print("*"); 
            }
	            System.out.println(); 
        } 
        
	}
	
  public static void main(String[] args) {
    new Solution().DrawEqilateralTriangle(5);
  }
}
