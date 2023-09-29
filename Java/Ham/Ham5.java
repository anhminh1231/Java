package Ham;

import java.util.Scanner;

public class Ham5 {
    public static int Kiemtra(int d,int m,int y) {
        int ngaythangnam = 1;

        if (y < 0) {
            ngaythangnam = 0;
        }
        
        if (m > 12 || m < 1) {
            ngaythangnam = 0;
        }
        
        switch (m) {
            case 1:
                if (d > 31 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 2:
                
                if (((y % 4 == 0) && 
                    !(y % 100 == 0))
                    || (y % 400 == 0)) {
                        if (d > 29 || d < 1) {
                            ngaythangnam = 0;
                        }

                }
                else {
                    if (d > 28 || d < 1) {
                        ngaythangnam = 0;
                    }
                }
                break;

            case 3:
                if (d > 31 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 4:
                if (d > 30 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 5:
                if (d > 31 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 6:
                if (d > 30 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 7:
                if (d > 31 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 8:
                if (d > 31 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 9:
                if (d > 30 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 10:
                if (d > 31 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 11:
                if (d > 30 || d < 1) {
                    ngaythangnam = 0;
                }
                break;
            case 12:
                if (d > 31 || d < 1) {
                    ngaythangnam = 0;
                }
                break;    
        }


        return ngaythangnam;
    }
    public static void main(String[] args) {
        int ngay;
        int thang;
        int nam;

        Scanner taochuoi = new Scanner(System.in);
        System.out.print("Nhap ngay: ");
            ngay = taochuoi.nextInt();
        System.out.print("Nhap thang: ");
            thang = taochuoi.nextInt();
        System.out.print("Nhap nam: ");
            nam = taochuoi.nextInt();

        System.out.print(Kiemtra(ngay, thang, nam));
    }
}
