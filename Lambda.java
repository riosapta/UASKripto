import java.lang.Math; 
public class Lambda {
    double res;
    double p;
    double x3;
    double y3;
    public Lambda(){
        this.res = 0;
    }

    public double count(double x, double y, double a, double p){
        this.p= p;
        res = (((Math.pow(x, 3)) + a)/(2 * y)) % p;
        return res;
    }

    public double getX(double x, double x2){
        x3 = ((Math.pow(this.res, 2)) - x - x2) % p;
        return x3;
    }

    public double getY(double x, double y){
        y3 = (this.res*(x - x3) - y) % p;
        return y3;
    }
}
