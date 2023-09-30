// Cho một mảng chố nguyên có n phần tử
// và nhập vào số nguyên k
// Viết hàm kiểm tra xem số nào lớn hơn k
// và xuất ra màn hình những số đó
// những số nào nhỏ hơn k thì thay bằng 0
// xuất lại toàn bộ mảng
// ra màn hình

package Ham;

import java.util.Scanner;

public class Ham6 {
    
    
    public static void main(String[] args) {
        int n;
        int k;

        Scanner taomang = new Scanner(System.in);
        System.out.print("Nhap mang cho n: ");
            n = taomang.nextInt();
        System.out.print("Nhap so cho k: ");
            k = taomang.nextInt();


        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Nhap so thu " + i + " : ");
            arr[i] = taomang.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (arr[i] < k) {
                arr[i] = 0;
            }
            System.out.print(arr[i] + " ");
        }
        
    }
}
