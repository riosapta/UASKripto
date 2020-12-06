import java.util.Scanner;

public class tes {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tes = sc.nextInt();
        int p = sc.nextInt();
        int res = 0;
        testingcount Testingcount = new testingcount();
        for (int i = 0; i < p; i++){
            res = res + Testingcount.getX(tes, p);
        }
        System.out.println(res);
    }
}

class testingcount {
    int res;
    int x;
    int y;
    public testingcount(){
        this.res = 0;
        this.x = 0;
        this.y = 0;
    }

    public int getX(int x, int y){
        this.x = this.x + x;
        this.y = this.y + y;
        return x;
    }

}