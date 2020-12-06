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
        // res = (((3*(Math.pow(x, 2)) + a))*modInverse(2*y, p)) % p;
        res = (((3*(Math.pow(x, 2)) + a))*modInverse(2*y, p));
        if (res>=0) {
            res = res % p;    
        }
        else if(res < -p){
            res = res % p;
            res = p + res;
        }
        else{
            res = p + res;
        }
        //System.out.println(res);
        return res;
    }

    public double getX(double x, double x2){
        // x3 = ((Math.pow(this.res, 2)) - x - x2) % p;
        x3 = ((Math.pow(this.res, 2)) - x - x2);
        if (x3>=0) {
            x3 = x3 % p;    
        }
        else if(x3 < -p){
            x3 = x3 % p;
            x3 = p + x3;
        }
        else{
            x3 = p + x3;
        }
        //System.out.println(x3);
        return x3;
    }

    public double getY(double x, double y){
        // y3 = (this.res*(x - x3) - y) % p;
        y3 = (this.res*(x - x3) - y);
        if (y3>=0) {
            y3 = y3 % p;    
        }
        else if(y3 < -p){
            y3 = y3 % p;
            y3 = p + y3;
        }
        else{
            y3 = p + y3;
        }
        //System.out.println(y3);
        return y3;
    }

    public double modInverse(double a, double m) 
    { 
        a = a % m; 
        for (int i = 1; i < m; i++) 
            if ((a * i) % m == 1) 
                return i; 
        return 1; 
    } 
}
