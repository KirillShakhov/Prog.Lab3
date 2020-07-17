package objects;

import java.util.ArrayList;

public class SugarBowl extends Thing {

    public SugarBowl(String name) {
        super(name);
    }

    public SugarBowl(String name, ArrayList<String> des) {
        super(name, des);
    }

    public String fell(Thing obj){
        return "со звоном упала на " + obj;
    }
}
