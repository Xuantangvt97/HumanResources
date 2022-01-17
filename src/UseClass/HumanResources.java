package UseClass;

import BuildClass.*;
import java.util.*;

public class HumanResources {
    private static final ArrayList<Staff> listStaff = new ArrayList<>();
    private static final ArrayList<Department> listDepartment = new ArrayList<>();
    public static void main(String[] args) {
        option();
    }

    /**
     * Chọn các chức năng mong muốn
     */
    private static void option() {
        Scanner input = new Scanner(System.in);
        int value;

        /// Thêm nhân viên vào danh sách nhân viên (danh sách mẫu để thực hiện option 1)
        for (int i = 1; i <= 3; i ++) {
            listStaff.add(new Manager(2 + i, "Lê Văn An " + i, 5 + i,
                    6 + i, 5 + i, "Giao tiếp",
                    5 + i, "Business Leader"));
        }

        // Thêm nhân viên vào danh sách nhân viên (danh sách mẫu để thực hiện option 1)
        for (int i = 4; i <= 6; i ++) {
            listStaff.add(new Employee(2 + i, "Nguyễn Thị Minh " + i, 5 + i,
                    6 + i, 5 + i, "Thu ngân", 5 + i, 6 + i));
        }

        do {
            System.out.print("""

                    ---------------------------------Option---------------------------------
                    1 - Hiển thị danh sách nhân viên hiện có trong công ty
                    2 - Hiển thị các bộ phận trong công ty
                    3 - Hiển thị các nhân viên theo từng bộ phận
                    4 - Thêm nhân viên mới vào công ty
                    5 - Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
                    6 - Hiển thị bảng lương của nhân viên toàn công ty theo thứ tự giảm dần
                    7 - Hiển thị bảng lương của nhân viên toàn công ty theo thứ tự tăng dần
                    (Nhập số khác để thoát)

                    Lựa chọn của bạn:\s""");

            value = input.nextInt();
            switch (value) {
                case 1 -> showListStaff();
                case 2 -> showDepartment();
                case 3 -> showListStaffInDepartment();
                case 4 -> addStaff();
                case 5 -> findStaff();
                case 6 -> sortDecSalary();
                case 7 -> sortIncSalary();
            }
        } while (value >= 1 && value <= 7);
    }

    /**
     * 1 - Hiển thị danh sách nhân viên hiện có trong công ty
     */
    private static void showListStaff() {
        for (Staff staff : listStaff) {
            System.out.println(staff.displayInformation());
        }
    }

    /**
     * 2 - Hiển thị các bộ phận trong công ty
     */
    private static void showDepartment() {
        // Tạo Arraylist danh sách bộ phận trong công ty
        listDepartment();

        System.out.println("Các bộ phận có trong công ty:");
        for (Department department : listDepartment) {
            System.out.println(department.toSTring());
        }
    }

    /**
     * 3 - Hiển thị các nhân viên theo từng bộ phận
     */
    private static void showListStaffInDepartment() {
        Scanner input = new Scanner(System.in);

        // Tạo Arraylist danh sách bộ phận trong công ty
        listDepartment();

        System.out.println("Chọn bộ phận muốn hiển thị nhân viên:");

        // Hiển thị danh sách bộ phận để lựa chọn
        for (Department department : listDepartment) {
            System.out.println("\t" + department.getMaBoPhan() + " - " + department.getTenBoPhan());
        }

        System.out.print("Lựa chọn của bạn: ");
        int choose = input.nextInt();

        // Lấy tên bộ phận được chọn
        String chosenOne = listDepartment.get(choose - 1).getTenBoPhan();
        System.out.println();

        // Hiển thị danh sách nhân viên trong bộ phận được chọn
        for (Staff staff : listStaff) {
            if (staff.getBoPhanLamViec().equals(chosenOne)) {
                System.out.println(staff.displayInformation());
            }
        }
    }

    /**
     * 4 - Thêm nhân viên mới vào công ty
     */
    private static void addStaff() {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                    1 - Thêm nhân viên thông thường
                    2 - Thêm nhân viên là cấp quản lý
                Lựa chọn của bạn:\s""");
        int select = input.nextInt();

        if (select == 1) {
            System.out.println();
            System.out.print("Mã nhân viên: ");
            int maNhanVien = input.nextInt();
            input.nextLine();

            System.out.print("Tên nhân viên: ");
            String tenNhanVien = input.nextLine();

            System.out.print("Tuổi nhân viên: ");
            int tuoiNhanVien = input.nextInt();

            System.out.print("Hệ số lương: ");
            int heSoLuong = input.nextInt();

            System.out.print("Ngày vào làm: ");
            int ngayVaoLam = input.nextInt();
            input.nextLine();

            System.out.print("Bộ phận làm việc: ");
            String boPhanLamViec = input.nextLine();

            System.out.print("Số ngày nghỉ phép: ");
            int soNgayNghiPhep = input.nextInt();

            System.out.print("Số giờ làm thêm: ");
            int soGioLamThem = input.nextInt();

            listStaff.add(new Employee(maNhanVien, tenNhanVien, tuoiNhanVien, heSoLuong,
                    ngayVaoLam, boPhanLamViec, soNgayNghiPhep, soGioLamThem));
        } else if (select == 2) {
            System.out.println();
            System.out.print("Mã nhân viên: ");
            int maNhanVien = input.nextInt();
            input.nextLine();

            System.out.print("Tên nhân viên: ");
            String tenNhanVien = input.nextLine();

            System.out.print("Tuổi nhân viên: ");
            int tuoiNhanVien = input.nextInt();

            System.out.print("Hệ số lương: ");
            int heSoLuong = input.nextInt();

            System.out.print("Ngày vào làm: ");
            int ngayVaoLam = input.nextInt();
            input.nextLine();

            System.out.print("Bộ phận làm việc: ");
            String boPhanLamViec = input.nextLine();

            System.out.print("Số ngày nghỉ phép: ");
            int soNgayNghiPhep = input.nextInt();

            System.out.print("""
                    Chức danh:
                        1 - Business Leader
                        2 - Project Leader
                        3 - Technical Leader
                    Lựa chọn của bạn:\s""");
            String chucDanh;
            int chonChucDanh = input.nextInt();
            switch (chonChucDanh) {
                case 1 -> chucDanh = "Business Leader";
                case 2 -> chucDanh = "Project Leader";
                case 3 -> chucDanh = "Technical Leader";
                default -> throw new IllegalStateException("Unexpected value: " + chonChucDanh);
            }
            listStaff.add(new Manager(maNhanVien, tenNhanVien, tuoiNhanVien,
                    heSoLuong, ngayVaoLam, boPhanLamViec, soNgayNghiPhep, chucDanh));
        }
    }

    /**
     * 5 - Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên
     */
    private static void findStaff() {
        Scanner input = new Scanner(System.in);
        System.out.print("""
                Tìm kiếm thông tin nhân viên:
                    1 - Theo tên
                    2 - Theo mã nhân viên
                Lựa chọn của bạn:\s""");
        int choose = input.nextInt();

        // Tìm kiếm nhân viên theo tên
        if (choose == 1) {
            System.out.print("Nhập tên nhân viên: ");
            input.nextLine();
            int count = 0;
            String name = input.nextLine().trim();

            for (Staff staff : listStaff) {
                if (staff.getTenNhanVien().toLowerCase().contains(name.toLowerCase())) {
                    System.out.println(staff.displayInformation());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Tên nhân viên không tồn tại");
            }

            // Tìm kiếm nhân viên theo mã nhân viên
        } else if (choose == 2) {
            System.out.print("Nhập mã nhân viên: ");
            int value = input.nextInt();
            int count = 0;
            for (Staff staff : listStaff) {
                if (staff.getMaNhanVien() == value) {
                    System.out.println(staff.displayInformation());
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Mã nhân viên không tồn tại");
            }
        } else {
            throw new IllegalStateException("Giá trị nhập vào không hợp lệ");
        }
    }

    /**
     * 6 - Hiển thị bảng lương của nhân viên toàn công ty theo thứ tự giảm dần
     */
    private static void sortDecSalary() {
        System.out.println("Danh sách nhân viên có mức lương giảm dần");
        for (int i = 0; i < listStaff.size() - 1; i++) {
            for (int j = i + 1; j < listStaff.size(); j++) {
                // Sắp xếp danh sách nhân viên theo thứ tự lương tăng dần
                if (Integer.parseInt(listStaff.get(i).displayInformation().
                        substring(listStaff.get(i).displayInformation().lastIndexOf("Lương: ") + 7)) <
                        Integer.parseInt(listStaff.get(j).displayInformation().
                                substring(listStaff.get(j).displayInformation().lastIndexOf("Lương: ") + 7))) {
                    listStaff.add(i, listStaff.get(j));
                    listStaff.set(j + 1, listStaff.get(i + 1));
                    listStaff.remove(i + 1);
                }
            }
        }

        // Hiểm thị danh sách nhân viên công ty sau khi đã được sắp xếp
        showListStaff();
    }

    /**
     * 7 - Hiển thị bảng lương của nhân viên theo thứ tự tăng dần
     */
    private static void sortIncSalary() {
        System.out.println("Danh sách nhân viên có mức lương tăng dần");
        for (int i = 0; i < listStaff.size() - 1; i++) {
            for (int j = i + 1; j < listStaff.size(); j++) {
                // Sắp xếp danh sách nhân viên theo thứ tự lương tăng dần
                if (Integer.parseInt(listStaff.get(i).displayInformation().
                        substring(listStaff.get(i).displayInformation().lastIndexOf("Lương: ") + 7)) >
                        Integer.parseInt(listStaff.get(j).displayInformation().
                        substring(listStaff.get(j).displayInformation().lastIndexOf("Lương: ") + 7))) {
                    listStaff.add(i, listStaff.get(j));
                    listStaff.set(j + 1, listStaff.get(i + 1));
                    listStaff.remove(i + 1);
                }
            }
        }

        // Hiểm thị danh sách nhân viên công ty sau khi đã được sắp xếp
        showListStaff();
    }

    /**
     * Tạo danh sách các bộ phận trong công ty
     */
    private static void listDepartment() {
        // Tạo mảng chứa "Danh sách bộ phận" (bao gồm bộ phận trùng nhau)
        ArrayList<String> boPhanNhanVien = new ArrayList<>();

        listDepartment.clear();

        // Lấy danh sách bộ phận từ mảng "Danh sách nhân viên"
        for (Staff staff : listStaff) {
            boPhanNhanVien.add(staff.getBoPhanLamViec());
        }

        int maBoPhan = 1;

        // lấy danh sách các bộ phận không trùng nhau từ "ArrayList<String> boPhanNhanVien"
        do {
            String firstMem = boPhanNhanVien.get(0);
            listDepartment.add(new Department(maBoPhan, firstMem, Collections.frequency(boPhanNhanVien, firstMem)));
            for (int i = boPhanNhanVien.size() - 1; i >= 0; i--) {
                if (boPhanNhanVien.get(i).equals(firstMem)) {
                    boPhanNhanVien.remove(i);
                }
            }
            maBoPhan++;
        } while (boPhanNhanVien.size() > 0);
    }
}