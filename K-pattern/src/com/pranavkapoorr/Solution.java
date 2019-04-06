package com.pranavkapoorr;

/*

  
 *     *
 *    *
 *   *
 *  *
 * *
 *  *
 *   *
 *    *
 *     *
 *      *   
 
 even size will make proper P
*/

class Solution {
	protected void DrawK(int size) {
        
        for (int i = 1; i <= size; i++) { 
            
	        for (int j = 1; j <= size; j++) {
                if( j==1  || (i>=size/2+1 && j==i-4) || (i<size/2+1 && j==size-i-2) ) {
                    System.out.print("*"); 
                }else{
                    System.out.print(" "); 
                }
		            
		    }
	        System.out.println(); 
        } 
	}
	
  public static void main(String[] args) {
    new Solution().DrawK(10);
  }
}
