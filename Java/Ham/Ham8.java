// Nhập vào mảng có n phần tử chuỗi
// mỗi chuỗi là 1 tên người
// Nhập vào tên một người
// Tìm tất cả các phần tử trong mảng, ai có cùng tên thì nhập vào thì xuất ra màn hình
// ví dụ: nhập tên Nam
// thì Nguyễn Thành Nam sẽ được xuất ra màn hình
// Nguyễn Nam Anh thì không xuất


package Ham;

import java.util.Scanner;

public class Ham8 {
    public static String Layten(String x) {
        //nguyen anh minh
        if (x.equals("")) {
            return "";
        }

        int position = 0;
        String str;

        for (int a = x.length()-1; a > 0; a--) {
            if (x.charAt(a) == 32) {
                position = a;
                break;
            }
        }
        
        str = x.substring(position + 1);
        
        return str;
    }

    public static void main(String[] args) {
        int n;
        String Ten = "";
        

        Scanner Input = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
            n = Input.nextInt();

        String[] arr = new String[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhap chuoi " + i + " : ");
            arr[i] = Input.nextLine();
        }

        System.out.print("Nhap Ten: ");
            Ten = Input.nextLine();


        for (int i = 0; i < n; i++) {
            if (Ten.equals(Layten(arr[i]))) {
                System.out.println("phan tu thu " + i + " " + arr[i]);
            }
        }
        
        
    } 
}
