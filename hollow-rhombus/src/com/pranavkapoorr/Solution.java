package com.pranavkapoorr;

/*

   ****
  ****
 ****
****

*/

class Solution {
	protected void DrawHollowRhombus(int size) {
        
        // Loop creating rows 
        for (int i = 1; i <= size; i++) { 
            // for putting " "
            for (int k = 1; k <= size-i; k++) { 
                System.out.print(" "); 
            }
	        // for putting *
	        for (int j = 1; j <= size; j++) { 
                    if( j==size || i==size || i==1 || j==1 ){
                        System.out.print("*"); 
                    }else{
                        System.out.print(" ");
                    }
		        }
	            System.out.println(); 
        } 
	}
	
  public static void main(String[] args) {
    new Solution().DrawHollowRhombus(4);
  }
}
