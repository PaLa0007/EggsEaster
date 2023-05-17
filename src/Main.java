import Eggs.Egg;
import Singleton.Rabbit;
import Observer.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException{

        Scanner scanner = new Scanner(System.in);

        Basket basket = new Basket();
        FirstDuck DuckOne = new FirstDuck();
        SecondDuck DuckTwo = new SecondDuck();
        ThirdDuck DuckThree = new ThirdDuck();

        basket.setEggsCount(0);

        basket.addObserver(DuckOne);
        basket.addObserver(DuckTwo);
        basket.addObserver(DuckThree);

        Rabbit rabbit = Rabbit.getInstance();

        System.out.print("Моля въведете колко яйца искате да бъдат в системата: ");
        var input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            Egg egg = rabbit.createEgg();
            rabbit.decorateEgg(egg);
            basket.increaseCount();
        }
    }
}