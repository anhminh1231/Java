import java.util.Scanner;

public class Mang10 {

    public static int SoNguyenTo (int x) {

        int lasonguyento = 1;

        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                lasonguyento = 0;
            }
        }

        return lasonguyento;
    }

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

        for (int b = 0; b < n; b++) {
            
            if (SoNguyenTo(arr[b]) == 1) {
                System.out.println(arr[b] + " la so nguyen to");
            }else {
                System.out.println(arr[b] + " Khong la so nguyen to");
            }

        }


    }
}
