/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class SinhVien {
    private String mssv;
    private String HoTen;
    private Date NgaySinh;
    private int soHP;
    private ArrayList<String> tenHocPhan;
    private ArrayList<String> diemHocPhan;
    public SinhVien(){
        mssv = new String();
        HoTen = new String();
        NgaySinh = new Date();
        soHP = 0;
        tenHocPhan = new ArrayList<String>();
        diemHocPhan = new ArrayList<String>();
    }
    public SinhVien(String ms, String ht, Date ns, int sohp, String[] tenhp,String[] diemhp){
        mssv = ms;
        HoTen=ht;
        NgaySinh = new Date(ns.getNgay(), ns.getThang(),ns.getNam());
        soHP = sohp;
        tenHocPhan = new ArrayList<String>();
        diemHocPhan = new ArrayList<String>();
        for(int i=0;i<soHP;i++){
            tenHocPhan.add(tenhp[i]);
            diemHocPhan.add(diemhp[i]);
        }
    }

    public String getHoTen() {
        return HoTen;
    }

    public int getSoHP() {
        return soHP;
    }

    public ArrayList<String> getTenHocPhan() {
        return tenHocPhan;
    }

    public ArrayList<String> getDiemHocPhan() {
        return diemHocPhan;
    }
    
    @Override
    public String toString(){
        String t = "";
        t+="+ MSSV: "+mssv+"\n";
        t+="+ Ho ten: "+HoTen+"\n";
        t+="+ Ngay sinh: "+NgaySinh.getNgay()+"/"+NgaySinh.getThang()+"/"+NgaySinh.getNam()+"\n";
        t+="+ So hoc phan: "+soHP+"\n";
        t+="+ Diem cac hoc phan: "+"\n";
        for(int i =0;i<soHP;i++){
            t+=tenHocPhan.get(i)+": "+diemHocPhan.get(i)+"\n";
            //dung ham get 
        }
        
        return t;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap MSSV: ");
        mssv = sc.nextLine();
        System.out.print("Nhap Ho Ten: ");
        HoTen = sc.nextLine();
        System.out.print("Nhap ngay sinh: ");
        NgaySinh.nhap();
    }
    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so hoc phan: ");
        soHP = sc.nextInt();
        sc.nextLine(); //giai phong bo nho dem
        for(int i =0;i<soHP;i++){
            String tenhp,diemhp;
            System.out.print("Nhap vao ten hoc phan thu "+(i+1)+": ");
            tenhp = sc.nextLine();
            
            System.out.print("Nhap vao diem hoc phan thu "+(i+1)+": ");
            diemhp = sc.nextLine();
    
            tenHocPhan.add(tenhp);
            diemHocPhan.add(diemhp);
        }
    }
    public double diemTB(){
        double tongdiem=0;
        for(int i=0;i<soHP;i++){
            switch(diemHocPhan.get(i)){
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
        return tongdiem/soHP;
    
    }
    public void themHocPhan(){
        Scanner sc = new Scanner(System.in);
        String tenhp,diemhp;
        System.out.print("Nhap ten hoc phan can them: ");
        tenhp = sc.nextLine();
        System.out.print("Nhap diem hoc phan can them: ");
        diemhp = sc.nextLine();
        tenHocPhan.add(tenhp);
        diemHocPhan.add(diemhp);
        soHP++;
    }
    public void xoaHocPhan(){
        Scanner sc = new Scanner(System.in);
        String tenhp;
        System.out.print("Nhap ten hoc phan can xoa: ");
        tenhp = sc.nextLine();
        for(int i=0;i<soHP;i++){
            if(tenHocPhan.get(i).equals(tenhp)){
                tenHocPhan.remove(i);
                diemHocPhan.remove(i);
                soHP--;
            }
        }
    }
}
