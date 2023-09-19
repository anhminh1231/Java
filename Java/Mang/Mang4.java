import java.util.Scanner;

public class Mang4 {
    public static void main(String[] args) {
        int n;
        int count = 0;

        System.out.print("Nhap chuoi n: ");
        Scanner Input = new Scanner(System.in);
            n = Input.nextInt();

        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap chuoi " + i + " : ");
            arr[i] = Input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i].length() > 5) {
                count++;
            }
        }

        System.out.print(count);
    }
}
