import java.lang.Math; 
public class Lambda {
    double res;
    double x3;
    double y3;
    public Lambda(){
        this.res = 0;
    }

    public double count(double x, double y, double a){
        res = ((Math.pow(x, 3)) + a)/(2 * y);
        return res;
    }

    public double getX(double x, double x2){
        x3 = (Math.pow(this.res, 2)) - x - x2;
        return x3;
    }

    public double getY(double x, double y){
        y3 = this.res*(x - x3) - y;
        return y3;
    }
}
