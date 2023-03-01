public class TempConverter {
    public static double[] temp(int celcius){
      double[] ans = new double[2];
      double k= celcius + 273.5;    
      double f= (1.80*celcius)+32;
      ans[0]= k;
      ans[1]= f;
      return ans;
    }
    public static void main(String[] args){
        int c= 55;
        temp(c);
    }
}
