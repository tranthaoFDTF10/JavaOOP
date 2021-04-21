/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop_buoi4;

import java.util.Scanner;
/**
 *
 * @author Administrator
 */
public class SDSinhVienCNTT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Tao danh sach sinh vien duoc nhap tu ban phim
        int n;
        System.out.print("Nhap vao so sinh vien: ");
        n = sc.nextInt();
        
        SinhVien sv[] = new SinhVien[n]; //tao ra mang n tham chieu sinh vien 
        for(int i=0;i<n;i++){
            System.out.println("1.Nhap thong tin sinh vien.");
            System.out.println("2.Nhap thong tinh sinh vien CNTT.");
            System.out.print("Ban muon nhap thong tin sinh vien nao? Hay nhap so tuong ung: ");
            int c = sc.nextInt();
            System.out.println("Nhap thong tin sinh vien thu "+(i+1)+": ");
            if(c==1){
                sv[i] = new SinhVien();
                sv[i].nhapTT();
                sv[i].nhapDiem();
            }
            if(c==2){
                sv[i] = new SinhVienCNTT();
                sv[i].nhapTT();
                sv[i].nhapDiem();
                       
            }
        }
        for(int i=0;i<n;i++){
            System.out.println("Thong tin sinh vien thu "+(i+1)+": "+"\n"+sv[i].toString());
        }
        //-Nhap vao mot dia chi email va tim dia chi email do
        sc.nextLine(); //xoa bo nho dem
        String email;
        System.out.print("\nNhap vao email can tim: ");
        email = sc.nextLine();
        for(int i=0;i<n;i++){
            if(sv[i].getEmail().compareTo(email)==0){ //Neu bang tra ve 0
                //Neu dung hien thi ra ket qua hoc tap va tai khoan cua sinh vien 
                System.out.print("Sinh vien co email la "+email+": \n"+sv[i].hienThiKQHT());
                break; //Do dia chi email khong trung nhau nen khi tim thay thi ket thuc duoc roi
            }
        }
    }
}

