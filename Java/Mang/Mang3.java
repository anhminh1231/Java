import java.util.Scanner;

public class Mang3 {
    public static void main(String[] args) {
        int n;
        int tong = 0;

        System.out.print("nhap so cho n: ");
        Scanner Son = new Scanner(System.in);
            n = Son.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + i + " : ");
            arr[i] = Son.nextInt();
        }

        for (int i = 0; i < n; i++) {
            tong += arr[i];
        }

        System.out.print(tong);
    }
}
