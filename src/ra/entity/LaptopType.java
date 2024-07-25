package ra.entity;

import ra.util.InputMethods;


public class LaptopType {
    private static int idCounter = 1;
    private int typeId;
    private String typeName;
    private String description;
    private boolean isDeleted;

    public LaptopType() {
        this.typeId = idCounter++;
    }

    public LaptopType(int typeId, String typeName, String description, boolean isDeleted) {
        this.typeId = typeId;
        this.typeName = typeName;
        this.description = description;
        this.isDeleted = isDeleted;
    }

    public int getTypeId() {
        return typeId;
    }

    public void setTypeId(int typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(boolean deleted) {
        this.isDeleted = deleted;
    }

    public void inputData() {
        while (true) {
            System.out.print("Nhập tên loại: ");
            this.typeName = InputMethods.getString();
            if (this.typeName.isEmpty()) {
                System.err.println("Tên loại không được để trống.");
            } else {
                break;
            }
        }

        while (true) {
            System.out.print("Nhập mô tả: ");
            this.description = InputMethods.getString();
            if (this.description.isEmpty()) {
                System.err.println("Mô tả không được để trống.");
            } else {
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "LaptopType" +
                "typeId:" + typeId +
                "| typeName:" + typeName + '\'' +
                "| description:" + description + '\'' +
                "| getIsDeleted:" + isDeleted ;
    }



}
