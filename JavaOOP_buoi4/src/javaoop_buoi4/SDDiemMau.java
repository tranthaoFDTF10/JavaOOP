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
public class SDDiemMau {
    public static void main(String[] args){
        DiemMau A = new DiemMau(5, 10, "Trang");
        System.out.print("Diem mau A la: ");
        A.hienThi();
        System.out.println();
        
        DiemMau B = new DiemMau();
        B.nhapDiem();
        B.doiDiem(10, 8);
        B.ganMau("vang");
        System.out.print("Diem mau B la: "+B.toString());
        //B.hienThi();
        
        System.out.println("Khoang cach diem B den truc hoanh la: "+B.khoangcach());
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong diem: ");
        int n = sc.nextInt();
        Diem ds[] = new Diem[n]; // tao ra mang co n tham chieu toi lop Diem
        for(int i=0;i<n;i++){
            System.out.println("1. Nhap diem.");
            System.out.println("2. Nhap diem mau.");
            System.out.print("=> Ban muon nhap diem nao? Hay nhap so tuong ung: ");
            int c = sc.nextInt();
            System.out.println("Nhap diem thu "+(i+1)+": ");
            if(c==1){
                ds[i] = new Diem();
                ds[i].nhapDiem();
            }
            if(c==2){
                ds[i] = new DiemMau();
                ds[i].nhapDiem();
            }
            
        }
        for(int i=0;i<n;i++){
            System.out.println("Thong tin diem thu "+(i+1)+": "+ds[i].toString());
        }
        
    }
}
