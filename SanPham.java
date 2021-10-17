public class SanPham {
	String MaSP, TenSP;
	int DonGia;
	
	public SanPham() {
		super();
		MaSP = "default_id";
		TenSP = "default_name";
		DonGia = 0;
	}

	public SanPham(String MaSP , String TenSP, int DonGia) {
		super();
		this.MaSP = MaSP;
		this.TenSP = TenSP;
		this.DonGia =DonGia ;
	}

	public String getMaSP() {
		return MaSP ;
	}

	public void setMaSP(String MaSP) {
		this.MaSP = MaSP;
	}

	public String getTenSP() {
		return TenSP;
	}

	public void setTenSP(String TenSP) {
		this.TenSP = TenSP;
	}

	public int getDonGia() {
		return DonGia;
	}

	public void setDonGia(int DonGia) {
		this. DonGia= DonGia;
	}
}
