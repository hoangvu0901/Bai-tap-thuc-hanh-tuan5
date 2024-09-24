package nguyentanhoangvu_23657941;

import java.time.LocalDate;

public class SachGiaoKhoa extends Sach{
  private boolean tinhTrang;

@Override
public double getThanhTien() {
	if(istinhTrang()==true) {
		return getDonGia()*getSoLuong();
	}else {
		return getDonGia()*getSoLuong()*0.5;
	}
	
}
public boolean istinhTrang () {
	return tinhTrang;
}
public void settinhTrang(boolean tinhTrang) {
	this.tinhTrang = tinhTrang;
}
public SachGiaoKhoa(String MaSach, String NhaXB, LocalDate NgayNhap, double DonGia, int SoLuong,boolean tinhTrang) {
	super(MaSach, NhaXB, DonGia, NgayNhap, SoLuong);
	this.tinhTrang = tinhTrang;
}
public void sachGiaoKhoa() {}
public String getTrangSachCuoi() {
	if(istinhTrang()) {
		return "Moi";
	}else {
		return "Cu";
	}
}

@Override
public String toString() {
	String s1 ="";
	s1+=s1.format("%10s|%10s|",getTrangSachCuoi(),getThanhTien());
	return s1;
}
}
