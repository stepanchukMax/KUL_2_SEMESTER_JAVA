public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Max",82);
        Player player2 = new Player("Yan",75);
        Player player3 = new Player("Mo",77);
        System.out.println("***************************");
        System.out.println("Is Max heavier than Yan?");
        System.out.println(player1.isHeavier(player2));
        System.out.println("***************************");
        System.out.println("Is Yan heavier than Mo?");
        System.out.println(player2.isHeavier(player3));
        player2.modifyWeight(0.5);
        System.out.println("***************************");
        player3.displayInformation();
        player2.displayInformation();
        player1.displayInformation();
    }
}