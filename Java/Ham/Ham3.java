// cho 2 chuỗi ký tự
// nếu chuỗi này là con của chuỗi kia, thì trả về 1
// còn không thì trả về 0

package Ham;

import java.util.Scanner;

public class Ham3 {
    public static String taochuoi1(String x, String y) {
        String chuoi = "";

        if (y == x) {
            return chuoi = "1";
        }
        else {
            return chuoi = "0";
        }
    }
    public static void main(String[] args) {
        String n;
        String m;

        Scanner taochuoi = new Scanner(System.in);
        System.out.print("Nhap chuoi n: ");
            n = taochuoi.nextLine();
        System.out.print("Nhap chuoi con cua n: ");
            m = taochuoi.nextLine();

        System.out.print(taochuoi1(n, m));
        
    }
}
