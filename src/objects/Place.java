package objects;

import interfaces.IPlace;

import java.util.ArrayList;

public class Place extends Thing implements IPlace {
    public Place(String name) {
        super(name);
    }

    public Place(String name, ArrayList<String> des) {
        super(name, des);
    }

    @Override
    public int getCoordinate() {
        return 0;
    }

    @Override
    public void setCoordinate(int i) {

    }
}
