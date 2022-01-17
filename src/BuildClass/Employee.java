package BuildClass;

public class Employee extends Staff implements ICalculator {
    private int soGioLamThem;

    public Employee(int maNhanVien, String tenNhanVien, int tuoiNhanVien, int heSoLuong,
                    int ngayVaoLam, String boPhanLamViec, int soNgayNghiPhep, int soGioLamThem) {
        super(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep);
        this.soGioLamThem = soGioLamThem;
    }

    public Employee() {
    }

    public int getSoGioLamThem() {
        return soGioLamThem;
    }

    public void setSoGioLamThem(int soGioLamThem) {
        this.soGioLamThem = soGioLamThem;
    }

    @Override
    public int getSalary() {
        return getHeSoLuong()*3000000 + getSoGioLamThem()*200000;
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
               "\t Giờ tăng ca: " + getSoGioLamThem() +
               "\t Lương: " + getSalary();
    }
}
