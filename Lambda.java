import java.lang.Math; 
public class Lambda {
    double res;
    public Lambda(){
        this.res = 0;
    }

    public double count(double x, double y, double a){
        this.res = ((Math.pow(x, 3)) + a)/(2 * y);
        return res;
    }

}
