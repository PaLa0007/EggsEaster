package Observer;

import java.util.Observable;
import java.util.Observer;

public class SecondDuck implements Observer {
    public SecondDuck() {

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
