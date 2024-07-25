package ra.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Laptop {

    private String laptopId, laptopName, description;
    private int ram, typeId;
    private double weight, laptopPrice;
    private Date createAt;
    private boolean isDeleted;

    public Laptop() {
    }

    public Laptop(String laptopId, String laptopName, String description, int ram, int typeId, double weight, double laptopPrice, Date createAt, boolean isDeleted) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
        this.description = description;
        this.ram = ram;
        this.typeId = typeId;
        this.weight = weight;
        this.laptopPrice = laptopPrice;
        this.createAt = createAt;
        this.isDeleted = isDeleted;
    }

    public String getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(String laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getLaptopPrice() {
        return laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
        this.laptopPrice = laptopPrice;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean isDeleted) {
        this.isDeleted = isDeleted;
    }

    @Override

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String formattedDate = (createAt != null) ? sdf.format(createAt) : "N/A";

        return String.format(
                "ID: %s | Name: %s | Description: %s | RAM: %d GB | Type ID: %d | Weight: %.2f kg | Price: %.2f | Creation Date: %s | Deleted: %s",
                laptopId,
                laptopName,
                description,
                ram,
                typeId,
                weight,
                laptopPrice,
                formattedDate,
                isDeleted ? "true" : "false"
        );
    }

    public void inputData() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        while (true) {
            System.out.print("Mã của laptop (LXXX): ");
            String inputId = sc.nextLine();
            if (Pattern.matches("^L\\d{3}$", inputId)) {
                this.laptopId = inputId; // Assign to instance variable
                break;
            } else {
                System.out.println("Nhập chưa đúng định dạng, vui lòng nhập lại.");
            }
        }

        while (true) {
            System.out.print("Tên của laptop: ");
            String inputName = sc.nextLine();
            if (!inputName.isEmpty() && !inputName.equals(this.laptopName)) {
                this.laptopName = inputName; // Assign to instance variable
                break;
            } else {
                System.out.println("Tên không được để trống và không trùng lặp với tên hiện tại.");
            }
        }

        while (true) {
            System.out.print("Mô tả của laptop: ");
            String inputDescription = sc.nextLine();
            if (!inputDescription.isEmpty()) {
                this.description = inputDescription; // Assign to instance variable
                break;
            } else {
                System.out.println("Mô tả không được để trống.");
            }
        }

        while (true) {
            try {
                System.out.print("RAM của laptop (GB): ");
                int inputRam = Integer.parseInt(sc.nextLine());
                if (inputRam > 0) {
                    this.ram = inputRam; // Assign to instance variable
                    break;
                } else {
                    System.out.println("RAM phải lớn hơn 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Cân nặng laptop (kg): ");
                double inputWeight = Double.parseDouble(sc.nextLine());
                if (inputWeight > 0) {
                    this.weight = inputWeight; // Assign to instance variable
                    break;
                } else {
                    System.out.println("Cân nặng phải lớn hơn 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Giá của laptop: ");
                double inputPrice = Double.parseDouble(sc.nextLine());
                if (inputPrice > 0) {
                    this.laptopPrice = inputPrice; // Assign to instance variable
                    break;
                } else {
                    System.out.println("Giá phải lớn hơn 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ, vui lòng nhập lại.");
            }
        }

        while (true) {
            System.out.print("Ngày nhập kho (yyyy-MM-dd): ");
            try {
                Date inputDate = sdf.parse(sc.nextLine());
                this.createAt = inputDate; // Assign to instance variable
                break;
            } catch (ParseException e) {
                System.out.println("Ngày không hợp lệ, vui lòng nhập lại.");
            }
        }


        while (true) {
            try {
                System.out.print("Nhập loại máy tính (ID): ");
                int inputTypeId = Integer.parseInt(sc.nextLine());
                if (inputTypeId > 0) {
                    this.typeId = inputTypeId; // Assign to instance variable
                    break;
                } else {
                    System.out.println("ID loại máy tính không hợp lệ.");
                }
            } catch (NumberFormatException e) {
                System.out.println("ID không hợp lệ, vui lòng nhập lại.");
            }
        }
    }

}
