import java.util.Scanner;

public class Bai23 {
    public static void main(String[] args) {
        String s;
        String kq = "";
        char inhoa = 'a';

        Scanner taochuoi = new Scanner(System.in);
        System.out.print("nhap chuoi cho s: ");
            s = taochuoi.nextLine();

        //kq = s.toUpperCase();

        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 97) && (s.charAt(i) <= 122)) {
                inhoa = (char) (s.charAt(i) - 32);
                kq = kq + inhoa;
            }
            else {
                kq = kq + s.charAt(i);
            }
            
        }
        System.out.print(kq);
    }
}
