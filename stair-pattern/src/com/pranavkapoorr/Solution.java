package com.pranavkapoorr;

/*

* *
* *
* * * *
* * * *
* * * * * *
* * * * * *
 

*/

class Solution {
	protected void DrawStairCase(int steps) {
        int stepWidth = 4;
        int stepHeight = 2;
        
        for (int i = 1; i <= steps; i++) { 
             int k ; 
             if(i % 2 != 0) {
                k = i + 1 ; 
             }
             else {
                k = i ;
             }
               
             for (int j = 0; j < k; j++) {
                System.out.print(" * "); 
             }
             System.out.println(); 
         } 
        
	}
	
  public static void main(String[] args) {
    new Solution().DrawStairCase(6);
  }
}
