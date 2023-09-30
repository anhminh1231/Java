// viết hàm kiểm tra, một chuỗi nhập vào có phải là chuỗi đối xứng hay không
// chuỗi đối xứng là chuỗi có các ký tự đầu và cuối chuỗi lần lượt đối xứng với nhau
// ví dụ: abccba là chuỗi đối xứng
// hjuhju không phải là chuỗi đối xứng

package Ham;

import java.util.Scanner;

public class Ham7 {

   public static int Doixung(String x) {
      int count = 0;

      for (int i = 0; i < x.length() / 2; i++) {
         if (x.charAt(i) != x.charAt(x.length()-i-1)) {
            count++;
         }
      }
      return count;
      //if  count = 0: doi xung 
      //if count > 0: ko doi xung
      
   }
   public static void main(String[] args) {
      String s;
      

      Scanner taochuoi = new Scanner(System.in);
      System.out.print("nhap chuoi cho s: ");
         s = taochuoi.nextLine();

      if (Doixung(s) == 0) {
         System.out.print("doi xung");
      }
      else {
         System.out.print("khong doi xung");
      }

   } 
}
