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
        // res = ((y2 - y) * modInverse((x2 - x), p)) % p;

        res = ((y2 - y) * modInverse((x2 - x), p));
        if (res>=0) {
            res = res % p;    
        }
        else{
            res = p + res;
        }
        System.out.println(res);
        return res;
    }

    public double getX(double x, double x2){
        //x3 = ((Math.pow(this.res, 2)) - x - x2) % p;
        
        x3 = ((Math.pow(this.res, 2)) - x - x2);
        if (x3>=0) {
            x3 = x3 % p;    
        }
        else{
            x3 = p + x3;
        }
        System.out.println(x3);
        return x3;
    }

    public double getY(double x, double y){
        //y3 = (this.res*(x - x3) - y) % p;

        y3 = ((this.res*(x - x3)) - y);
        if (y3>=0) {
            y3 = y3 % p;    
        }
        else{
            y3 = p + y3;
        }
        System.out.println(y3);
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
