package nguyentanhoangvu_23657941;

import java.time.LocalDate;

public abstract class Sach{
	public abstract double getThanhTien();
    protected String maSach,nhaXB;
    protected double donGia;
    protected LocalDate ngayNhap;
    protected int soLuong;
	public String getMaSach() {
		return maSach;
	}
	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}
	public String getNhaXB() {
		return nhaXB;
	}
	public void setNhaXB(String nhaXB) {
		this.nhaXB = nhaXB;
	}
	public double getDonGia() {
		return donGia;
	}
	public void setDonGia(double donGia) {
		this.donGia = donGia;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Sach(String maSach, String nhaXB, double donGia, LocalDate ngayNhap, int soLuong) {
		super();
		this.maSach = maSach;
		this.nhaXB = nhaXB;
		this.donGia = donGia;
		this.ngayNhap = ngayNhap;
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		String s ="";
		s =s.format("|%10s|%10s|%10s|%10s|%10s|", getMaSach(), getNhaXB(), getNgayNhap(), getSoLuong(), getDonGia());
        return s;
	}

    }
