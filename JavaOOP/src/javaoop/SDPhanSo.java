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
public class SDPhanSo {
    public static void main(String[] args){
        PhanSo a = new PhanSo(3,7);
        System.out.print("Phan so a la: ");
        a.hienthi();
        PhanSo b = new PhanSo(4,9);
        System.out.print("\nPhan so b la: ");
        b.hienthi();
        PhanSo x = new PhanSo();
        PhanSo y = new PhanSo();
        System.out.print("\n");
        System.out.println("Nhap x: ");
        x.nhapPhanSo();
        System.out.println("Nhap y: ");
        y.nhapPhanSo();
        System.out.print("Gia tri nghich dao cua x la: ");
        x.giatriNghichdao().hienthi();
        System.out.print("\n X + Y = ");
        x.cong(y).hienthi();
        
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("\nNhap vao n = ");
        n = sc.nextInt();
        PhanSo ps[] = new PhanSo[n];
        for(int i=0;i<n;i++){
            ps[i]=new PhanSo();
        }
        for(int i=0;i<n;i++){
            System.out.print("Nhap phan so thu "+(i+1)+": ");
            ps[i].nhapPhanSo();
        }
        PhanSo sum = new PhanSo(0,1);
        for(int i=0;i<n;i++){
            sum=sum.cong(ps[i]);
        }
        System.out.println("Tong cua sum la: ");
        sum.hienthi();
        
        PhanSo max = ps[0];
        for(int i=1;i<n;i++){
            if(max.giaTriThuc()<ps[i].giaTriThuc()){
                max=ps[i];
            }
        }
        System.out.println("\nGia tri lon nhat cua danh sach phan so la: ");
        max.hienthi();
        
        PhanSo tam;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(ps[i].giaTriThuc()>ps[j].giaTriThuc()){
                    tam=ps[i];
                    ps[i]=ps[j];
                    ps[j]=tam;
                }
            }
        }
        System.out.print("\nPhan so sau khi sap xep la: ");
        for(int i=0;i<ps.length;i++){
            ps[i].hienthi();
            System.out.print(" ");
        }

    }
}
