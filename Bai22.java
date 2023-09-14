import java.util.Scanner;

public class Bai22 {
    public static void main(String[] args) {
        String s;
        String kq = "";

        Scanner taochuoi = new Scanner(System.in);
        System.out.print("nhap chuoi cho s: ");
            s = taochuoi.nextLine();

        // for (int i = 0; i < s.length(); i++) {
        //     kq = kq + " " + s.charAt(i);
        // }
        
        for (int i = s.length()-1; i >= 0; i--) {
            kq =  s.charAt(i)  + " " + kq ;
        }


        System.out.print(kq);
    }
}
