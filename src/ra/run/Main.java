package ra.run;

import ra.business.LaptopTypeManager;
import ra.entity.LaptopType;
import ra.util.InputMethods;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("---------------------LaptopType-Management-----------------------");
            System.out.println("1. Quản lý loại laptop");
            System.out.println("2. Quản lý laptop");
            System.out.println("3. thoát");
            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    menuLaptopType();
                    break;
                case 2:
                    menuLaptop();
                    break;
                case 3:
                    System.out.println("thoát");

                default:
                    System.err.println("lựa chọn không chinh xác, vui long nhập lại");
            }
            if (choice == 3) break;

        }
    }

    public static void menuLaptopType() {
        while (true) {
            System.out.println("----------------------LaptopType-type-Menu----------------------");
            System.out.println("1. Hiển thị danh sách các loại laptop");
            System.out.println("2. Thêm mới loại laptop ");
            System.out.println("3. Cập nhật thông tin laptop");
            System.out.println("4. Xóa loại laptop");
            System.out.println("5. Thoát ");

            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:
                    LaptopTypeManager.viewLaptopTypeisDeletedFalse();
                    break;
                case 2:
                    System.out.println("Nhap so loai laptop muon them:");
                    int n = InputMethods.getInt();
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap loai laptop thu " + (i + 1) + ":");
                        LaptopType laptopType = new LaptopType();
                        laptopType.inputData();
                        LaptopTypeManager.addLaptopType(laptopType);
                    }
                    break;
                case 3:
                    LaptopTypeManager.updateLaptopType();
                    break;
                case 4:
                    System.out.print("Nhập ID loại laptop cần xóa: ");
                    int typeId = InputMethods.getInt();
                    LaptopTypeManager.deleteLaptopType(typeId);
                    break;
                case 5:
                    System.out.println("quay lại LAPTOP-MANAGEMENT");
                default:
                    System.err.println("lựa chọn không chinh xác, vui long nhập lại");
            }
            if (choice == 5) break;

        }
    }

    public static void menuLaptop() {
        while (true) {
            System.out.println("----------------------LaptopType-Menu----------------------");
            System.out.println("1. Danh sách LaptopType");
            System.out.println("2. Thêm mới LaptopType  ");
            System.out.println("3. Cập nhật thông tin LaptopType ");
            System.out.println("4. Xóa LaptopType ");
            System.out.println("5. Thống kê số lượng laptop theo từng loại ");
            System.out.println(" 6. Thoát");

            byte choice = InputMethods.getByte();
            switch (choice) {
                case 1:


                    break;
                case 2:

                    break;
                case 3:
                    System.out.println("Nhập id muốn sửa:");
                    int idUpdate = InputMethods.getInt();

                    break;
                case 4:
                    System.out.println("Nhap id muon xoa:");
                    int idDelete = InputMethods.getInt();

                    break;
                case 5:
                    System.out.println("tam biet");
                default:
                    System.err.println("lựa chọn không chinh xác, vui long nhập lại");
            }
            if (choice == 5) break;

        }
    }
}