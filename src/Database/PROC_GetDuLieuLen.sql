USE QLNS
GO

--================================================================================================================================================================================================
CREATE PROC P_GetAllKhachHang
AS
BEGIN
    SELECT dbo.KHACHHANG.MaKhachHang, TenKhachHang, TenNhom, DienThoai, TruyVanCon.TongTien , CONVERT(CHAR(10),TruyVanCon.LanCuoiMuaHang,103) AS LanCuoiMuaHang, TinhTrang
    FROM dbo.KHACHHANG
    JOIN dbo.NHOMKHACHHANG ON NHOMKHACHHANG.MaNhomKhachHang = KHACHHANG.MaNhomKhachHang
    LEFT JOIN
           (   SELECT MaKhachHang, MAX(NgayBan) AS 'LanCuoiMuaHang', SUM(TongTien) AS 'TongTien'
               FROM dbo.HOADON
               GROUP BY MaKhachHang ) TruyVanCon ON TruyVanCon.MaKhachHang = KHACHHANG.MaKhachHang
	ORDER BY CONVERT(INT,SUBSTRING(KHACHHANG.MaKhachHang,3,100)) DESC
END;
GO

EXEC dbo.P_GetAllKhachHang
GO

CREATE PROC P_SeachKH
	@MaKH CHAR(10), @TenKH NVARCHAR(40), @DienThoai CHAR(10)
AS
BEGIN
    SELECT dbo.KHACHHANG.MaKhachHang, TenKhachHang, TenNhom, DienThoai, TruyVanCon.TongTien , CONVERT(CHAR(10),TruyVanCon.LanCuoiMuaHang,103) AS LanCuoiMuaHang, TinhTrang
    FROM dbo.KHACHHANG
     JOIN dbo.NHOMKHACHHANG ON NHOMKHACHHANG.MaNhomKhachHang = KHACHHANG.MaNhomKhachHang
     LEFT JOIN
           (   SELECT MaKhachHang, MAX(NgayBan) AS 'LanCuoiMuaHang', SUM(TongTien) AS 'TongTien'
               FROM dbo.HOADON
               GROUP BY MaKhachHang ) TruyVanCon ON TruyVanCon.MaKhachHang = KHACHHANG.MaKhachHang
	WHERE KHACHHANG.MaKhachHang LIKE @MaKH OR TenKhachHang LIKE @TenKH OR DienThoai = @DienThoai 
	ORDER BY CONVERT(INT,SUBSTRING(KHACHHANG.MaKhachHang,3,100)) DESC
END;
GO


--================================================================================================================================================================================================

CREATE PROC P_GetAllNhomKhachHang
AS
BEGIN
    SELECT * FROM NHOMKHACHHANG
	ORDER BY CONVERT(INT,SUBSTRING(NHOMKHACHHANG.MaNhomKhachHang,4,100)) DESC
END;
GO

EXEC P_GetAllNhomKhachHang;
GO

--============================================================================================================================================================================================

CREATE PROC P_getNhaCungCap
AS
BEGIN
    SELECT MaNCC, TenNCC, DienThoai, TinhTrang FROM NHACUNGCAP
	
END;
GO

EXEC P_getNhaCungCap;
GO
--==================================================================================================================================================

CREATE PROC P_GetAllHoaDon
AS
BEGIN
	SELECT MaHoaDon,CONVERT(CHAR(12),NgayBan,103) AS NgayBan, TenNhanVien, TenKhachHang, hd.TongTien
	FROM HOADON  hd 
	JOIN NHANVIEN nv on nv.MaNhanVien= hd.MaNhanVien
	JOIN KHACHHANG kh on kh.MaKhachHang = hd.MaKhachHang
	ORDER BY CONVERT(INT,SUBSTRING(HD.MaHoaDon,3,100)) DESC
END;
GO

EXEC P_GetAllHoaDon
GO

--==================================================================================================================================================

CREATE PROC P_GetAllSach
AS
BEGIN
	SELECT MaSach,TenSach,TacGia,GiaNhap,GiaBan,SoLuong,dbo.NHOMSACH.TenNhom,dbo.SACH.TinhTrang FROM dbo.SACH 
	JOIN dbo.NHOMSACH ON NHOMSACH.MaNhomSach = SACH.MaNhomSach
	ORDER BY CONVERT(INT,SUBSTRING(dbo.SACH.MaSach,2,100)) DESC
END

GO

EXEC P_GetAllSach
GO

--==================================================================================================================================================

CREATE PROC P_GetCTHDByMa @maHoaDon char(10)
AS
BEGIN
	SELECT SACH.MaSach, TenSach, CHITIETHOADON.SoLuong, DonGia FROM dbo.CHITIETHOADON
	JOIN dbo.SACH ON SACH.MaSach = CHITIETHOADON.MaSach
	WHERE MaHoaDon = @maHoaDon
	ORDER BY CONVERT(INT,SUBSTRING(dbo.SACH.MaSach,2,100)) ASC
END
GO

EXEC P_GetCTHDByMa @maHoaDon = 'HD001'
GO
--==================================================================================================================================================
CREATE PROC P_getALLNhanVien
AS
BEGIN
	SELECT MaNhanVien,TenNhanVien,GioiTinh,CONVERT(CHAR(10),NgaySinh,103) AS NgaySinh,SoCMND,DienThoai,TinhTrang FROM  dbo.NHANVIEN
	ORDER BY CONVERT(INT,SUBSTRING(dbo.NHANVIEN.MaNhanVien,3,100)) DESC
END
GO

EXEC dbo.P_getALLNhanVien
GO

--==================================================================================================================================================
CREATE PROC P_GetAllTaiKhoan
AS
BEGIN
	SELECT TenDN,NHANVIEN.MaNhanVien, TenNhanVien FROM dbo.TAIKHOAN
	JOIN dbo.NHANVIEN ON NHANVIEN.MaNhanVien = TAIKHOAN.MaNhanVien
	ORDER BY CONVERT(INT,SUBSTRING(dbo.NHANVIEN.MaNhanVien,3,100)) DESC
END
GO
--==================================================================================================================================================
CREATE PROC P_GetAllPhieuNhap
AS
BEGIN
	SELECT pn.MaPhieuNhap, CONVERT(CHAR(10), PN.NgayNhap, 103) AS NgayNhap, NV.TenNhanVien, ncc.TenNCC,NCC.TongTien FROM dbo.PHIEUNHAP PN
	JOIN dbo.NHACUNGCAP NCC ON NCC.MaNCC = PN.MaNCC
	JOIN dbo.NHANVIEN NV ON NV.MaNhanVien = PN.MaNhanVien
	ORDER BY CONVERT(INT,SUBSTRING(PN.MaPhieuNhap,3,100)) DESC
END;
GO

EXEC P_GetAllPhieuNhap
GO
--==================================================================================================================================================

CREATE PROC P_GetCTPNByMa @maPhieuNhap char(10)
AS
BEGIN
	SELECT CTPN.MaSach, S.TenSach, CTPN.SoLuong, CTPN.DonGia  FROM dbo.CHITIETPHIEUNHAP CTPN
	JOIN dbo.SACH S ON S.MaSach = CTPN.MaSach
	WHERE CTPN.MaPhieuNhap = @maPhieuNhap
END
GO

EXEC P_GetCTPNByMa @maPhieuNhap = 'PN001'
GO
--==================================================================================================================================================

CREATE PROC P_GetAllNhomSach
AS
BEGIN
	SELECT NHOMSACH.MaNhomSach, TenNhom, NHOMSACH.TinhTrang, SUM(SoLuong) AS SoLuong  FROM dbo.NHOMSACH
	LEFT JOIN dbo.SACH ON SACH.MaNhomSach = NHOMSACH.MaNhomSach
	GROUP BY NHOMSACH.MaNhomSach, TenNhom, NHOMSACH.TinhTrang
	ORDER BY CONVERT(INT,SUBSTRING(NHOMSACH.MaNhomSach,3,100)) DESC
END;
GO

--==================================================================================================================================================
CREATE PROC P_GetKhachHangBySDT
	@DienThoai CHAR(10)
AS
BEGIN
    SELECT dbo.KHACHHANG.MaKhachHang, TenKhachHang, TenNhom, DienThoai, TruyVanCon.TongTien , CONVERT(CHAR(10),TruyVanCon.LanCuoiMuaHang,103) AS LanCuoiMuaHang, TinhTrang
    FROM dbo.KHACHHANG
        JOIN dbo.NHOMKHACHHANG ON NHOMKHACHHANG.MaNhomKhachHang = KHACHHANG.MaNhomKhachHang
        LEFT JOIN
           (   SELECT MaKhachHang, MAX(NgayBan) AS 'LanCuoiMuaHang', SUM(TongTien) AS 'TongTien'
               FROM dbo.HOADON
               GROUP BY MaKhachHang ) TruyVanCon ON TruyVanCon.MaKhachHang = KHACHHANG.MaKhachHang
	WHERE DienThoai = @DienThoai
END;
GO

--==================================================================================================================================================
CREATE PROC P_GetKhachHangByMa
	@MaKH CHAR(10)
AS
BEGIN
    SELECT dbo.KHACHHANG.MaKhachHang, TenKhachHang, TenNhom, DienThoai, TruyVanCon.TongTien , CONVERT(CHAR(10),TruyVanCon.LanCuoiMuaHang,103) AS LanCuoiMuaHang, TinhTrang
    FROM dbo.KHACHHANG
        JOIN dbo.NHOMKHACHHANG ON NHOMKHACHHANG.MaNhomKhachHang = KHACHHANG.MaNhomKhachHang
        LEFT JOIN
           (   SELECT MaKhachHang, MAX(NgayBan) AS 'LanCuoiMuaHang', SUM(TongTien) AS 'TongTien'
               FROM dbo.HOADON
               GROUP BY MaKhachHang ) TruyVanCon ON TruyVanCon.MaKhachHang = KHACHHANG.MaKhachHang
	WHERE KHACHHANG.MaKhachHang = @MaKH
END;
GO

--==================================================================================================================================================

CREATE PROC P_GetNhomSachByTenNhom
	@TenNhom NVARCHAR(50)
AS
BEGIN
	SELECT NHOMSACH.MaNhomSach, TenNhom, NHOMSACH.TinhTrang, SUM(SoLuong) AS SoLuong  FROM dbo.NHOMSACH
	LEFT JOIN dbo.SACH ON SACH.MaNhomSach = NHOMSACH.MaNhomSach
	WHERE dbo.NHOMSACH.TenNhom = @TenNhom
	GROUP BY NHOMSACH.MaNhomSach, TenNhom, NHOMSACH.TinhTrang
END;
GO

--==================================================================================================================================================
CREATE PROC P_XuatHoaDon
	@MaHoaDon CHAR(10)
AS
BEGIN
	SELECT HOADON.MaHoaDon,TenKhachHang,TenNhanVien,CONVERT(CHAR(10),NgayBan,103) AS NgayBan,HOADON.TongTien,dbo.SACH.MaSach,TenSach,DonGia,CHITIETHOADON.SoLuong, DonGia*CHITIETHOADON.SoLuong  AS ThanhTien FROM dbo.HOADON
	JOIN dbo.KHACHHANG ON KHACHHANG.MaKhachHang = HOADON.MaKhachHang
	JOIN dbo.NHANVIEN ON NHANVIEN.MaNhanVien = HOADON.MaNhanVien
	JOIN dbo.CHITIETHOADON ON CHITIETHOADON.MaHoaDon = HOADON.MaHoaDon
	JOIN dbo.SACH ON SACH.MaSach = CHITIETHOADON.MaSach
	WHERE HOADON.MaHoaDon = @MaHoaDon
END
GO

EXEC P_XuatHoaDon	@MaHoaDon = 'HD001'
GO
--==================================================================================================================================================
CREATE FUNCTION F_MaPhieuNhapMoiNhat()
RETURNS CHAR(10)
AS
BEGIN
	DECLARE @dem INT;
	SELECT @dem = COUNT(*) FROM  dbo.PHIEUNHAP
	DECLARE @MaPhieuNhap CHAR(10) = 'PN00' + CONVERT(CHAR(10),@dem)
	RETURN @MaPhieuNhap
END
GO


CREATE FUNCTION F_MaHoaDonMoiNhat()
RETURNS CHAR(10)
AS
BEGIN
	DECLARE @dem INT;
	SELECT @dem = COUNT(*) FROM  dbo.HoaDon
	DECLARE @MaHoaDon CHAR(10) = 'HD00' + CONVERT(CHAR(10),@dem)
	RETURN @MaHoaDon
END
GO
--==================================================================================================================================================
CREATE FUNCTION F_TinhDoanhSo()
RETURNS MONEY
AS
BEGIN
	DECLARE @TongTien MONEY = 0
	SELECT @TongTien = SUM(TongTien) FROM dbo.HOADON
	RETURN @TongTien
END
GO


CREATE FUNCTION F_TinhLai()
RETURNS MONEY
AS
BEGIN
	DECLARE @DoanhThu MONEY = 0
	SELECT @DoanhThu = SUM(TongTien) FROM dbo.HOADON
	DECLARE @TongTien MONEY = 0
	SELECT @TongTien = SUM(TongTien) FROM dbo.PHIEUNHAP

	RETURN @DoanhThu - @TongTien
END
GO

CREATE FUNCTION F_SoDonHang()
RETURNS INT
AS
BEGIN
	DECLARE @Count INT = 0
	SELECT @Count = COUNT(*) FROM dbo.HOADON
	RETURN @Count
END
GO


CREATE FUNCTION F_TinhDoanhThuTheo(@value int)
RETURNS MONEY
AS
BEGIN
	DECLARE @DoanhThu MONEY = 0
	IF(@value = 0) -- Hom nay
		SELECT @DoanhThu = TongTien FROM dbo.HOADON WHERE NgayBan = GETDATE()
	ELSE IF(@value = 1) -- Hom qua
		SELECT @DoanhThu = TongTien FROM dbo.HOADON WHERE NgayBan = GETDATE()
	RETURN @DoanhThu
END
GO

