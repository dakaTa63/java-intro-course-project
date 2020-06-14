import java.util.Random;

public class squares extends players {

    public static void gameSquares() {

        int chocolateDollars = 1000;
        int bot = chocolateDollars;
        int human = chocolateDollars;


        System.out.println("Първи капан: ");
        int TrapRevision;
        TrapRevision = (bot - 100);
       // System.out.println("Бота току що загуби 10% от своя запас, остава му: " + TrapRevision);

        TrapRevision = (human - 100);
      //  System.out.println("Вие току що загуби 10% от своя запас, остава му: " + TrapRevision);
        if(bot > human){
            System.out.println("Бота току що загуби 10% от своя запас, остава му: " + TrapRevision);
        }else System.out.println("Вие току що загубихте 10% от своя запас, остават ви : " + TrapRevision);

        System.out.println("Втори капан: ");
        int catDivorce;
        Random cat = new Random();
        int randomCat = cat.nextInt(11);
        if (randomCat == 2 || randomCat == 8)
        {
            System.out.printf("няма да получите печалба ");
        }
        else System.out.println("получавате печалбата ");

    }


}
