import java.lang.Math; 
import java.io.*; 

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
        res = (((Math.pow(3*x, 2)) + a)*modInverse(2*y, p)) % p;
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

    public double modInverse(double a, double m) 
    { 
        a = a % m; 
        for (int x = 1; x < m; x++) 
            if ((a * x) % m == 1) 
                return x; 
        return 1; 
    } 
}
