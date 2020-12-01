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
        
        lambda.count(x, y, a, p);
        double x3 = lambda.getX(x, x);
        double y3 = lambda.getY(x, y);

        lambdaNS.count(x3, y3, x, y, p);
        double xRes = lambdaNS.getX(x3, x);;
        double yRes = lambdaNS.getY(x3, y3);

        double xTemp = 0;
        double yTemp = 0;
        for(double i = 0; i < q - 2; i++){
            lambdaNS.count(xRes, yRes, x, y, p);
            xTemp = lambdaNS.getX(xRes, x);
            yTemp = lambdaNS.getY(yRes, y3);
        }
        System.out.println("y1 = (" + xTemp + ", " + yTemp + ")");

        /*
        (p1, p2) = y2 - r(y1)
        */
    }
}