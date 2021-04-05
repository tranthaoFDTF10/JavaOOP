/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class SDDate {
    public static void main(String[] args){
        Date d1 = new Date(12,3,2021); 
        //Tao doi tuong d1 su dung method constructor co tham so
        System.out.println("\nNgay hom nay la: ");
        d1.in();
        Date d2 = new Date();
        //Tao doi tuong d2 su dung method constructor khong tham so
        d2.nhap();
        System.out.println("Ngay sau khi nhap la: ");
        d2.in();
        Scanner sc = new Scanner(System.in);
        d2=d2.ngayHomSau(); // lay bien d2 de don nhan ket qua
        System.out.println("Ngay sau khi cong vao d2 la: ");
        d2.in();
        System.out.print("\nNhap so ngay ban muon cong vao d2: ");
        int a = sc.nextInt();
        d2=d2.congNgay(a);
        d2.in();
        System.out.print("\nNhap so ngay ban muon tao: ");
        int n = sc.nextInt(); // nhap so phan tu cua danh sach
        Date ds[] = new Date[n]; // khoi tao doi tuong mang ds
        for(int i=0;i<ds.length;i++){
            ds[i]=new Date();  // cap phat bo nho cho tung phan tu trong danh sach
        }
        for(int i=0;i<ds.length;i++){
            System.out.print("Nhap ngay thu "+i+": ");
            ds[i].nhap();
        }
        System.out.print("\nTat ca cac ngay ban nhap vao danh sach la: \n");
        for (Date d : ds) {
            d.in();
            System.out.print("\n");
        }
        
        
        
        
    }
}
