public class IsPalindrome {
        public static boolean isPalindrome(int x) {
            if(x<0){
                return false;
            }
            if(x==0){
                return true;
            }
            int rev=0;
            while(x!=0){
                int r= x%10;
                rev=rev*10+r;
                x=x/10;
            }
            if(rev==x){
                return true;
            }
            else{
                return false;
            }
        }
        public static void main(String[] args){
            int x= 1221;
            isPalindrome(x);
        }
    }
