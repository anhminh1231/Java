package Ham;

import java.util.Scanner;

public class Ham2 {
    public static int Tinhtong(int x, int y) {
        int tong = x + y;



        return tong;
    } 
    public static void main(String[] args) {
        int n;
        int m;

        System.out.print("Nhap cho n: ");
        Scanner Son = new Scanner(System.in);
            n = Son.nextInt();
            m = Son.nextInt();

        System.out.println(Tinhtong(n, m));
    }
}
