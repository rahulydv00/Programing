import java.util.*;
class Solution {
    public static int reverse(int x) {
       int reverse = 0;  
       int r=0;
    while(x!=0){
        r=x%10;
        int newReverse= reverse*10+r;
        if((newReverse-r)/10!=reverse){
            return 0;
        }
        x=x/10;
        reverse= newReverse;
    }
         return reverse;
     }
       public static void main(String[] args){
           int x=123;
           reverse(x);
       } 
    
} 