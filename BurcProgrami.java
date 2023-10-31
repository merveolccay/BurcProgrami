package java101;

import java.util.Scanner;

public class BurcProgrami {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int ay,gun;
        System.out.println("Doğduğunuz ayı giriniz: ");
        ay = scn.nextInt();
        System.out.println("Doğduğunuz günü giriniz: ");
        gun = scn.nextInt();

        if(ay==1){
            if(gun>=1 && gun<31){
                if(gun<22){
                    System.out.println("OĞLAK burcusunuz.");
                }else {
                    System.out.println("KOVA burcusunuz.");
                }
            }else{
                System.out.println("Yanlış değer girdiniz.");
            }
        }else if(ay == 2){
            if(gun>=1 && gun<28){
                if(gun<20){
                    System.out.println("KOVA burcusunuz.");
                }else{
                    System.out.println("BALIK burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 3){
            if(gun>=1 && gun<31){
                if(gun<21) {
                    System.out.println("BALIK burcusunuz.");
                }else{
                    System.out.println("KOÇ burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 4){
            if(gun>=1 && gun<30){
                if(gun<21) {
                    System.out.println("KOÇ burcusunuz.");
                }else{
                    System.out.println("BOĞA burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 5){
            if(gun>=1 && gun<31){
                if(gun<22) {
                    System.out.println("BOĞA burcusunuz.");
                }else{
                    System.out.println("İKİZLER burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 6){
            if(gun>=1 && gun<30){
                if(gun<23) {
                    System.out.println("İKİZLER burcusunuz.");
                }else{
                    System.out.println("YENGEÇ burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 7){
            if(gun>=1 && gun<31){
                if(gun<23) {
                    System.out.println("YENGEÇ burcusunuz.");
                }else{
                    System.out.println("ASLAN burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 8){
            if(gun>=1 && gun<30){
                if(gun<24) {
                    System.out.println("ASLAN burcusunuz.");
                }else{
                    System.out.println("BAŞAK burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 9){
            if(gun>=1 && gun<31){
                if(gun<24) {
                    System.out.println("BAŞAK burcusunuz.");
                }else{
                    System.out.println("TERAZİ burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 10){
            if(gun>=1 && gun<30){
                if(gun<24) {
                    System.out.println("TERAZİ burcusunuz.");
                }else{
                    System.out.println("AKREP burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 11){
            if(gun>=1 && gun<31){
                if(gun<22) {
                    System.out.println("AKREP burcusunuz.");
                }else{
                    System.out.println("YAY burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else if(ay == 12){
            if(gun>=1 && gun<30){
                if(gun<23) {
                    System.out.println("YAY burcusunuz.");
                }else{
                    System.out.println("OĞLAK burcusunuz.");
                }
            }else{
                System.out.println("Yalnış değer girdiniz.");
            }
        }else{
            System.out.println("Yanlış değer girdiniz.");
        }
    }
}
