import java.util.Scanner;

public class Mang10 {
    public static void main(String[] args) {
        int n;

        System.out.print("nhap so cho n: ");
        Scanner Son = new Scanner(System.in);
            n = Son.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("phan tu thu " + i + ":");
            arr[i] = Son.nextInt();
        }

        int lasonguyento = 1;

        for (int i = 2; i < arr[0]; i++) {
            if (arr[0] % i == 0) {
                lasonguyento = 0;
            }
        }
        if (lasonguyento == 1) {
            System.out.print(arr[0] + " la so nguyen to");
        }else {
            System.out.print(arr[0] + " Khong la so nguyen to");
        }


    }
}
