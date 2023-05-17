package Singleton;

import Decorator.PaintEggDecorator;
import Decorator.StickerEggDecorator;
import Eggs.Egg;
import Factory.EggFactory;
import Util.RandomNumberGenerator;

public class Rabbit {
    private static Rabbit rabbit = new Rabbit();

    private Rabbit() {

    }

    public static Rabbit getInstance() {
        return rabbit;
    }

    EggFactory eggFactory = new EggFactory();

    Egg egg1 = eggFactory.getEggType("Динозавърско");

    public Egg createEgg() {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        Egg egg;
        int typeOfEgg = rng.eggType();

        switch (typeOfEgg) {
            case 1:
                egg = eggFactory.getEggType("Динозавърско");
                return egg;
            case 2:
                egg = eggFactory.getEggType("Кокоши");
                return egg;
            case 3:
                egg = eggFactory.getEggType("Пъдпъдъчи");
                return egg;
        }
        return null;
    }

    Egg decoratedEgg1 = new StickerEggDecorator(egg1);

    public void decorateEgg(Egg egg) {
        RandomNumberGenerator rng = new RandomNumberGenerator();
        Egg decoratedEgg;
        int typeOfDecoration = rng.decorationType();

        switch (typeOfDecoration) {
            case 1:
                decoratedEgg = new StickerEggDecorator(egg);
                decoratedEgg.addEgg();
                break;
            case 2:
                decoratedEgg = new PaintEggDecorator(egg);
                decoratedEgg.addEgg();
                break;
        }
    }
}
