package ra.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputMethods {

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }

    // kiem tra 1 so co phai Integer hay khong.
    public static Integer getInt() {
        while (true) {
            try {
                return getScanner().nextInt();
            } catch (InputMismatchException e) {
                System.err.println("ban hay nhap vao 1 so");
            }
        }
    }

    // kiem tra 1 so co phai long hay k
    public static Long getLong() {
        while (true) {
            try {
                return getScanner().nextLong();
            } catch (InputMismatchException e) {
                System.err.println("moi ban nhap lai");
            }
        }
    }

    // kiem tra 1 so co phai short hay k
    public static Short getShort() {
        while (true) {
            try {
                return getScanner().nextShort();
            } catch (InputMismatchException e) {
                System.err.println("moi ban nhap lai");
            }
        }
    }

    // kiem tra 1 so co phai byte hay k
    public static Byte getByte() {
        while (true) {
            try {
                return getScanner().nextByte();
            } catch (InputMismatchException e) {
                System.err.println("moi ban nhap lai");
            }
        }
    }

    // kiem tra 1 so co phai Boolean hay k
    public static Boolean getBoolean() {
        while (true) {
            try {
                return getScanner().nextBoolean();
            } catch (InputMismatchException e) {
                System.err.println("moi ban nhap lai");
            }
        }
    }

    // kiem tra 1 so co phai Boolean hay k
    public static Float getFloat() {
        while (true) {
            try {
                return getScanner().nextFloat();
            } catch (InputMismatchException e) {
                System.err.println("moi ban nhap lai");
            }
        }
    }

    // kiem tra 1 so co phai Boolean hay k
    public static Double getDouble() {
        while (true) {
            try {
                return getScanner().nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("moi ban nhap lai");
            }
        }
    }

    // kiem tra 1 so co phai character hay k
    public static Character getCharacter() {
        while (true) {
            try {
                return getScanner().nextLine().charAt(0);
            } catch (InputMismatchException e) {
                System.err.println("moi ban nhap lai");
            }
        }
    }

    // kiem tra localdate
    public static LocalDate getDate() {
        while (true) {
            try {
                String dataStr = getScanner().nextLine();
                return LocalDate.parse(dataStr, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            } catch (DateTimeParseException e) {
                System.err.println("ngay thang khong dung dinh dang");
            }
        }
    }

    public static String getString() {
        while (true) {
            try {
                return getScanner().nextLine();
            } catch (NoSuchElementException e) {
                System.err.println(" vui long nhap lại");
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("nhap ngay thang nam");
        getDate();
    }
}
