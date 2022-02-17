import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int C2 = 1618 % 2; //0 - "+"
        System.out.println("C2 = " + C2 + " //o1 - \"+\"");
        final int C3 = 1618 % 3;//1
        System.out.println("C3 = " + C3 + " //C = \"1\"");
        final int C5 = 1618 % 5;//3 - "+"
        System.out.println("C5 = " + C5 + " //o2 - \"+\"");
        final int C7 = 1618 % 7;//5 - "short"
        System.out.println("C7 = " + C7 + " //type - \"short\"");

        final int C = C3;//1
        System.out.println("C = " + C);

        short a, b, n, m;

        System.out.println("Enter a");
        a = scan.nextShort();
        System.out.println("a = " + a);

        System.out.println("Enter n");
        n = scan.nextShort();
        System.out.println("n = " + n);

        System.out.println("Enter b");
        b = scan.nextShort();
        System.out.println("b = " + b);

        System.out.println("Enter m");
        m = scan.nextShort();
        System.out.println("m = " + m);

        if (a > n || b > m){
            System.out.println("Summation is not possible the lower limit is greater than upper limit\nS = 0");
            System.exit(0);
        }

        short S = 0;

        for(short i = a; i <= n; i++){
            for(short j =  b; j <= m; j++){
                S += (i + j)/(i + C);
            }
        }
        System.out.println("S = " + S);
    }
}
