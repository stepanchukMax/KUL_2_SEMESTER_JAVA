public class Player {
    private String name;
    private double weight;

    public Player(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public double calculateWeightInPounds(){
        return this.weight*2.2;
    }

    public double modifyWeight(double increasedKilos){
        return this.weight=this.weight+increasedKilos;
    }

    public boolean isHeavier(Player player2){
        boolean isHeavier;
        if (this.weight> player2.getWeight()){
            System.out.println(this.name + " is heavier than " + player2.getName());
            isHeavier=true;
        }else{
            System.out.println(player2.getName() + " is heavier than " + this.name);
            isHeavier=false;
        }
        return isHeavier;
    }

    public void displayInformation(){
        System.out.println(this.toString());
    }


}
