package com.pranavkapoorr;

/*

  
********1********
*******2*2*******
******3*3*3******
*****4*4*4*4*****
****5*5*5*5*5****
***6*6*6*6*6*6***
**7*7*7*7*7*7*7**
 
*/

class Solution {
	protected void DrawNumberPyramid(int size) {
        
        for (int i = 1; i <= size; i++) { 
          for (int j = 1; j <= size; j++) {
            if( j<=size-i) {
              System.out.print("*"); 
            }
          }
	        for (int j = 1; j <= i; j++) {
            if(j!=1){
              System.out.print("*");
            }
              System.out.print(i);
              
      
		    }
	        System.out.println(); 
      } 
	}
	
  public static void main(String[] args) {
    new Solution().DrawNumberPyramid(7);
  }
}
