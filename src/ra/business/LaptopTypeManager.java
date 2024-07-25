package ra.business;

import ra.entity.LaptopType;

import java.util.Scanner;

public class LaptopTypeManager {


    public static void viewLaptopTypeisDeletedFalse() {
        for (int i = 0; i < size; i++) {
            if (laptopTypes[i].getIsDeleted() == false) {
                System.out.println(laptopTypes[i]);
            }
         }
        if(size==0){
            System.out.println("không có loại laptop nào trong danh sách");
        }
    }
    private static int size = 0;
    static LaptopType[] laptopTypes = new LaptopType[size];

    public static void addLaptopType(LaptopType laptopType) {
        LaptopType newLaptopType[] = new LaptopType[size + 1];
        if (size >= 0) System.arraycopy(laptopTypes, 0, newLaptopType, 0, size);
        newLaptopType[newLaptopType.length - 1] = laptopType;

        laptopTypes = newLaptopType;
        size++;
    }

    public static void updateLaptopType() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập ID loại laptop cần cập nhật: ");
        int typeId = scanner.nextInt();

        LaptopType laptopTypeToUpdate = null;
        for (int i = 0; i < size; i++) {
            if (laptopTypes[i].getTypeId() == typeId) {
                laptopTypeToUpdate = laptopTypes[i];
                break;
            }
        }

        if (laptopTypeToUpdate == null) {
            System.out.println("Không tìm thấy loại laptop.");
            return;
        }

        System.out.println("Thông tin hiện tại của loại laptop: " + laptopTypeToUpdate);
        laptopTypeToUpdate.inputData();
        System.out.println("Cập nhật loại laptop thành công.");
    }

    public static void deleteLaptopType(int id) {
        int index = -1;

        for (int i = 0; i < size; i++) {
            if (id== laptopTypes[i].getTypeId()) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Không tìm thấy loại laptop.");

        } else {
            LaptopType[] newLaptopType = new LaptopType[size - 1];
            for (int i = 0; i < newLaptopType.length; i++) {
                if (i < index) newLaptopType[i] = laptopTypes[i];
                else newLaptopType[i] = laptopTypes[i + 1];
            }
            laptopTypes = newLaptopType;
            size--;
        }
    }



}

