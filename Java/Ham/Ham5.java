package Ham;

import java.util.Scanner;

public class Ham5 {
    public static int Sosanh(int x,int y,int z) {
        int ngaythangnam = 0;

        if (x > 31) {
            System.out.println(" loi ngay vui long nhap lai");
        }
        else if (x <= 31) {
            System.out.print(x);
        }
        else if (y > 12) {
            System.out.println(" loi thang vui long nhap lai");
        }
        else if (y <= 12) {
            System.out.print(y);
        }
        else if (z > 2023) {
            System.out.println(" loi nam vui long nhap lai");
        }
        else if (z <= 2023) {
            System.out.print(z);
        }

        return ngaythangnam;
    }
    public static void main(String[] args) {
        String n;
        String m;
        String p;

        Scanner taochuoi = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
            n = taochuoi.nextLine();
        System.out.print("Nhap thang: ");
            m = taochuoi.nextLine();
        System.out.print("Nhap nam: ");
            p = taochuoi.nextLine();

        System.out.println(Sosanh(0, 0, 0));
    }
}
