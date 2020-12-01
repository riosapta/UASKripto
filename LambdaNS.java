public class LambdaNS {
    double res;
    double p;
    double x3;
    double y3;

    public LambdaNS(){
        this.res=0;
    }
    
    public double count(double x, double y, double x2, double y2, double p){
        this.p = p;
        res = ((y2 - y) * modInverse((x2 - x), p)) % p;
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
        for (int i = 1; i < m; i++) 
            if ((a * i) % m == 1) 
                return i; 
        return 1; 
    } 
}
