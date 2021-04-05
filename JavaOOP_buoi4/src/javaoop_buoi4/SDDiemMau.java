/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaoop_buoi4;

/**
 *
 * @author Administrator
 */
public class SDDiemMau {
    public static void main(String[] args){
        DiemMau A = new DiemMau(5, 10, "Trang");
        System.out.print("Diem mau A la: ");
        A.hienThi();
        System.out.println();
        
        DiemMau B = new DiemMau();
        B.nhapDiem();
        B.doiDiem(10, 8);
        B.ganMau("vang");
        System.out.print("Diem mau B la: ");
        B.hienThi();
    }
}