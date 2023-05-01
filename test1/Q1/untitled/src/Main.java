public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Max",105);
        Player player2 = new Player("Yan",75);
        Player player3 = new Player("Mo",200);
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
        Player[] listOfPlayers = new Player[3];
        listOfPlayers[0] = player1;
        listOfPlayers[1] = player2;
        listOfPlayers[2] = player3;

        System.out.println(howManyHundredKilos(listOfPlayers));


    }
    public static int howManyHundredKilos(Player[] playersList){
        int counter=0;
        for (Player player : playersList){
            if (player.getWeight()>100){
                counter++;
            }
        }
        return counter;
    }
}