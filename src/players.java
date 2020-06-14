import java.util.Random;

public class players {

    public static void PickAPlayer(){

        Random pickAPlayer = new Random();

        int bot = pickAPlayer.nextInt(50);
        int human = pickAPlayer.nextInt(50);

        if(bot > human){
            System.out.println("Бота започва първи. ");
        }



        if(human > bot){
            System.out.println("Вие започвате първи. ");
        }

    }


}
