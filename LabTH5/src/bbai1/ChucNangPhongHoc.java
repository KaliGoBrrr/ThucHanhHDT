package bbai1;

import java.util.List;

public interface ChucNangPhongHoc {
	public boolean themMotPhongHoc(PhongHoc phongHoc);
	public boolean xoaPhongHoc(String maPhongHoc);
	public PhongHoc timPhongHoc(String maPhongHoc);
	public void sapXepTangDanTheoDayNha();
	public void sapXepGiamDanTheoDienTich();
	public void sapXepTangDanTheoSoBongDen();
	public int tongSoPhongHoc();
	public List<PhongHoc> danhSachPhongDatChuan();
	public List<PhongHoc> layHetDanhSach();
}
