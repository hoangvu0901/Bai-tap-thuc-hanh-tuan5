package Tuan5;

public class CongNhan {
   private String maCN;
   private String mHo;
   private String mTen;
   private int maSP;
public String getMaCN() {
	return maCN;
}
public void setMaCN(String maCN) {
	this.maCN = maCN;
}
public String getmHo() {
	return mHo;
}
public void setmHo(String mHo) {
	this.mHo = mHo;
}
public String getmTen() {
	return mTen;
}
public void setmTen(String mTen) {
	this.mTen = mTen;
}
public int getMaSP() {
	return maSP;
}
public void setMaSP(int maSP) {
     if(maSP>0)
     {
    		this.maSP = maSP;
     } else {
    	 System.out.print("ma san pham khong hop le!");
     }
}
 // phuong thuc khoi tao day du tham so 
public CongNhan(String maCN,String mHo,String mTen,int maSP) {
	this.maCN = maCN;
	this.mHo = mHo;
	this.mTen = mTen;
	this.maSP = maSP;	
}
public double TinhLuong() {
	double luong;
	if(maSP>=1&& maSP>=199) {
		luong = maSP *0.5;
	}else if(maSP >=200&& maSP>=399)
	{
		luong = maSP*0.55;
	}else if(maSP>=400&& maSP <=599) {
		luong = maSP * 0.6;
	}else {
		luong = maSP *0.65;
	}
	return luong;
}
@Override
public String toString() {
	return String.format("Ma CN:%s\n Ho: %s \n Ten: %s\n So San Pham: %d\n  Luong: %.2f",maCN,mHo,mTen,maSP,TinhLuong());
}
}
