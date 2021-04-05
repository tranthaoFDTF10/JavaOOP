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
public class SDDoanThang {
    public static void main(String[] args){
        Diem A = new Diem(2,5);
        Diem B = new Diem(20,35);
        DoanThang AB = new DoanThang(A,B);
        AB.TinhTien(5, 3);
        AB.hienThi();
        
        DoanThang CD = new DoanThang();
        CD.nhapDoanThang();
        System.out.println("Do dai doan thang CD la: "+CD.tinhDoDai());
        System.out.println("Goc giua CD va truc hoanh Ox la: "+CD.tinhGoc());
        System.out.println("Goc giua CD va truc hoanh Ox la: "+CD.tinhDo());
    }
}
