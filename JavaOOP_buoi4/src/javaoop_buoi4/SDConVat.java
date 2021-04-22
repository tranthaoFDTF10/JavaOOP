/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop_buoi4;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class SDConVat {
    public static void main(String[] args){
        ConVat d;
        d = new Bo();
        d.keu();
        System.out.println();
        
        //Tao danh sach cac con vat
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong dong vat: ");
        int n = sc.nextInt();
        ConVat ds[] = new ConVat[n];
        int c; //nhap lua chon
        System.out.println("1. Nhap thong tin cua Bo.");
        System.out.println("2. Nhap thong tin cua Cho.");
        System.out.println("3. Nhap thong tin cua Heo.");
        for(int i=0;i<n;i++){
            System.out.print("=> Ban muon nhap thong tin dong vat nao? Hay nhap so tuong ung: ");
            c = sc.nextInt();
            switch(c){
                case 1:
                    ds[i] = new Bo();
                    ds[i].nhap();
                    break;
                case 2:
                    ds[i] = new De();
                    ds[i].nhap();
                    break;
                case 3: 
                    ds[i] = new Heo();
                    ds[i].nhap();
                    break;
                default:
                    System.out.println("Khong phu hop. Thoat chuong trinh!!!");
                    break;
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.println("Thong tin con vat thu "+(i+1)+" la: ");
            ds[i].in();
            ds[i].keu();
        }
    }
}
