package Chuoi;
import java.util.Scanner;

public class Bai21 {
    public static void main(String[] args) {
        String s;
        String kq = "";

        Scanner taochuoi = new Scanner(System.in);
        System.out.print("nhap chuoi cho s: ");
            s = taochuoi.nextLine();
        
        for (int i = s.length()-1; i >= 0 ; i--) {
            kq = kq + s.charAt(i);
        }

        System.out.print(kq);
    }
}
