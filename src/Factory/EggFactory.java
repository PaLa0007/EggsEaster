package Factory;
import Eggs.*;

public class EggFactory {
    public Egg getEggType(String eggType){
        if(eggType == null){
            return null;
        }
        if(eggType.equalsIgnoreCase("Динозавърско")){
            return new DinosaurEgg();

        } else if(eggType.equalsIgnoreCase("Кокоши")){
            return new HenEgg();

        } else if(eggType.equalsIgnoreCase("Пъдпъдъчи")){
            return new QuailEgg();
        }

        return null;
    }
}
