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
public abstract class ConVat {
    private String giong;
    private String mauLong;
    private double canNang;
    
    public ConVat(){
        giong = new String();
        mauLong = new String();
        canNang = 0;
    }
    public ConVat(ConVat c){
        giong = new String(c.giong);
        mauLong = new String(c.mauLong);
        canNang = c.canNang;
    }
    public abstract void keu();
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap giong cua dong vat: ");
        giong = sc.nextLine();
        System.out.print("Nhap mau long: ");
        mauLong = sc.nextLine();
        System.out.print("Nhap can nang: ");
        canNang = sc.nextDouble();
    }
    public void in(){
        System.out.println("Giong: "+giong);
        System.out.println("Mau long: "+mauLong);
        System.out.println("Can nang: "+canNang);
    }
    @Override
    public String toString(){
        String t="";
        t+="Giong: "+giong+"\n";
        t+="Mau long: "+mauLong+"\n";
        t+="Can nang: "+canNang+"\n";
        return t;
    }
}
class Bo extends ConVat{
    @Override
    public void keu(){
        System.out.println("Bo keu");
    }
}
class Heo extends ConVat{
    @Override
    public void keu(){
        System.out.println("Heo keu");
    }
}
class De extends ConVat{
    @Override
    public void keu(){
        System.out.println("De keu");
    }
}
