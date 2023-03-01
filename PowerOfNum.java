public class PowerOfNum {
    public static double myPow(double x, int n) {
        for(int i=0;i<n;i++){
            x=x*x;
            
        }
        return x;
    }
    public static void main(String[] args){
        double x = 2.00000000;
        int n = 2;
        myPow(x, n);
    }
}