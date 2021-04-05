/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;
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
        
        SinhVienCNTT[] sv = new SinhVienCNTT[n];
        for(int i=0;i<n;i++){
            sv[i] = new SinhVienCNTT();
        }
        for(int i=0;i<n;i++){
            System.out.println("Nhap vao thong tin sinh vien thu "+(i+1)+": ");
            sv[i].nhapThongTin();
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
            else{
                System.out.println("Khong tim thay sinh vien co email la: "+email);
            }
        }
    }
}
