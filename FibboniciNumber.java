public class FibboniciNumber {
    public static int fib(int n) {
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        int a=0,b=1;
        int sum=a+b;
        while(n>1){
            sum = a+b;
            a=b;
            b=sum;
            n--;

        }
        return sum;

    }
    public static void main(String[] args){
        int n= 5;
        fib(n);
    }
}
