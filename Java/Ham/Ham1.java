package Ham;

// Đề, viết hàm tính xem một số nguyên là số lẻ hay chẳn

import java.util.Scanner;

public class Ham1 {
    // Cach 1
    public static int Tinhchanle(int x) {
        int chanle = 0;

        if (x % 2 == 0) {
            chanle = 0;
        }
        else {
            chanle = 1;
        }
        
        return chanle;
    }
    // Cach 2
    public static int Tinhchanle1(int x) {
        return x % 2;
    }

    //Cach 3
    public static String  Tinhchanle_chuoi(int x) {
        String  chanle = "";

        if (x % 2 == 0) {
            chanle = "Chan";
        }
        else {
            chanle = "Le";
        }
        
        return chanle;
    }
    
    // Cach 4
    public static String  Tinhchanle_chuoi1(int x) {
        
        if (x % 2 == 0) {
            return "Chan";
        }
        else {
            return "Le";
        }
        
    }
    public static void main(String[] args) {
        int n;

        System.out.print("Nhap cho n: ");
        Scanner Son = new Scanner(System.in);
            n = Son.nextInt();
        
        System.out.println(Tinhchanle1(n)); 
        System.out.println(Tinhchanle1(6));
        System.out.println(Tinhchanle1(9));
        System.out.println(Tinhchanle1(15));
           

    }
}
