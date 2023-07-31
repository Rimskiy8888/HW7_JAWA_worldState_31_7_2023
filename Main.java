import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Без третьей не придумал
            int num1 = 80;
            int num2 = 35;

            NumChanger numchanger = new NumChanger();
            System.out.println(NumChanger.ReplaceAll(num1, num2));


        WorldState worldState = new WorldState();
        Scanner scanner = new Scanner(System.in);
        worldState.isWorldNegativelyGood( false, true,true,false,true,false,false,false);
        worldState.isWorldNegativelyGood(true,false,false,true,false,true,false,true);

        // Подскажите, пожалуйста, как прописать чтобы значения подставлялись из этого кода :
        System.out.print("Is there UFOs above NY-city? : ");
        boolean isThereUFOsAboveNYcity1 =  scanner.nextBoolean();
        System.out.print("Do we have a good harvest? : ");
        boolean weHaveAGoodHarvest =  scanner.nextBoolean();
        System.out.print("Do we have no pandemic? : ");
        boolean weHaveNoPandemic =  scanner.nextBoolean();
        System.out.print("Is it war? : ");
        boolean isItWar =  scanner.nextBoolean();
        System.out.print("Do we have enough clean, fresh water? : ");
        boolean weHaveEnoughCleanFreshWater =  scanner.nextBoolean();
        System.out.print("Is there eruption? : ");
        boolean isThereEruption =  scanner.nextBoolean();
        System.out.print("Is there flood? : ");
        boolean isThereFlood =  scanner.nextBoolean();
        System.out.print("Is there strong earthquake? : ");
        boolean isThereStrongEarthquake =  scanner.nextBoolean();


    }
}
