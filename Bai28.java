import java.util.Scanner;

public class Bai28 {
    public static void main(String[] args) {
        String s;
        String kq = "";
        int count = 0;

        Scanner taochuoi = new Scanner(System.in);
        System.out.print("nhập chuoi cho s: ");
            s = taochuoi.nextLine();

        for (int i = 0; i < s.length(); i++) {
            kq = s.charAt(i) + kq;
            count++;
        }
        
        System.out.println(kq);
        System.out.println("tong so ky tu là:" + count);
    }
}
