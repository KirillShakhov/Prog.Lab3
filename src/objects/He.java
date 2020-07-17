package objects;

import java.util.ArrayList;

public class He extends Thing {
    public He(String name) {
        super(name);
    }

    public He(String name, ArrayList<String> des) {
        super(name, des);
    }

    public String oseksya(){
        return "осекся";
    }

    public String released(Thing obj){
        return "выпустил из лап " + obj;
    }
}
