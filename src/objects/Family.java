package objects;

import java.util.ArrayList;

public class Family extends Thing {
    public Family(String name) {
        super(name);
    }

    public Family(String name, ArrayList<String> des) {
        super(name, des);
    }
}
