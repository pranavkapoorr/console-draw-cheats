package com.pranavkapoorr;

/*

 *********  
 *        * 
 *        * 
 *        * 
 ********* 
 *
 * 
 *
 *
 *
 
 even size will make proper P
*/

class Solution {
	protected void DrawP(int size) {
        
        for (int i = 1; i <= size; i++) { 
            
	        for (int j = 1; j <= size; j++) {
                if( j==1 || (i!=1 && j==size && i<size/2) || (i==1 && j<size) || (i==size/2 && j<size) ) {
                    System.out.print("*"); 
                }else{
                    System.out.print(" "); 
                }
		            
		    }
	        System.out.println(); 
        } 
	}
	
  public static void main(String[] args) {
    new Solution().DrawP(6);
  }
}
