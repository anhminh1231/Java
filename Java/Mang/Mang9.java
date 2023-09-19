import java.util.Scanner;

public class Mang9 {
    public static void main(String[] args) {
        int n;
        int count = 0;
        
        System.out.print("Nhap cho chuoi n: ");
        Scanner taochuoi = new Scanner(System.in);
            n = taochuoi.nextInt();
        
        String[] Str = new String[n];    

        String substring = "Minh";

        for (int i = 0; i < n; i++) {
            System.out.print("nhap phan tu thu " + i + ":");
            Str[i] = taochuoi.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (Str[i] == substring) {
                count++;
            }
        }

        System.out.print(count);
    }
}
