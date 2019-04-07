package com.pranavkapoorr;

/*

  
*     * * * *
*     *
*     *
* * * * * * *
      *     *
      *     *
* * * *     *

*/

class Solution {
	protected void DrawK(int size) {
        int width = size * 2 - 2;
        for (int i = 1; i <= size; i++) { 
            
	        for (int j = 1; j <= width; j++) {
                if( (j==1 && i <= size-1/2+2) || (j==width)) {
                    System.out.print(" * "); 
                }else{
                    System.out.print(" "); 
                }
		            
		    }
	        System.out.println(); 
        } 
	}
	
  public static void main(String[] args) {
    new Solution().DrawK(7);
  }
}
