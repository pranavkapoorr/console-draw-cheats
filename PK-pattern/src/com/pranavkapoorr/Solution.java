public class Solution {
/*

 *********        *     *
 *        *       *    *
 *        *       *   *
 *        *       *  *
 *********        * *
 *                *  *
 *                *   *
 *                *    *
 *                *     *
 *                *      *
 
 even size will make proper P
*/
    private void drawPK(){
        int size = 21;
        for(int i = 1;i <= size/2;i ++){
            for(int j = 1;j <= size;j ++){
                if(
                    j==1 || (i==((size-1)/2)/2 && j<(size-1)/2) 
                    || (j==(size-1)/2 && i<(size-1)/2/2 && i>1) 
                    || (i==1 && j<(size-1)/2)
                ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int j = 1;j <= size;j ++){
                if(
                    j==1 
                    || (j==i-3 && i>(size-1)/2/2)
                    || (i<size-1/2/2 && j==size/2-1-i-2)
                    
                ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        new Solution().drawPK();
    }
}