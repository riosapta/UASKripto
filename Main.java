import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        Lambda lambda = new Lambda();
        LambdaNS lambdaNS = new LambdaNS();
        /*
        isSame = true -> lambda(x,y)
        isSame = false -> lambdaNS(x,y,x2,y2);
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan p =   ");
        double p = scanner.nextDouble();
        System.out.print("Masukkan a =   ");
        double a = scanner.nextDouble();
        System.out.print("Masukkan b =   ");
        double b = scanner.nextDouble();
        System.out.print("Masukkan q =   ");
        double q = scanner.nextDouble();
        System.out.print("Masukkan r =   ");
        double r = scanner.nextDouble();
        System.out.println("Masukkan Plaintext");
        System.out.print("P1 = ");
        double P1 = scanner.nextDouble();
        System.out.print("P2 = ");
        double P2 = scanner.nextDouble();
        System.out.println("Masukkan Fungsi Pembangkit");
        System.out.print("x = ");
        double x = scanner.nextDouble();
        System.out.print("y = ");
        double y = scanner.nextDouble();

        /*
        Y1 = qa
        Y2 = (p1, p2) + q(ra)
        */
        
        //////////////////////////////////////////////////////////////////////// buat nyari y1 = qa ///////////////////////////////////////////////////////////////////////////////

        double x3 = 0;
        double y3 = 0;
        double xRes = 0;
        double yRes = 0;
        double xTemp = 0;
        double yTemp = 0;
        
        if(q == 2){
            lambda.count(x, y, a, p);
            x3 = lambda.getX(x, x);
            y3 = lambda.getY(x, y);
            System.out.println("y1 = (" + x3 + ", " + y3 + ")");
        } else if (q > 2) {
            lambda.count(x, y, a, p);
            x3 = lambda.getX(x, x);
            y3 = lambda.getY(x, y);
    
            lambdaNS.count(x3, y3, x, y, p);
            xRes = lambdaNS.getX(x3, x);;
            yRes = lambdaNS.getY(x3, y3);

            for(double i = 0; i < q - 2; i++){
                lambdaNS.count(xRes, yRes, x, y, p);
                xTemp = lambdaNS.getX(xRes, x);
                yTemp = lambdaNS.getY(yRes, y3);
            }

            System.out.println("y1 = (" + xTemp + ", " + yTemp + ")");
        } else {
            System.out.println("Invalid q input.");
        }
        
        //////////////////////////////////////////////////////////////////////// buat nyari ra ///////////////////////////////////////////////////////////////////////////////

        x3 = 0;
        y3 = 0;
        double xRes2 = 0;
        double yRes2 = 0;
        double xTemp2 = 0;
        double yTemp2 = 0;
        System.out.println("debug xRes2 " + xRes2 + yRes2);
        System.out.println("debugA x3 = (" + x3 + ", " + y3 + ")");
        System.out.println("debugB xTemp2 = (" + xTemp2 + ", " + yTemp2 + ")");
        if(r == 2){
            lambda.count(x, y, a, p);
            x3 = lambda.getX(x, x);
            y3 = lambda.getY(x, y);
            System.out.println("ra = (" + x3 + ", " + y3 + ")");
        } else if (r > 2) {
            lambda.count(x, y, a, p);
            x3 = lambda.getX(x, x);
            y3 = lambda.getY(x, y);
    
            lambdaNS.count(x3, y3, x, y, p);
            xRes2 = lambdaNS.getX(x3, x);;
            yRes2 = lambdaNS.getY(x3, y3);

            for(double i = 0; i < q - 2; i++){
                lambdaNS.count(xRes2, yRes2, x, y, p);
                xTemp2 = lambdaNS.getX(xRes2, x);
                yTemp2 = lambdaNS.getY(yRes2, y3);
            }

            System.out.println("ra = (" + xTemp2 + ", " + yTemp2 + ")");
        } else {
            System.out.println("Invalid q input.");
        }

        //////////////////////////////////////////////////////////////////////// buat nyari q(ra) ///////////////////////////////////////////////////////////////////////////////

        x3 = 0;
        y3 = 0;
        double xRes3 = 0;
        double yRes3 = 0;
        double xTemp3 = 0;
        double yTemp3 = 0;
        System.out.println("debug xRes3 " + xRes3 + yRes3);
        System.out.println("debugA x3 = (" + x3 + ", " + y3 + ")");
        System.out.println("debugB xTemp3 = (" + xTemp3 + ", " + yTemp3 + ")");
        System.out.println("debugc xTemp2 = (" + xTemp2 + ", " + yTemp2 + ")");
        if(q == 2){
            lambda.count(xTemp2, yTemp2, a, p);
            x3 = lambda.getX(xTemp2, xTemp2);
            y3 = lambda.getY(xTemp2, yTemp2);
            System.out.println("q(ra) = (" + x3 + ", " + y3 + ")");
        } else if (q > 2) {
            lambda.count(xTemp2, yTemp2, a, p);
            x3 = lambda.getX(xTemp2, xTemp2);
            y3 = lambda.getY(xTemp2, yTemp2);
    
            lambdaNS.count(x3, y3, x, y, p);
            xRes3 = lambdaNS.getX(x3, xTemp2);;
            yRes3 = lambdaNS.getY(x3, y3);

            for(double i = 0; i < q - 2; i++){
                lambdaNS.count(xRes3, yRes3, x, y, p);
                xTemp3 = lambdaNS.getX(xRes3, xTemp2);
                yTemp3 = lambdaNS.getY(yRes3, y3);
            }

            System.out.println("a(ra) = (" + xTemp3 + ", " + yTemp3 + ")");
        } else {
            System.out.println("Invalid q input.");
        }

        //////////////////////////////////////////////////////////////////////// buat nyari y2 ///////////////////////////////////////////////////////////////////////////////

        lambdaNS.count(P1, P2, xTemp3, yTemp3, p);
        xRes = lambdaNS.getX(P1, xTemp3);;
        yRes = lambdaNS.getY(P1, P2);
        System.out.println("a(ra) = (" + xTemp3 + ", " + yTemp3 + ")");

        /*
        (p1, p2) = y2 - r(y1)
        */
    }
}