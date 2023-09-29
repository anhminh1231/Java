// cho 2 chuỗi ký tự
// nếu chuỗi này là con của chuỗi kia, thì trả về 1
// còn không thì trả về 0
//vd: anh và the anh ; min và minh 

package Ham;

import java.util.Scanner;

public class Ham3 {
    public static String taochuoi1(String x, String y) {
        String chuoi = "0";

        for (int a = 0; a < y.length()-x.length(); a++) {
            
            int sosanh = 1;
            for (int b = 0; b < x.length(); b++) {
                if (y.charAt(a+b) != x.charAt(b)) {
                    sosanh = 0;
                } 
            }
            if (sosanh == 1) {
                chuoi = "1";
                break;
            }
        }
        return chuoi;

        
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
