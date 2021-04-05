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
public class DiemMau extends Diem { //thua ke 
    //DiemMau se co cac thuoc tinh cua Diem
    private String mau;
    
    public DiemMau(){
        super();
        mau=new String();
    }
    public DiemMau(int x, int y, String mau){
        super(x,y); //tham chieu toi phuong thuc xay cua Diem
        this.mau=mau;
    }
    public void ganMau(String mau){ //ham setter
        this.mau=mau;
    }
    //thong bao ghi de
    @Override
    public void nhapDiem(){
        super.nhapDiem(); //goi lai ham nhap Diem ben lop Diem
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap mau: ");
        mau = sc.nextLine();
    }
    @Override
    public void hienThi(){
        super.hienThi();
        System.out.print(", "+mau);
    }
}
