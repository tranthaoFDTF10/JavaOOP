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
//Noi dung chu yeu: lam quen voi tinh da hinh
//Day la Up casting: Khi bien cua lop cha tham chieu toi doi tuong cua lop con
//(doi tuong cua lop con chuyen kieu du lieu ve lop cha), thi duoc goi la up casting
public class ConVat {
    private String giong;
    private String mauLong;
    private double canNang;

    public void keu(){
        System.out.print("Con vat keu!");
    }
}
class Bo extends ConVat{
    @Override
    public void keu(){
        System.out.print("Bo keu");
    }
}
class Heo extends ConVat{
    @Override
    public void keu(){
        System.out.print("Heo keu");
    }
}
class De extends ConVat{
    @Override
    public void keu(){
        System.out.print("De keu");
    }
}
class main{
    public static void main(String[] args){
        ConVat bo,heo,de; //bien cua lop cha
        bo = new Bo(); //bien cua lop cha tham chieu toi doi tuong cua lop con
        heo = new Heo();//bien cua lop cha tham chieu toi doi tuong cua lop con
        de = new De();//bien cua lop cha tham chieu toi doi tuong cua lop con
        System.out.print("\nBo keu: "); 
        bo.keu();
        //phuong thuc keu cua lop cha da bi ghi de boi phuong thuc keu cua lop con
        System.out.print("\nHeo keu: ");
        heo.keu();
        //phuong thuc keu cua lop cha da bi ghi de boi phuong thuc keu cua lop con
        System.out.print("\nDe keu: ");
        de.keu();
        //phuong thuc keu cua lop cha da bi ghi de boi phuong thuc keu cua lop con
    }
}
