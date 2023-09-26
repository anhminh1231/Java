// viết hàm kiểm tra, một chuỗi nhập vào có phải là chuỗi đối xứng hay không
// chuỗi đối xứng là chuỗi có các ký tự đầu và cuối chuỗi lần lượt đối xứng với nhau
// ví dụ: abccba là chuỗi đối xứng
// hjuhju không phải là chuỗi đối xứng

package Ham;

import java.util.Scanner;

public class Ham7 {
   public static void main(String[] args) {
      String s;
      int count = 0;

      Scanner taochuoi = new Scanner(System.in);
      System.out.print("nhap chuoi cho s: ");
         s = taochuoi.nextLine();

      for (int i = 0; i < s.length() / 2; i++) {
         if (s.charAt(i) != s.charAt(s.length()-i-1)) {
            count++;
         }
      }
      if (count > 0 ) {
         System.out.print("khong phai chuoi doi xung");
      }
      else {
         System.out.print("chuoi doi xung");
      }    

   } 
}
