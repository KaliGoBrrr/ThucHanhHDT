package bbai1;

import java.util.Scanner;

public class testPhongHoc {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		try {
			DanhSachPhongHoc dsPhongHoc = new DanhSachPhongHoc();
			System.out.println("\t\t\tchuong trinh quan li phong hoc".toUpperCase());
			menuPhongHoc(dsPhongHoc);
		} catch (Exception e) {
			e.getStackTrace();
			System.out.println("Loi chuong trinh ! Chuong trinh dung lai".toUpperCase());
		}

	}
	private static void tieuDe() {
		System.out.println(String.format("%15s | %-20s | %15s | %15s | %15s | %15s | %-25s | %15s | %-15s | %-20s", "Ma Phong","Day Nha","Dien Tich","So Bong Đen","May Chieu","So May Tinh","Thong Tin Chuyen Nganh","Suc Chua","Bon Rua","Loai Phong"));
	}
	private static void tieuDeMenu() {
		System.out.println("=======================================================");
		System.out.println("\t\t\tquan ly phong hoc".toUpperCase());
		System.out.println("=======================================================");
		System.out.println("0. Nhap cung phong hoc.");
		System.out.println("1. Nhap mem phong hoc.");
		System.out.println("2. Tim kiem phong hoc.");
		System.out.println("3. In danh sach phong hoc.");
		System.out.println("4. In danh sach phong hoc dat chuan.");
		System.out.println("5. Sap xep theo day nha.");
		System.out.println("6. Sap xep theo dien tich.");
		System.out.println("7. Sap xep theo bong den.");
		System.out.println("8. Cap nhat so may tinh khi biet ma phong may tinh.");
		System.out.println("9. Xoa thong tin phong hoc.");
		System.out.println("10. Tong so phong hoc.");
		System.out.println("11. In dach sach cac phong may co 60 may.");
		System.out.println("12. Thoat.");
	}
	private static void menuPhongHoc(DanhSachPhongHoc dsPhongHoc) {
		
		int chon = 0;
		do {
			tieuDeMenu();
			System.out.println("Chon: ");
			try {
				chon = sc.nextInt();
			} catch (Exception e) {
				System.out.println("Erro!");
				throw null;
			}

			if(chon < 0 || chon > 12) {
				System.out.println("Chon sai! Chon tu (0 đen 12)!\nChon lai: ");
			}else {
				switch (chon) {
				case 1:
					menuChonNhapMem(dsPhongHoc);
					break;
				case 2:
					timPhongHoc(dsPhongHoc);
					break;
				case 3:
					dsPhongHoc.sapXepTheoID();
					xuatDanhSachPhong(dsPhongHoc);
					break;
				case 4:
					xuatDanhSachPhongDatChuan(dsPhongHoc);
					break;
				case 5:
					dsPhongHoc.sapXepTangDanTheoDayNha();
					System.out.println("\t\t\t\tdanh sach sap xep tang dan theo day nha".toUpperCase());
					xuatDanhSachPhong(dsPhongHoc);
					break;
				case 6:
					dsPhongHoc.sapXepGiamDanTheoDienTich();
					System.out.println("\t\t\t\tdanh sach sap xep theo dien tich".toUpperCase());
					xuatDanhSachPhong(dsPhongHoc);
					break;
				case 7:
					dsPhongHoc.sapXepTangDanTheoSoBongDen();
					System.out.println("\t\t\t\tdanh sach sap xep theo so bong den".toUpperCase());
					xuatDanhSachPhong(dsPhongHoc);
					break;
				case 8:
					capNhatMayTinh(dsPhongHoc);
					break;
				case 9:
					xoaMotPhongHoc(dsPhongHoc);
					break;
				case 10:
					inTongSoPhongHoc(dsPhongHoc);
					break;
				case 11:
					inDanhSachPhongMay60(dsPhongHoc);
					break;
					
				case 0:
					nhapCungPhongHoc(dsPhongHoc);
					break;
				default:
					
					break;
				}
			}

		}while(chon != 12);
	}

	private static void nhapCungPhongHoc(DanhSachPhongHoc dsPhongHoc) {
		PhongHoc phong1 = new PhongLyThuyet("ph1", "A", 200, 20, true);
		PhongHoc phong2 = new PhongLyThuyet("ph2", "B", 150, 20, false);

		PhongHoc phong3 = new PhongHocMayTinh("ph3", "C", 500, 55, 334);
		PhongHoc phong4 = new PhongHocMayTinh("ph4", "D", 500, 40, 200);

		PhongHoc phong5 = new PhongThiNghiem("ph5", "E", 400, 44, "Moi truong", 80, true);
		PhongHoc phong6 = new PhongThiNghiem("ph6", "F", 400, 44, "Moi truong", 30, false);
		if(dsPhongHoc.themMotPhongHoc(phong1)) {
			System.out.println("Them thanh cong: "+phong1.getMaPhong());
		}else {
			System.out.println("Them that bai: "+phong1.getMaPhong()+" -Da ton tai!!" );
		}

		if(dsPhongHoc.themMotPhongHoc(phong2)) {
			System.out.println("Them thanh cong: "+phong2.getMaPhong());
		}else {
			System.out.println("Them that bai: "+phong2.getMaPhong()+" -Da ton tai!!" );
		}
		if(dsPhongHoc.themMotPhongHoc(phong3)) {
			System.out.println("Them thanh cong: "+phong3.getMaPhong());
		}else {
			System.out.println("Them that bai: "+phong3.getMaPhong()+" -Da ton tai!!" );
		}
		if(dsPhongHoc.themMotPhongHoc(phong4)) {
			System.out.println("Them thanh cong: "+phong4.getMaPhong());
		}else {
			System.out.println("Them that bai: "+phong4.getMaPhong()+" -Da ton tai!!" );
		}
		if(dsPhongHoc.themMotPhongHoc(phong5)) {
			System.out.println("Them thanh cong: "+phong5.getMaPhong());
		}else {
			System.out.println("Them that bai: "+phong5.getMaPhong()+" -Da ton tai!!" );
		}
		if(dsPhongHoc.themMotPhongHoc(phong6)) {
			System.out.println("Them thanh cong: "+phong6.getMaPhong());
		}else {
			System.out.println("Them that bai: "+phong6.getMaPhong()+" -Da ton tai!!" );
		}
		System.out.println("\n");
	}

	private static void menuChonNhapMem(DanhSachPhongHoc dsPhongHoc) {
		
		int chon = 0;
		do {
			System.out.println("=======================================");
			System.out.println("\t\t\tmenu chon nhap mem".toUpperCase());
			System.out.println("=======================================");
			System.out.println("1. Nhap phong ly thuyet.");
			System.out.println("2. Nhap phong may tinh.");
			System.out.println("3. Nhap phong thi nghiem.");
			System.out.println("Ban chon nhap?: ");
			chon = sc.nextInt();
			if(chon < 0 || chon > 3) {
				System.out.println("1. Nhap phong ly thuyet.");
			System.out.println("2. Nhap phong may tinh.");
			System.out.println("3. Nhap phong thi nghiem.");
			System.out.println("Ban chon nhap?: ");
			}else {
				switch (chon) {
				case 1:
					int phongLyThuyet = 1;
					nhapMemPhongHoc(dsPhongHoc, phongLyThuyet);
					chon = 412;
					break;
				case 2:
					int phongMayTinh = 2;
					nhapMemPhongHoc(dsPhongHoc, phongMayTinh);
					chon = 412;
					break;
				case 3:
					int phongThiNghiem = 3;
					nhapMemPhongHoc(dsPhongHoc, phongThiNghiem);
					chon = 412;
					break;
				default:
					break;
				}
			}
		}while(chon != 412);
	}
	
	private static void nhapMemPhongHoc(DanhSachPhongHoc dsPhongHoc,int loaiPhong) {
		int phongLyThuyet = 1, phongMayTinh = 2,phongThiNghiem = 3;
		sc.nextLine();
		System.out.println("Nhap ma phong hoc: ");
		String checkMa = null;
		String maPhongHoc = nhapChuoi(checkMa, "ma phong hoc");

		System.out.println("Nhap day nha: ");
		String checkDayNha = null;
		String dayNha = nhapChuoi(checkDayNha, "day nha");

		System.out.println("Nhap dien tich: ");
		long checkDientich = 0;
		double dienTich = (double) nhapSo(checkDientich, "dien tich");

		System.out.println("Nhap so bong den: ");
		long checkSoBongDen = 0;
		int bongDen = (int) nhapSo(checkSoBongDen, "so bong den");

		if(loaiPhong == phongLyThuyet) {
			System.out.println("Co may chieu(1: Co, 2: Khong): ");
			int kiemTraMayChieu = 0;
			do {
				try {
					kiemTraMayChieu = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Ban vua nhap kiem tra co may chieu khong phai so!");
					throw null;
				}

				if(kiemTraMayChieu > 2 || kiemTraMayChieu < 1) {
					System.out.println("Nhap sai!");
					System.out.println("Co may chieu(1: co, 2: Khong): ");
				}else {
					boolean coMayChieu = (kiemTraMayChieu == 1)?true:false;
					PhongLyThuyet phongMoi = new PhongLyThuyet(maPhongHoc, dayNha, dienTich, bongDen, coMayChieu);
					dsPhongHoc.themMotPhongHoc(phongMoi);
				}
			}while(kiemTraMayChieu > 2 || kiemTraMayChieu < 1);

		}else if (loaiPhong == phongMayTinh) {
			System.out.println("Nhap vao so luong may tinh: ");
			long checkSoLuong = 0;
			int soLuongMayTinh = (int) nhapSo(checkSoLuong, "So luong may tinh");
			PhongHocMayTinh phongMoi = new PhongHocMayTinh(maPhongHoc, dayNha, dienTich, bongDen, soLuongMayTinh);
			dsPhongHoc.themMotPhongHoc(phongMoi);
		}else if (loaiPhong == phongThiNghiem) {
			sc.nextLine();
			System.out.println("Nhap thong tin chuyen nghanh: ");
			String checkThongTinChuyenNganh = null;
			String thongTinChuyenNganh = nhapChuoi(checkThongTinChuyenNganh, "thong tin chuyen nghanh");

			System.out.println("Nhap suc chua: ");
			long checkSucChua = 0;
			int sucChua = (int) nhapSo(checkSucChua, "Suc chua");

			System.out.println("Co bon rua khong(1: Co, 2: Khong): ");
			int kiemTraBonRua = 0;
			do {
				try {
					kiemTraBonRua = sc.nextInt();
				} catch (Exception e) {
					System.out.println("Ban vua nhap kiem tra co bon rua khong phai so!");
					throw null;
				}

				if(kiemTraBonRua > 2 || kiemTraBonRua < 1) {
					System.out.println("Nhap sai!");
					System.out.println("Co bon rua khong(1: Co, 2: Khong): ");
				}else {
					boolean coBonRua = (kiemTraBonRua == 1)?true:false;
					PhongThiNghiem phongMoi = new PhongThiNghiem(maPhongHoc, dayNha, dienTich, bongDen, thongTinChuyenNganh, sucChua, coBonRua);
					dsPhongHoc.themMotPhongHoc(phongMoi);
				}
			}while(kiemTraBonRua > 2 || kiemTraBonRua < 1);

		}

	}

	private static void timPhongHoc(DanhSachPhongHoc dsPhongHoc) {
		sc.nextLine();
		System.out.println("Nhap ma phong can tim: ");
		String maCheck = null;
		String maCheckCanTim = nhapChuoi(maCheck, "Ma can tim");
		PhongHoc objTim = dsPhongHoc.timPhongHoc(maCheckCanTim);
		if(objTim !=null) {
			System.out.println("Tim thay phong: "+maCheckCanTim);
			tieuDe();
			System.out.println(objTim);
		}else {
			System.out.println("Khong tim thay phong: "+maCheckCanTim);
		}

		System.out.println("\n");
	}

	
	private static void xuatDanhSachPhong(DanhSachPhongHoc dsPhongHoc) {
		if(!dsPhongHoc.layHetDanhSach().isEmpty()) {
			System.out.println("\t\t\t\tDanh sach phong hoc".toUpperCase());
			tieuDe();
			for(PhongHoc phong: dsPhongHoc.layHetDanhSach()) {
				System.out.println(phong);
			}
		}else {
			System.out.println("Danh sach rong");
		}

		System.out.println("\n");
	}

	
	private static void xuatDanhSachPhongDatChuan(DanhSachPhongHoc dsPhongHoc) {
		System.out.println("\t\t\t\tdanh sach phong hoc chuan".toUpperCase());
		tieuDe();
		for(PhongHoc phong: dsPhongHoc.danhSachPhongDatChuan()) {
			System.out.println(phong);
		}
		System.out.println("\n");
	}

	
	private static void capNhatMayTinh(DanhSachPhongHoc dsPhongHoc) {
		sc.nextLine();
		System.out.println("Nhap ma phong may tinh can cap nhat");
		String checkMaPhongHoc = null;
		String maPhongHoc = nhapChuoi(checkMaPhongHoc, "ma phong hoc");
		PhongHoc phongTim = dsPhongHoc.timPhongHoc(maPhongHoc);
		if(phongTim != null) {
			System.out.println("Cap nhat lai so luong may tinh: ");
			long checkSoLuongMay = 0;
			int soLuongMayTinh = (int) nhapSo(checkSoLuongMay, "so luong may tinh");
			if(dsPhongHoc.capNhatSoMayTinh(maPhongHoc, soLuongMayTinh)) {
				System.out.println("Cap nhat thanh cong!");
			}else {
				System.out.println("Ma phong: "+maPhongHoc+" - Khong phai la phong may tinh");
			}
		}else {
			System.out.println("Ma phong: "+maPhongHoc+" - Khong ton tai");
		}
		System.out.println("\n");
	}

	
	private static void xoaMotPhongHoc(DanhSachPhongHoc dsPhongHoc) {
		sc.nextLine();
		System.out.println("Nhap ma can xoa");
		String checkMaPhongHoc = null;
		String maPhongHoc = nhapChuoi(checkMaPhongHoc, "ma phong hoc");
		PhongHoc phongTim = dsPhongHoc.timPhongHoc(maPhongHoc);
		if(phongTim != null) {
			if(dsPhongHoc.xoaPhongHoc(maPhongHoc)) {
				System.out.println("Xoa thanh cong "+maPhongHoc);
			}else {
				System.out.println("Xoa khong thanh cong "+maPhongHoc);
			}

		}else {
			System.out.println("Ma phong: "+maPhongHoc+" - Khong ton tai");
		}
		System.out.println("\n");

	}

	
	private static void inTongSoPhongHoc(DanhSachPhongHoc dsPhongHoc) {
		System.out.println("Tong so phong hoc la: "+ dsPhongHoc.tongSoPhongHoc());
		System.out.println("\n");
	}

	
	private static void inDanhSachPhongMay60(DanhSachPhongHoc dsPhongHoc) {

		if(!dsPhongHoc.danhSachPhongMayCo60May().isEmpty()) {
			System.out.println("\t\t\t\tDanh sach may tinh co 60 may".toUpperCase());
			tieuDe();
			for(PhongHoc phong : dsPhongHoc.danhSachPhongMayCo60May()) {
				System.out.println(phong);
			}
		}else {
			System.out.println("Danh sach rong");
		}

		System.out.println("\n");
	}

	
	public static long nhapSo(long number, String text) {
		String title = text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();//in hoa chữ cái đầu
		do {
			try {
				number = sc.nextLong();
			} catch (Exception e) {
				System.out.println(title+ "ban vua nhap khong phai so");
				throw null;
			}
			if(number < 0) {
				System.out.println(title+" - Khong duoc be hon khong 0!\nNhap lai:");
			}
		}while(number < 0);
		return number;
	}

	public static String nhapChuoi(String str, String text) {
		String title = text.substring(0,1).toUpperCase() + text.substring(1).toLowerCase();//in hoa chữ cái đầu
		do {
			try {
				str = sc.nextLine();
			} catch (Exception e) {
				System.out.println("Something wrong!!");
				throw null;
			}
			if(str == null || str.isEmpty()) {
				System.out.println(title+" - Khong duoc de trong!\nNhap lai:");
			}
		}while(str == null || str.isEmpty());
		return str;
	}
	
}