import java.util.Scanner;

public class test{
    public static void main(String args[]){
        // Lambda lambda = new Lambda(1,1);
        //Lambda lambda = new Lambda();

        //System.out.println("res :" + lambda.count(28,27,1,29));

        double x3 = -30;
        double p = 29;
        
        //x3 = ((Math.pow(2, 2)) - x - x2);
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

        // key Key = new key(29);
        // Key.run();

        // System.out.println("p :" + Key.get());
        /*
        isSame = true -> lambda(x,y)
        isSame = false -> lambdaNS(x,y,x2,y2);
        */

        /*
        Y1 = qa
        Y2 = (p1, p2) + q(ra)
        */

        /*
        (p1, p2) = y2 - r(y1)
        */
    }
}