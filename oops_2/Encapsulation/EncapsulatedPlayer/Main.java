package oops_2.Encapsulation.EncapsulatedPlayer;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200;
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 200,
                "Sword");
            // tim.healthPercentage=200; 
            // By doing private it became invisible to other classes

            // Even on changing variable names in enhanced player still u can run code here, means not depedndent on othe class

        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
