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
public class SDSinhVien {
    public static void main(String[] args){
        /*SinhVien a = new SinhVien();
        a.nhapThongTin();
        a.themHocPhan();
        System.out.print(a.toString());*/
        
        int n;
        System.out.print("Nhap vao so sinh vien: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        SinhVien []sv = new SinhVien[n]; // tao ra n tham chieu
        for(int i=0;i<n;i++){
            System.out.print("Nhap vao thong tin sinh vien thu "+(i+1)+": ");
            sv[i] = new SinhVien();
            sv[i].nhapThongTin();
            sv[i].nhapDiem();
        }
        
        System.out.println("Danh sach sinh vien bi canh cao hoc vu: ");
        for(int i=0;i<n;i++){
            if(sv[i].diemTB()<0.8){
                System.out.println("+ "+sv[i].getHoTen());
                
            }
        }
        System.out.println("Cac sinh vien co diem TB cao nhat: ");
        double max = Double.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(sv[i].diemTB()>max){
                max=sv[i].diemTB();
                
            }
        }
        for(int i=0;i<n;i++){
            if(sv[i].diemTB()==max){
                System.out.println("+ "+sv[i].getHoTen());
            }
        }
        SinhVien tam;
        //tao ra tham chieu
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(sv[j].getHoTen().compareTo(sv[i].getHoTen())>0){
                    tam = sv[i];
                    sv[i]=sv[j];
                    sv[j]=tam;
                }
            }
        }
        System.out.println("Danh sach sinh vien: ");
        for(int i=0;i<n;i++){
            System.out.println("Sinh vien thu "+(i+1)+": ");
            System.out.print(""+sv[i].toString());
        }
    }
}
