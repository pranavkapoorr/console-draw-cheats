package com.pranavkapoorr;

/*
        *
      * * * 
    *   *   * 
  *     *     *
* * * * * * * * *
  *     *     *
    *   *   *
      * * *
        *

*/

class Solution {
	protected void DrawPattern(int size) {
		// For printing upper portion 
        int c1 = (size - 1) / 2; 
      
        // For printing lower portion 
        int c2 = 3 * size / 2 - 1; 
      
        // Loop denoting rows 
        for (int i = 0; i < size; i++) { 
          
	        // Loop denoting columns 
	        for (int j = 0; j < size; j++) { 
	              
		            // Checking conditions for printing 
		            // pattern 
		            if (i + j == c1 || i - j == c1 || j - i == c1 || i + j == c2 || i == c1 || j == c1) {
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
    new Solution().DrawPattern(9);
  }
}
