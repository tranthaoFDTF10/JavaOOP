/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi_03;

/**
 *
 * @author Administrator
 */
public class DoanThang {
    private Diem a;
    private Diem b;
    //su dung source code cua Diem
    //khai bao a,b la doi tuong kieu Diem. Thuoc tinh la doi tuong
    
    public DoanThang(){
        a = new Diem(); //cap phat bo nho
        b = new Diem();
    }
    public DoanThang(Diem a1, Diem b1){
        a = new Diem(a1); //goi ham xay dung sao chep Diem()
        b = new Diem(b1); //goi ham xay dung sao chep Diem()
    }
    public DoanThang(DoanThang d){ //d(a(x,y), b(x,y)) 
        //Ham sao chep doan thang
        a = new Diem(d.a);
        b = new Diem(d.b);
      
    }
    public void nhapDoanThang(){
        System.out.println("Nhap toa do diem thu nhat: ");
        a.nhapDiem();
        System.out.println("Nhap toa do diem thu hai: ");
        b.nhapDiem();
    }
    public void hienThi(){
        a.hienThi();
        System.out.print(" ");
        b.hienThi();
    }
    @Override
    public String toString(){
        String t = "["+a+","+b+"]"+"\n";
        return t;
    }
    public void TinhTien(int dx, int dy){
        a.doiDiem(dx, dy);
        b.doiDiem(dx, dy);
    }
    public double tinhDoDai(){
        return Math.sqrt(Math.pow(a.giaTriX()-b.giaTriX(), 2)+Math.pow(a.giaTriY()-b.giaTriY(), 2));
    }
    public double tinhGoc(){
        // truc hoanh co toa do(1,0);
        return Math.acos(Math.abs(b.giaTriX()-a.giaTriX())/this.tinhDoDai()); //this.doDai dang tham chieu toi gia tri do dai cua  toa do hien tai
        //tinh vo huong (AB*i) chia tich do dai(AB)*(i)
        //ham Math.acos dang tinh gai tri radian cua goc
    }
    public double tinhDo(){
        double radian= Math.acos(Math.abs(b.giaTriX()-a.giaTriY())/this.tinhDoDai());
        return Math.toDegrees(radian);
    }
    
}
