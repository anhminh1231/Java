package Ham;

import java.util.Scanner;

public class Ham4 {
    public static String Tinhboiso(int x, int y) {
        

        if (x % y == 0) {
            return  "la boi";
        }
        else {
            return "khong phai boi";
        }


        
    }
    public static void main(String[] args) {
        int n;
        int m;

        Scanner Son = new Scanner(System.in);
        System.out.print("Nhap cho n: ");
            n = Son.nextInt();
        System.out.print("Nhap cho m: ");
            m = Son.nextInt();

        System.out.println(Tinhboiso(n, m));
    }
}
