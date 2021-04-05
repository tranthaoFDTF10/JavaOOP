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
public class PhanSo {
    private int tu;
    private int mau;
    public PhanSo(){
        tu=1;
        mau=1;
    }
    public PhanSo(int t, int m){
        tu=t;
        mau=m;
    }
    public int giatriTu(){
        return tu;
    }
    public int giatriMau(){
        return mau;
    }
    public void datTu(int tu){
        this.tu=tu;
    }
    public void datMau(int mau){
        this.mau=mau;
    }
    public void Saochep(PhanSo a){
        tu=a.tu;
        mau=a.mau;
    }
    public void nhapPhanSo(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("\nNhap tu so: ");
            tu=sc.nextInt();
            System.out.print("Nhap mau so: ");
            mau=sc.nextInt();
            if(mau==0) System.out.print("Mau so khong hop le");
        }while(mau==0);
    }
    public void hienthi(){
        if(tu==0){
            System.out.print("0");
        }
        else if(mau==1){
            System.out.print(tu);
        }
        else if(mau<0||tu<0){
            System.out.print("-"+tu+"/"+mau);
        }
        else{
            System.out.print(tu+"/"+mau);
        }
    }
    public void nghichDao(){
        int temp;
        temp=tu;
        tu=mau;
        mau=temp;
    }
    public PhanSo giatriNghichdao(){
        PhanSo a = new PhanSo();
        //vd co phan so p=(2,3)
        a.tu=mau; //a.tu=3 
        a.mau=tu; //b.tu=2;
        return a;
    }
    public double giaTriThuc(){
        return (double)tu/mau; //ep kieu do tu va mau deu la kieu int
    }
    public boolean lonHon(PhanSo a){
        double kq=(double)tu/mau;
        return kq>a.giaTriThuc();
        //vd: phanso p1(1,2) phanso p2(3,2)
        //goi ham p1.lonHon(p2) Do p1=0.5 < p2=1.5 nen kq tra ve false
    }
    public PhanSo cong(PhanSo a){ 
        PhanSo kq = new PhanSo();
        kq.mau=this.mau*a.mau; //this la tham chieu toi gia tri hien tai
        kq.tu=this.tu*a.mau+this.mau*a.tu;
        return kq;
    }
    public PhanSo tru(PhanSo a){ 
        PhanSo kq = new PhanSo();
        kq.mau=this.mau*a.mau; //this la tham chieu toi gia tri hien tai
        kq.tu=this.tu*a.mau-this.mau*a.tu;
        return kq;
    }
    public PhanSo nhan(PhanSo a){ 
        PhanSo kq = new PhanSo();
        kq.mau=this.mau*a.mau; //this la tham chieu toi gia tri hien tai
        kq.tu=this.tu*a.tu;
        return kq;
    }
    public PhanSo chia(PhanSo a){ 
        return this.nhan(a.giatriNghichdao());
    }
    public PhanSo cong(int a){
        PhanSo p = new PhanSo(a,1); //Cho so nguyen bien thanh phan so có mau la 1
        return this.cong(p);    //goi lai ham o phia tren dem xuong
    }
    public PhanSo tru(int a){
        PhanSo p = new PhanSo(a,1);
        return this.tru(p);
    }
    public PhanSo nhan(int a){
        PhanSo p = new PhanSo(a,1);
        return this.nhan(p);
    }
    public PhanSo chia(int a){
        PhanSo p = new PhanSo(a,1);
        return this.chia(p);
    }
}
