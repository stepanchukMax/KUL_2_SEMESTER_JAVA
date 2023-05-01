public class Main {
    public static void main(String[] args) {
        Disk disk1 = new Disk("IBM", 2048,330.0);
        Disk.setVat(0.23);
        System.out.println("Your model is: ");
        System.out.println(disk1.toString());
        System.out.println("Brutto price of you disk is " + disk1.getBruttoPrice(disk1));
    }
}