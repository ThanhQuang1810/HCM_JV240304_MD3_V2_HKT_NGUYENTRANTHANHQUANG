package ra.entity;

import java.util.Date;

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
        return "Laptop{" +
                "laptopId='" + laptopId + '\'' +
                ", laptopName='" + laptopName + '\'' +
                ", description='" + description + '\'' +
                ", ram=" + ram +
                ", typeId=" + typeId +
                ", weight=" + weight +
                ", laptopPrice=" + laptopPrice +
                ", createAt=" + createAt +
                ", isDeleted=" + isDeleted +
                '}';
    }
}
