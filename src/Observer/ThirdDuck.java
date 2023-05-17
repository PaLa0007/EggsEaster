package Observer;

import java.util.Observable;
import java.util.Observer;

public class ThirdDuck implements Observer {
    public ThirdDuck() {

    }

    @Override
    public void update(Observable obj, Object arg) {
        if (arg instanceof Integer) {
            if (arg.equals(5)) {
                System.out.println("Яйцата са готови");
            }
        }
    }
}
