package com.pranavkapoorr;

/*

  
*******1*******
******2*2******
*****3*3*3*****
****4*4*4*4****
***5*5*5*5*5***
**6*6*6*6*6*6**
*7*7*7*7*7*7*7*
 
give any size b/w 1-9 , above 9 will deform it a bit
*/

class Solution {
	protected void DrawNumberPyramid(int size) {
        
        for (int i = 1; i <= size; i++) { 
          for (int j = 1; j <= size; j++) {
            if( j<=size-i+1) {
              System.out.print("*"); 
            }
          }
	        for (int j = 1; j <= i; j++) {
            if(j!=1){
              System.out.print("*");
            }
              System.out.print(i);
          }
          for (int j = 1; j <= size; j++) {
            if( j<=size-i+1) {
              System.out.print("*"); 
            }
          }
	        System.out.println(); 
      } 
      
	}
	
  public static void main(String[] args) {
    new Solution().DrawNumberPyramid(9);
  }
}
