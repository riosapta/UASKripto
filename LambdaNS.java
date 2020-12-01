public class LambdaNS {
    double res;

    public LambdaNS(){
        this.res=0;
    }
    
    public double cnt(double x, double y, double x2, double y2){
        res = (y2 - y) / (x2 - x);
        return res;
    }
}
