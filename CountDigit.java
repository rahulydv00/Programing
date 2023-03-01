public class CountDigit {
    public static int countDigits(int num) {
        int count = 0;
        int n=num;
        while(num>0){
            int digit= num%10;
            if(n%digit==0){
                count++;
            }
           num= num/10;
        }
        return count;
    }
    public static void main(String[] args){
        int n = 123;
        countDigits(n);
    }
}
