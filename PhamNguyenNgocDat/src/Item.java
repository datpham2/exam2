public class Item {
    private String name;
    private int powerIndex;
    private double powerFactor;
    private int rate;

    public Item(String name, int powerIndex, double powerFactor, int rate) {
        this.name = name;
        this.powerIndex = powerIndex;
        this.powerFactor = powerFactor;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getDestructivePower() {
        return powerIndex * powerFactor;
    }

    public double getPrice() {
        return getDestructivePower() * rate;
    }

    public String toString() {
        return "Tên vật phẩm: " + name + "\nChỉ số sức mạnh: " + powerIndex + "\nHệ số sức mạnh: " + powerFactor + "\nSố vàng quy đổi trên 1 sức công phá: " + rate
                + "\nSức công phá: " + getDestructivePower();
    }
}
