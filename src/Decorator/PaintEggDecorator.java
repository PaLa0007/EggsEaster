package Decorator;

import Eggs.Egg;

public class PaintEggDecorator extends EggDecorator {
    public PaintEggDecorator(Egg decoratedEgg) {
        super(decoratedEgg);
    }

    private void setPaintDecoration() {
        System.out.println("Вид Декорация: Боя");
    }

    @Override
    public void addEgg() {
        decoratedEgg.addEgg();
        setPaintDecoration();
    }
}
