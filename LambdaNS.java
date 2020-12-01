public class LambdaNS {
    double res;
    double x3;
    double y3;

    public LambdaNS(){
        this.res=0;
    }
    
    public double count(double x, double y, double x2, double y2){
        res = (y2 - y) / (x2 - x);
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
