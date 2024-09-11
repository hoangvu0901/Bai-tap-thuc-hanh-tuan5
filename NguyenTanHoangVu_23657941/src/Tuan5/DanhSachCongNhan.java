
package Tuan5;
import java.util.ArrayList;
public class DanhSachCongNhan {
 private ArrayList<CongNhan> danhSach;
 public DanhSachCongNhan() {
	 this.danhSach = new ArrayList<>();
	 }
 public DanhSachCongNhan(ArrayList<CongNhan> danhSach) {
	 this.danhSach = new ArrayList<>(danhSach);
	 }
//them cong nhan vaao danh sach
public void themCN(CongNhan cn)
{
	danhSach.add(cn);
}
// Xuat toan bo thong tin cong nhan vien
public void XuatThongtin() {
	for( CongNhan cn : danhSach) {
		System.out.println(cn);
		System.out.println();
	}
}
public int TinhSoLuongCN() {
	return danhSach.size();
}
//phuong thuc cong nhan lam tren 200 san pham
public void CNtren200SP() {
	System.out.print("Danh sach cong nhan co tren 200 san pham:");
		for (CongNhan cn : danhSach) {
			if(cn.getMaSP() >=200) {
			System.out.println(cn);
			System.out.println();
			}
	}		
}
// phuong thuc xap xep giam dan
 public void Xapxep()
 {
	 int n= danhSach.size();
	 for(int i=0; i<n-1;i++) {
		 for(int j =0;j<n-1-i;j++) {
			 CongNhan cn1 = danhSach.get(j);
			 CongNhan cn2 = danhSach.get(j+1);
			 if(cn1.getMaSP()< cn2.getMaSP()) {
				 danhSach.set(j, cn2);
				 danhSach.set(j+1, cn1);
			 }
		 }
	 }
	
 }
	
}