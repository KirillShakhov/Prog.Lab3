package objects;

import java.util.ArrayList;

public class Something extends Thing {

    public Something(String name) {
        super(name);
    }

    public Something(String name, ArrayList<String> description) {
        super(name, description);
    }

    public String shuffled(){
        //Локальный внутренний класс
        class Floor extends Place {

            public Floor(String name) {
                super(name);
            }

            public Floor(String name, ArrayList<String> des) {
                super(name, des);
            }
        }
        return "прошаркало по "+new Floor("пол гостинной");
    }

    public String blinked(String dueto){
        return "заморгало от "+dueto;
    }

    public String shake(String wh){
        return "затрясло "+wh;
    }

    public String look(String wh){
        return "оглядывая "+wh;
    }
}
