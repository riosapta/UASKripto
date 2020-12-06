import java.lang.Math; 

public class key {
    int p;
    double b = 6;
    double x[];
    double y2[];
    // double qr[];
    double km[];
    double kg[];
    double y[][];
    int yint[][];

    public key(int p){
        this.p = p;
        this.x = new double[p];
        this.y2 = new double[p];
        // this.qr = new double[p];
        this.km = new double[p-1];
        this.y = new double[p][2];
    }

    public void run(){
        setx();
        showx();
        System.out.println("=================================");
        sety2();
        showy2();
        // System.out.println("=================================");
        // setQR();
        // showQR();
        System.out.println("=================================");
        setKM();
        showKM();
        System.out.println("=================================");
        sety();
        showy();
        System.out.println("=================================");
        System.out.println("Available Key Generator : ");      
        convert();  
        result();
    }
    
    private void convert() {
        yint = new int[p][2];
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < 2; j++) {
                yint[i][j] = (int) y[i][j];
            } 
        } 
    }

    private void result() {
        for (int i = 0; i < p; i++) {
            if (y[i][0] != 0 || y[i][1] != 0) {
                System.out.println("- (" + i + "," + yint[i][0] + ") & (" + i + "," + yint[i][1] + ")");
            }
            
        }
    }

    // set y
    private void sety() {
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p-1; j++) {
                if (y2[i]==km[j]) {
                    y[i][0]=j+1;
                    j++;
                    for (; j < p-1; j++) {
                        if (y2[i]==km[j]) {
                            y[i][1]=j+1;
                        }
                    } 
                    break;
                }
            } 
        } 
    }
    //get y
    private void showy() {
        for (int i = 0; i < p; i++) {
            System.out.println("Y(" + i + ") = " + y[i][0] + "," + y[i][1]);
        }
    }


    // set Kuadrat Mod P
    private void setKM() {
        for (int i = 0; i < p-1; i++) {
            km[i]=Math.pow(i+1, 2) % p;
        }
    }
    //get Kuadrat Mod P
    private void showKM() {
        for (int i = 0; i < p-1; i++) {
            System.out.println("KM(" + i + ") = " + km[i]);
        }
    }

    // // setQR
    // private void setQR() {
    //     for (int i = 0; i < p; i++) {
    //         qr[i]=Math.pow(y2[i], (p-1)/2) % p;
    //     }
    // }
    // //getQR
    // private void showQR() {
    //     for (int i = 0; i < p; i++) {
    //         System.out.println("QR(" + i + ") = " + qr[i]);
    //     }
    // }


    // set X
    public void setx() {
        for (int i = 0; i < p; i++) {
            x[i]=i;
        }
    }
    //get x
    private void showx() {
        for (int i = 0; i < p; i++) {
            System.out.println("x(" + i + ") = " + x[i]);
        }
    }
    //set y2
    private void sety2() {
        for (int i = 0; i < p; i++) {
            y2[i]=(Math.pow(x[i], 3)+x[i]+b) % p;
        }
    }
    //get y2
    private void showy2() {
        for (int i = 0; i < p; i++) {
            System.out.println("y2(" + i + ") = " + y2[i]);
        }
    }



}
