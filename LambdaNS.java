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
        else if(res < -p){
            res = res % p;
            res = p + res;
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
        else if(x3 < -p){
            x3 = x3 % p;
            x3 = p + x3;
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
        else if(y3 < -p){
            y3 = y3 % p;
            y3 = p + y3;
        }
        else{
            y3 = p + y3;
        }
        System.out.println(y3);
        return y3;
    }

    /*public double modInverse(double a, double m) 
    { 
        a = a % m; 
        for (double i = 1; i < m; i++) 
            if ((a * i) % m == 1) 
                return i; 
        return 1; 
    } */

    static double modInverse(double a, double m) 
    { 
        double m0 = m; 
        double s = 0, r = 1; 
  
        if (m == 1) 
            return 0; 
  
        while (a > 1) { 
            // q is quotient 
            double q = a / m; 
  
            double t = m; 
  
            // m is remainder now, process 
            // same as Euclid's algo 
            m = a % m; 
            a = t; 
            t = s; 
  
            // Update x and y 
            s = r - q * s; 
            r = t; 
        } 
  
        // Make x positive 
        if (r < 0) 
            r += m0; 
  
        return r; 
    } 
}
