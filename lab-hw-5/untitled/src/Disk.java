public class Disk {
    private static double vat;
    private String model;
    private int capacity;
    private double price;

    public Disk(String model, int capacity, double price) {
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    public Disk() {
        this.model = "none";
        this.capacity = 0;
        this.price = 0;
    }

    public static double getVat() {
        return vat;
    }

    public static void setVat(double vat) {
        Disk.vat = vat;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getBruttoPrice(Disk disk){
        double bruttoPrice = disk.getPrice()+ disk.getPrice()*vat;
        return bruttoPrice;
    }

    @Override
    public String toString() {
        return "Disk{" +
                "model='" + model + '\'' +
                ", capacity=" + capacity +
                '}';
    }

}
