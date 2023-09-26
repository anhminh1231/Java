package Ham;

import java.util.Scanner;

public class Ham8 {
   public static void main(String[] args) {
        int n;
        char demn = 'n';
        char dema = 'a';
        char demm = 'm';
        

        Scanner Input = new Scanner(System.in);
        System.out.print("Nhap chuoi n: ");
            n = Input.nextInt();

        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap chuoi " + i + " : ");
            arr[i] = Input.nextLine();
        }

        for (int i = 0; i < n; i++) {
            
                System.out.print(arr[i] + " ");
               
            
                
            
        }
   } 
}
