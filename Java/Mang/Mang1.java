import java.util.Scanner;

public class Mang1 {
    public static void main(String[] args) {
        int n;

        System.out.println("Nhap So cho n: ");
        Scanner Son = new Scanner(System.in);
            n = Son.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap phan tu thu " + i + ":");
            arr[i] = Son.nextInt();
        }

        int max = arr[0];

        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        System.out.print("So lon nhat la: " + max);
        System.out.print("xong");

    }
}
