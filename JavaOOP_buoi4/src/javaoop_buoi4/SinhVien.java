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
public class SinhVien {
    private String HoTen;
    private String mssv;
    private Date NgaySinh;
    private final int MAX=50;
    private int soluong;
    private String tenhp[];
    private String diemhp[];
    
    public SinhVien(){
        HoTen = new String();
        mssv = new String();
        NgaySinh = new Date();
        soluong = 0;
        tenhp = new String[MAX];
        diemhp = new String[MAX];
    }
   
    public SinhVien(SinhVien sv){
        HoTen = new String(sv.HoTen);
        mssv = new String(sv.mssv);
        NgaySinh = new Date(sv.NgaySinh);
        soluong = sv.soluong;
        tenhp = new String[sv.MAX];
        diemhp = new String[sv.MAX];
        for(int i=0;i<soluong;i++){
            tenhp[i] = new String(sv.tenhp[i]);
            diemhp[i] = new String(sv.diemhp[i]);
        }
    }
    public String getHoTen(){
        return HoTen;
    }
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap mssv: ");
        mssv = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        NgaySinh.nhap();
    }
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap so luong mon hoc: ");
        soluong = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<soluong;i++){
            System.out.print("Nhap ten hoc phan thu "+(i+1)+": ");
            tenhp[i] = sc.nextLine();
            System.out.print("Nhap diem hoc phan thu "+(i+1)+": ");
            diemhp[i] = sc.nextLine();
        }
    }
    @Override
    public String toString(){
        String t="";
        t+="+ MSSV: "+mssv+"\n";
        t+="+ Ho Ten: "+HoTen+"\n";
        t+="+ Ngay sinh: "+NgaySinh+"\n";
        t+="- Diem cac hoc phan: "+"\n";
        for(int i=0;i<soluong;i++){
            t+=tenhp[i]+": "+diemhp[i]+"\n";
        }
        return t;
    }
    public String TTDiem(){
        String t="";
        t+="- Diem cac hoc phan: "+"\n";
        for(int i=0;i<soluong;i++){
            t+=tenhp[i]+": "+diemhp[i]+"\n";
        }
        t+=diemTB();
        return t;
    }
    public double diemTB(){
        double tongdiem=0;
        for(int i=0;i<soluong;i++){
            switch(diemhp[i]){
                case "A":
                    tongdiem+=4;
                    break;
                case "B+":
                    tongdiem+=3.5;
                    break;
                case "B":
                    tongdiem+=3;
                    break;
                case "C+":
                    tongdiem+=2.5;
                    break;
                case "C":
                    tongdiem+=2;
                     break;
                case "D+":
                    tongdiem+=1.5;
                    break;
                case "D":
                    tongdiem+=1;
                    break;
                default:
                    break;
            }
        }
        return tongdiem/soluong;
    }
    public void themHP(){
        Scanner sc = new Scanner(System.in);
        String ten,diem;
        System.out.println("Nhap ten hoc phan can them: ");
        ten = sc.nextLine();
        System.out.print("Nhap diem hoc phan can them: ");
        diem = sc.nextLine();
        if(soluong<MAX){
            tenhp[soluong] = new String(ten);
            diemhp[soluong] = new String(diem);
            soluong++;
        }
        else{
            System.out.println("Khong the them ");
        }
    }
    public void xoaHP(){
        Scanner sc = new Scanner(System.in);
        String ten;
        System.out.println("Nhap ten hoc phan can xoa: ");
        ten = sc.nextLine();
        for(int i=0;i<soluong;i++){
            if(tenhp[i].equals(ten)){
                for(int j=i;j<soluong;j++){
                    tenhp[j]=tenhp[j+1];
                }
                soluong--;
                break;
            }
            
        }
    }
    public String getEmail(){
        return "";
    }
    public String getTaiKhoan(){
        return "";
    }
    public String hienThiKQHT(){
        String kq="";
        kq+="+ Tai khoan: "+"\n";
        kq+=TTDiem();
        return kq;
    }

    void nhapTT_TaiKhoan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

