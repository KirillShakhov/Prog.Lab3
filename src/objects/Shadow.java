package objects;

import java.util.ArrayList;

public class Shadow extends Thing {
    public Shadow(String name) {
        super(name);
    }

    private class Corner extends Thing {
        public Corner(String name) { super(name); }
        public Corner(String name, ArrayList<String> des) {
            super(name, des);
        }
    }

    public String separate(){
        Corner corner = new Corner("углу");
        corner.addDescription("темном");
        return "отделилась от "+corner.getDescription(0) + " " + corner;
    }

    public String getclose(Thing obj){
        return "подобралась поближе к " + obj;
    }

    public String seat(){
        return "села";
    }
}

