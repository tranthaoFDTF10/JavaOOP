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
public class SinhVienCNTT extends SinhVien{
    private String taikhoan;
    private String matkhau;
    private String email;
    
    public SinhVienCNTT(){ 
        //Do SinhVienCNTT ke thua SinhVien nen co tat ca thuoc tinh cua SinhVien
        super();
        taikhoan = new String();
        matkhau = new String();
        email = new String();
    }
    public SinhVienCNTT(String ms, String ht, Date ns, int sohp, String[] tenhp,String[] diemhp,String taikhoan, String matkhau,String email){
        super(ms,ht,ns,sohp,tenhp,diemhp);
        //goi lai ham xay dung cua lop sinh vien
        this.taikhoan=taikhoan;
        this.matkhau=matkhau;
        this.email=email;
    }
    @Override
    public void nhapThongTin(){
        super.nhapThongTin(); //goi lai ham nhap thong tin ben lop SinhVien
        super.nhapDiem();//goi lai ham nhap thong tin diem ben lop SinhVien
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao tai khoan: ");
        taikhoan = sc.nextLine();
        System.out.print("Nhap vao mat khau: ");
        matkhau = sc.nextLine();
        System.out.print("Nhap vao email: ");
        email = sc.nextLine();
        
    }
    @Override
    public String toString(){
        String sv;
        sv=super.toString();
        sv+="+ Tai khoan: "+taikhoan +"\n";
        sv+="+ Mat khau: "+matkhau +"\n";
        sv+="+ Email: "+email+"\n";
        return sv;
    }
    public void doiMatKhau(String newpass){
        this.matkhau=newpass;
    }
    public String getEmail(){
        return email;
    }
    public String hienThiKQHT(){
        String kq="";
        kq+="+ Tai khoan: "+taikhoan+"\n";
        kq+="+ Diem cac hoc phan: "+"\n";
        for(int i =0;i<getSoHP();i++){
            kq+=getTenHocPhan().get(i)+": "+getDiemHocPhan().get(i)+"\n";
            //dung ham get 
        }
        return kq;
    }
}
