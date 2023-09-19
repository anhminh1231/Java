import java.util.Scanner;

public class Mang8 {
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
            int max = arr[i];
            int vitrimax = i;
            
            for (int x = i; x < n; x++) {
                if (arr[x] > max ) {
                    max = arr[x];
                    vitrimax = x;
                }
            }

            int tam = arr[i];
            arr[i] = arr[vitrimax];
            arr[vitrimax] = tam;

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        

    }
}
