import java.util.Scanner;

public class Mang5 {
    public static void main(String[] args) {
        int n;
        int count = 0;

        System.out.print("Nhap so cho n: ");
        Scanner Son = new Scanner(System.in);
            n = Son.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhap so thu " + i + ":");
            arr[i] = Son.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        System.out.print(count);
    }
}
