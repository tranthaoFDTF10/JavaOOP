/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_03;

import java.util.Scanner;


/**
 *
 * @author Administrator
 */
public class SinhVien {
    private String HoTen;
    private String mssv;
    private Date ngaySinh;
    private final int MAX=50;//dinh nghia hằng. so mon toi da
    private int soluong;
    private String tenhp[];
    private String diemhp[];

    public SinhVien() {
        HoTen = new String();
        mssv = new String();
        ngaySinh = new Date();
        soluong = 0;
        tenhp = new String[MAX];
        diemhp = new String[MAX];
                
    }
    public SinhVien(SinhVien sv){ //ham sao chep sinh vien
        HoTen = new String(sv.HoTen);
        mssv = new String(sv.mssv);
        ngaySinh = new Date(sv.ngaySinh);
        soluong=sv.soluong;
        tenhp = new String[sv.MAX];
        diemhp = new String[sv.MAX];
        for(int i=0;i<soluong;i++){ //cap phat bo nho cho tung phan tu trong mang
            tenhp[i]= new String(sv.tenhp[i]);
            diemhp[i]= new String(sv.diemhp[i]);
        }
    }

    public String getHoTen() {
        return HoTen;
    }
    
    public void nhapTT(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap MSSV: ");
        mssv = sc.nextLine();
        System.out.print("Nhap ngay thang nam sinh: ");
        ngaySinh.nhap();
    }
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong hoc phan: ");
        soluong = sc.nextInt();
        sc.nextLine();
        for(int i=0;i<soluong;i++){
            System.out.print("Nhap vao ten hoc phan thu "+(i+1)+": ");
            tenhp[i] = sc.nextLine();
            System.out.print("Nhap vao diem hoc phan thu "+(i+1)+": ");
            diemhp[i] = sc.nextLine();
        }
    }
    @Override
    public String toString(){
        String sv="";
        sv+="+ MSSV: "+mssv+"\n";
        sv+="+ Ho Ten: "+HoTen+"\n";
        sv+="+ Nam sinh: "+ngaySinh+"\n";
        sv+="+ Diem cac hoc phan: "+"\n";
        for(int i=0;i<soluong;i++){
            sv+=tenhp[i]+": "+diemhp[i]+"\n";
        }
        return sv;
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
        System.out.print("\nNhap ten hoc phan can them: ");
        ten = sc.nextLine();
        System.out.print("\nNhap diem hoc phan can them: ");
        diem = sc.nextLine();
        if(soluong<MAX){
            tenhp[soluong] = new String(ten);
            diemhp[soluong] =new String(diem);
            soluong++;
        }
        else{
            System.out.println("Khong the them");
        }
    }
    public void themHP(String ten,String diem){
        if(soluong<MAX){
            tenhp[soluong] = new String(ten);
            diemhp[soluong] =new String(diem);
            soluong++;
        }
        else{
            System.out.println("Khong the them");
        }
    }
    public void xoaHP(){
        Scanner sc = new Scanner(System.in);
        String ten;
        System.out.print("\nNhap ten hoc phan can xoa: ");
        ten = sc.nextLine();
        for(int i=0;i<soluong;i++){
            if(tenhp[i].equals(ten)){
                for(int j=i;j<soluong;j++){
                    tenhp[i]=tenhp[i+1];
                }
            }
            soluong--;
            break;
        }
    }
    public void xoaHP(String ten){
        for(int i=0;i<soluong;i++){
            if(tenhp[i].equals(ten)){
                for(int j=i;j<soluong;j++){
                    tenhp[i]=tenhp[i+1];
                }
            }
            soluong--;
            break;
        }
    }
    
    
}
