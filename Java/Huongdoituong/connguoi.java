package Huongdoituong;

import java.util.Scanner;

public class connguoi {

    public static void main(String[] args) {

        class Cn {
            double chieucao;
            double cannang;

        public Cn(double d, double e) {
            chieucao = d;
            cannang = e;
        }

        public double BMI() {
            return cannang / (chieucao*chieucao);
        }

        }
        Cn bi = new Cn(1.0,2.0);

        Scanner input = new Scanner(System.in);
        System.out.print("Nhap chieu cao cua ban: ");
            bi.chieucao = input.nextDouble();

        System.out.print("Nhap can nang cua ban: ");
            bi.cannang = input.nextDouble();

        System.out.print("chi so BMI la: " + bi.BMI());

    }
}
