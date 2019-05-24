public class Solution {
    private void drawAlphabets(int size){
        for(int i = 1; i <= size; i++){
            for(int j = 1; j <= size; j++){
                logicA(i,j)?System.out.print("*"):System.out.print(" ");
            }
            System.out.println();
        
    }
    private boolean logicA(int i, int j){
        return (i==1);
    }
    
    public static void main(String[] args) {
        new Solution().drawAlphabets(10);
    }
}