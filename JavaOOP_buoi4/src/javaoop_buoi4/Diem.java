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
import java.util.Scanner;
public class Diem {
    private int x;
    private int y;
    public Diem(){
        
    }
    public Diem(int x, int y){
        this.x=x;
        this.y=y;
    }

    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhap diem x = ");
        x= sc.nextInt();
        System.out.print("\nNhap diem y = ");
        y=sc.nextInt();
    }
    public void hienThi(){
        System.out.print("\n("+x+","+y+")");
    }
    public void doiDiem(int dx, int dy){
        x+=dx;
        y+=dy;
    }
    public int giaTriX(){
        return x;
    }
    public int giaTriY(){
        return y;
    }
    public double khoangcach(){
        double d;
        d=Math.sqrt(Math.pow(x-0, 2)+Math.pow(y-0, 2));
        return d;
    }
    public double khoangcach(Diem d){
        double kq;
        kq=Math.sqrt(Math.pow(x-d.x, 2)+Math.pow(y-d.y, 2));
        return kq;
    }
}
