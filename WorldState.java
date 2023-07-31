import java.util.Scanner;

public class WorldState {
    public boolean isThereUFOsAboveNYcity1;
    public boolean weHaveAGoodHarvest;
    public boolean weHaveNoPandemic;
    public boolean isItWar;
    public boolean weHaveEnoughCleanFreshWater;
    public boolean isThereEruption;
    public boolean isThereFlood;
    public boolean isThereStrongEarthquake;
    public void isWorldNegativelyGood(boolean isThereUFOsAboveNYcity,boolean weHaveAGoodHarvest,boolean weHaveNoPandemic,boolean isItWar,boolean weHaveEnoughCleanFreshWater,boolean isThereEruption,boolean isThereFlood,boolean isThereStrongEarthquake){
        boolean isWorldNegativelyGood = (!isThereFlood || !isThereStrongEarthquake || !isThereEruption) && (weHaveEnoughCleanFreshWater || weHaveAGoodHarvest) || (!isItWar || weHaveNoPandemic) || !isThereUFOsAboveNYcity;
        System.out.println("Плохо ли в мире :" + isWorldNegativelyGood);
    }
    public void isWorldPositivelyGood(boolean isThereUFOsAboveNYcity,boolean weHaveAGoodHarvest,boolean weHaveNoPandemic,boolean isItWar,boolean weHaveEnoughCleanFreshWater,boolean isThereEruption,boolean isThereFlood,boolean isThereStrongEarthquake){
        boolean isWorldPositivelyGood = !(isItWar && isThereFlood && isThereEruption && isThereStrongEarthquake) && !(!weHaveEnoughCleanFreshWater && !weHaveAGoodHarvest && !weHaveNoPandemic && isThereUFOsAboveNYcity);
        System.out.println("Хорошо ли в мире :" + isWorldPositivelyGood);
    }
    public void getIsWorldNegativelyGood(){

    }
    public void getIsWorldPositivelyGood(){

    }
}
