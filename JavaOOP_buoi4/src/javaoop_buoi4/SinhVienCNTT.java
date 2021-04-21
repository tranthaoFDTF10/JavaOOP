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
public class SinhVienCNTT extends SinhVien{
    private String taikhoan;
    private String matkhau;
    private String email;
    
    public SinhVienCNTT(){
        super();
        taikhoan = new String();
        matkhau = new String();
        email = new String();
    }
    public SinhVienCNTT(SinhVienCNTT s){
        super(s);
        taikhoan = new String(s.taikhoan);
        matkhau = new String(s.matkhau);
        email = new String(s.email);
    }
    @Override
    public void nhapTT(){
        super.nhapTT();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tai khoan: ");
        taikhoan = sc.nextLine();
        System.out.print("Nhap mat khau: ");
        matkhau = sc.nextLine();
        System.out.print("Nhap email: ");
        email = sc.nextLine();
    }
    @Override
    public String toString(){
        String sv;
        sv=super.toString();
        sv+="+ Tai khoan: "+taikhoan+"\n";
        sv+="+ Mat khau: "+matkhau+"\n";
        sv+="+ Email: "+email+"\n";
        return sv;
    }
    public void doiMatKhau(String newpass){
        this.matkhau = newpass;
        
    }
    @Override
    public String getEmail(){
        return email;
    }
    @Override
    public String hienThiKQHT(){
        String kq="";
        kq+="+ Tai khoan: "+taikhoan+"\n";
        kq+=super.TTDiem();
        return kq;
    }
    @Override
    public void nhapDiem(){
        super.nhapDiem();
    }
    
}
