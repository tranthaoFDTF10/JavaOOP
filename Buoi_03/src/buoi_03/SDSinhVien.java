/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_03;

/**
 *
 * @author Administrator
 */
import java.util.Scanner;
public class SDSinhVien {
    public static void main(String[] args){
        SinhVien a = new SinhVien();
        a.nhapTT();
        a.nhapDiem();
        a.themHP("NLHDH","A");
        System.out.print("\nThong tin sinh vien a la: "+a);//a = a.toString();
        
        SinhVien b = new SinhVien(a);
        b.xoaHP();
        System.out.print("\nThong tin sinh vien b la: "+b);//b = b.toString();
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao so luong sinh vien: ");
        n = sc.nextInt();
        SinhVien ds[] = new SinhVien[n];
        for(int i=0;i<n;i++){
            ds[i] = new SinhVien();
            System.out.print("\nNhap thong tin sinh vien thu "+(i+1)+": "+"\n");
            ds[i].nhapTT();
            ds[i].nhapDiem();
        }
        System.out.println("Danh sach sinh vien moi nhap la: ");
        for(int i=0;i<n;i++){
            System.out.print("\nThong tin sinh vien thu "+(i+1)+": "+"\n");
            System.out.print(""+ds[i].toString());
        }
        //Danh sach sinh vien canh cao hoc vu
        System.out.print("\nDanh sach sinh vien bi canh cao hoc vu: "+"\n");
        for(int i=0;i<n;i++){
            if(ds[i].diemTB()<0.8){
                System.out.print("\n"+ds[i].toString());
            }
            else{
                System.out.println("Khong co sinh vien nao bi canh cao hoc vu");
            }
        }
        
        //Danh sach sinh vien co diem TB cao nhat 
        System.out.println("Danh sach sinh vien co diem TB cao nhat: ");
        double max=Double.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(ds[i].diemTB()>max){
                max=ds[i].diemTB();
            }
        }
        for(int i=0;i<n;i++){
            if(ds[i].diemTB()==max){
                System.out.print(""+ds[i].toString());
            }
        }
        
        //Sap xep sinh vien theo ho ten
        SinhVien tam;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(ds[i].getHoTen().compareTo(ds[j].getHoTen())>0){
                    tam=ds[i];
                    ds[i]=ds[j];
                    ds[j]=tam;
                }
            }
        }
        System.out.print("\nDanh sach sinh vien sau khi sap xep la: "+"\n");
        for(int i=0;i<n;i++){
            System.out.println("Sinh vien thu "+(i+1)+": "+ds[i]);
        }
    }
}
