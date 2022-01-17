package BuildClass;

public class Manager extends Staff implements ICalculator {
    private String chucDanh;

    public Manager(int maNhanVien, String tenNhanVien, int tuoiNhanVien, int heSoLuong,
                   int ngayVaoLam, String boPhanLamViec, int soNgayNghiPhep, String chucDanh) {
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.chucDanh = chucDanh;
    }

    public Manager() {
    }

    public String getChucDanh() {
        return chucDanh;
    }

    public void setChucDanh(String chucDanh) {
        this.chucDanh = chucDanh;
    }

    public int getLuongTrachNhiem() {
        return switch (getChucDanh()) {
            case "Business Leader" -> 8000000;
            case "Project Leader" -> 5000000;
            case "Technical Leader" -> 6000000;
            default -> throw new IllegalStateException("Unexpected value: " + getChucDanh());
        };
    }

    @Override
    public int getSalary() {
        return getHeSoLuong()*5000000 + getLuongTrachNhiem();
    }

    @Override
    public String displayInformation() {
        return "ID: " + getMaNhanVien() +
               "\t Tên: " + getTenNhanVien() +
               "\t Tuổi: " + getTuoiNhanVien() +
               "\t Hệ số lương: " + getHeSoLuong() +
               "\t Ngày vào làm: " + getNgayVaoLam() +
               "\t Bộ phận làm việc: " + getBoPhanLamViec() +
               "\t Số ngày nghỉ phép: " + getSoNgayNghiPhep() +
               "\t Chức danh: " + chucDanh +
               "\t Lương: " + getSalary();
    }
}