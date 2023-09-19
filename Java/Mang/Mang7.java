import java.util.Scanner;

public class Mang7 {
    public static void main(String[] args) {
        int n;

        System.out.print("Nhap so cho n: ");
        Scanner Son = new Scanner(System.in);
            n = Son.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("nhap so thu " + i + ":");
            arr[i] = Son.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            int vitrimin = i;
            for (int x = i; x < n; x++) {
                if (arr[x] < min ) {
                    min = arr[x];
                    vitrimin = x;
                }
            }

            int tam = arr[i];
            arr[i] = arr[vitrimin];
            arr[vitrimin] = tam;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
    }
}
