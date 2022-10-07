package week6;

public abstract class abscal {
    public double cal(double a,double b){
        double sum=0;
        int n=100000;
        double deltaX=(double)(b-a)/n;
        for (int i = 0; i < n; i++) {
            sum+=deltaX*(function(a+i*deltaX));
        }
        return sum;
    }
    public  abstract double function(double x);
}
class test{
    public static void main(String[] args) {
        abscal a=new abscal() {
            @Override
            public double function(double x) {
                return x*x+2*x;
            }
        };
        System.out.println(a.cal(10, 20));
    }
}











