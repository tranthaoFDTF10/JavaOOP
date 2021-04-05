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
public class SDGach {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap vao so loai gach: ");
        n = sc.nextInt();
        Gach[] gach = new Gach[n];
        for(int i=0;i<n;i++){
            gach[i] = new Gach(); //cap phat bo nho cho tung phan tu
            System.out.println("Nhap vao thong tin loai gach thu "+(i+1)+": ");
            gach[i].nhapThongtin();
            
        }
        for(int i=0;i<n;i++){
            System.out.println("Thong tin loai gach thu "+(i+1)+": ");
            gach[i].hienThi();
        }
        
        Gach g = gach[0];
        double min_chiphi = (double)gach[0].getGiaban()/gach[0].dienTichNen();
        for(int i=1;i<n;i++){
            if((double)gach[i].getGiaban()/gach[i].dienTichNen()<min_chiphi){
                min_chiphi=(double)gach[i].getGiaban()/gach[i].dienTichNen();
                g=gach[i];
            }
        }
        System.out.println("Loai gach co chi phi lot thap nhat la: ");
        g.hienThi();
        
        for(int i=0;i<n;i++){
            //dai 20m=2000cm; ngang 5m=500cm
            double ChiPhi=gach[i].soLuongHop(2000, 500)*gach[i].getGiaban();
            System.out.println("Chi phi lot cua loai gach thu "+(i+1)+": "+ChiPhi);
                
        }
    }
}
