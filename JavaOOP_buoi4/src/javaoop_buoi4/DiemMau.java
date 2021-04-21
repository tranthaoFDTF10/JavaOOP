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
public class DiemMau extends Diem { //thua ke 
    //DiemMau se co cac thuoc tinh cua Diem
    private String mau;
    
    public DiemMau(){
        super(); //tham chieu toi phuong thuc xay cua Diem
        mau = new String();
    }
    public DiemMau(int x, int y, String mau){ //ham xay dung co tham so
        super(x,y);
        this.mau=mau;
    }
    public DiemMau(DiemMau m){ //ham xay dung sao chep
        super(m);
        mau = new String(m.mau);
    }
    public void ganMau(String mau){ //ham setter
        this.mau=mau;
    }
    public void gan(int x1, int y1, String m){
        super.gan(x1, y1);
        mau = new String(m);
    }
    @Override
    public void nhapDiem(){
        super.nhapDiem(); //goi lai ham nhap Diem ben lop Diem
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        mau = sc.nextLine();
    }
    @Override
    public void hienThi(){
        super.hienThi(); //goi lai ham nhap hienThi ben lop Diem
        System.out.print(", "+mau);
        
    }
    @Override
    public String toString(){
        return super.toString() + ", mau: "+mau+"\n"; 
    }
}
