package BuildClass;

public abstract class Staff {
    private int maNhanVien;
    private String tenNhanVien;
    private int tuoiNhanVien;
    private int heSoLuong;
    private int ngayVaoLam;
    private String boPhanLamViec;
    private int soNgayNghiPhep;

    public abstract String displayInformation();

    public Staff (int maNhanVien, String tenNhanVien, int tuoiNhanVien,
                  int heSoLuong, int ngayVaoLam, String boPhanLamViec, int soNgayNghiPhep) {
        this.maNhanVien = maNhanVien;
        this.tenNhanVien = tenNhanVien;
        this.tuoiNhanVien = tuoiNhanVien;
        this.heSoLuong = heSoLuong;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhanLamViec = boPhanLamViec;
        this.soNgayNghiPhep = soNgayNghiPhep;
    }

    public Staff() {
    }

    // Getter
    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public int getTuoiNhanVien() {
        return tuoiNhanVien;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public int getNgayVaoLam() {
        return ngayVaoLam;
    }

    public String getBoPhanLamViec() {
        return boPhanLamViec;
    }

    public int getSoNgayNghiPhep() {
        return soNgayNghiPhep;
    }


    // Setter
    public void setMaNhanVien(int maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public void setTuoiNhanVien(int tuoiNhanVien) {
        this.tuoiNhanVien = tuoiNhanVien;
    }

    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public void setNgayVaoLam(int ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }

    public void setBoPhanLamViec(String boPhanLamViec) {
        this.boPhanLamViec = boPhanLamViec;
    }

    public void setSoNgayNghiPhep(int soNgayNghiPhep) {
        this.soNgayNghiPhep = soNgayNghiPhep;
    }
}
