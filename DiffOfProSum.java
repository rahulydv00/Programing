public class DiffOfProSum {
    public static int subtractProductAndSum(int n) {
        int r =0;
        int sum = 0;
        int product = 1;
        while(n>0){
            r= n%10;
            product = product * r;
            sum = sum + r;
            n= n/10;
        }
        return product - sum;

    }
    public static void main(String [] args){
        int n= 234;
        subtractProductAndSum(n);

    }
}
