package Jan14;

public class CalculatorClass {

    double x;
    double y;
    double z;
    double x1;

    public double sum(double x, double y){
        return x + y;
    }
    public double sum(double x, double y, double z){
        return x + y + z ;
    }
    public double sum(double x, double y,double z, double x1){ return x + y + z + x1;  }
    public double mul(double x, double y){
        return x * y;
    }
    public double mul(double x, double y, double z){
        return x * y * z;
    }
    public double mul(double x, double y,double z, double x1){
        return x * y * z * x1;
    }
    public double div(double x, double y){
        return x / y;
    }
    public double sub(double x, double y){
        return x - y;
    }
    public double mod(double x, double y){
        return x % y;
    }

}
