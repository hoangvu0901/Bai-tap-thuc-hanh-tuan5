package Tuan5;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
         ArrayList<CongNhan> danhSachNhap= new ArrayList<>();
         danhSachNhap.add(new CongNhan("CN1","Nguyen",  "Hung", 150)); 
         danhSachNhap.add(new CongNhan("CN2","Nguyen",  "Cu", 300)); 
	     danhSachNhap.add(new CongNhan("CN3","Nguyen",  "Tuan", 200)); 
	DanhSachCongNhan ds = new DanhSachCongNhan(danhSachNhap);
	System.out.println("dnah sach truoc khi sap xep:");
	ds.XuatThongtin();
	ds.CNtren200SP();
	ds.Xapxep();
	}

}
