package objects;
import java.util.ArrayList;

public class Wall extends Place {

    public Wall(String name) {
        super(name);
    }

    public Wall(String name, ArrayList<String> des) {
        super(name, des);
    }
}
