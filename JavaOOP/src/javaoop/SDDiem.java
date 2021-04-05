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
public class SDDiem {
    public static void main(String[] args){
        Diem A = new Diem(3,4);
        System.out.println("Toa do Diem A la: ");
        A.hienThi();
        Diem B = new Diem();
        System.out.print("Nhap toa do diem B");
        B.nhapDiem();
        System.out.println("Toa do diem B la: ");
        B.hienThi();
        Diem C = new Diem(-B.giaTriX(),-B.giaTriY());
        System.out.println("Toa do diem C la: ");
        C.hienThi();
        double d1 = B.khoangcach();
        System.out.println("Khoang cach tu diem B den tam O la: "+d1);
        double d2 = A.khoangcach(B);
        System.out.println("Khoang cach tu diem A den diem B la: "+d2);
        
        
    }
}
