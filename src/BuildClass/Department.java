package BuildClass;

public class Department {
    private int maBoPhan;
    private String tenBoPhan;
    private int soLuongNhanVienHienTai;

    public Department(int maBoPhan, String tenBoPhan, int soLuongNhanVienHienTai) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
        this.soLuongNhanVienHienTai = soLuongNhanVienHienTai;
    }

    // Getter
    public int getMaBoPhan() {
        return maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public int getSoLuongNhanVienHienTai() {
        return soLuongNhanVienHienTai;
    }

    // Setter
    public void setMaBoPhan(int maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public void setSoLuongNhanVienHienTai(int soLuongNhanVienHienTai) {
        this.soLuongNhanVienHienTai = soLuongNhanVienHienTai;
    }

    public String toSTring() {
        return "Mã bộ phận: " + maBoPhan + "\tTên bộ phận: " + tenBoPhan
               + "\tSố lượng nhân viên hiện tại: " + soLuongNhanVienHienTai;
    }
}