/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_03;

import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class Gach {
    private String maso;
    private String mausac;
    private int soluong;
    private int chieudai; //don vi cm
    private int chieungang; // don vi cm
    private long giaban;
    public Gach(){
        maso = new String();
        mausac = new String();
        soluong = 0;
        chieudai=0;
        chieungang=0;
        giaban = 0;
    }
    public Gach(String maso,String mausac,int soluong,int chieudai,int chieungang,long giaban){
        this.maso=maso;
        this.mausac=mausac;
        this.soluong=soluong;
        this.chieudai=chieudai;
        this.chieungang=chieungang;
        this.giaban=giaban;
    }
    public long getGiaban(){
        return giaban;
    }
    public void nhapThongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ma so: ");
        maso = sc.nextLine();
        System.out.print("Nhap vao mau sac: ");
        mausac = sc.nextLine();
        System.out.print("Nhap vao so luong: ");
        soluong = sc.nextInt();
        System.out.print("Nhap vao chieu dai: ");
        chieudai = sc.nextInt();
        System.out.print("Nhap vao chieu ngang: ");
        chieungang = sc.nextInt();
        System.out.print("Nhap vao gia ban: ");
        giaban = sc.nextLong();
    }
    public void hienThi(){
        System.out.println("Ma so: "+maso);
        System.out.println("Mau sac: "+mausac);
        System.out.println("So luong: "+soluong);
        System.out.println("Chieu dai: "+chieudai);
        System.out.println("Chieu ngang: "+chieungang);
        System.out.println("Gia ban: "+giaban);
    }
    public double giaBanle(){
        return (double)((giaban/soluong)*1.2);//cao hon nguyen hop 20% vay = 120%
    }
    public int dienTichNen(){
        return soluong*(chieudai*chieungang);
    }
    public int soLuongHop(int D, int N){
        double slGachchieudai = Math.ceil((double)D/chieudai); //Math.ceil() la phuong thuc lam tron 
        //Tinh so luong gach theo chieu dai
        double slGachchieungang = Math.ceil((double)N/chieungang);
        //Tinh so luong theo chieu ngang
        return (int)Math.ceil((slGachchieudai*slGachchieungang)/soluong);
        //Sl gach chieu ngang* Sl gach chieu dai chia cho so luong gach trong moi hop
        //ep kieu ve kieu int vi so luong hop khong the la so thuc
    }
}
