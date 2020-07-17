package objects;
import exeptions.NoFoundExeption;
import interfaces.IThing;
import java.util.ArrayList;

public class Thing extends Aught implements IThing {
    private String name;
    private ArrayList<String> description = new ArrayList<>();

    public Thing(String name) {
        super(name);
    }

    public Thing(String name, ArrayList<String> des) {
        super(name);
        this.description = des;
    }

    public String getDescription(int i){
        //TODO: так не делают
        try {
            if(!description.get(i).equals("")){
                return this.description.get(i);
            }
            else{
                throw new NoFoundExeption("Характеристика");
            }
        }
        catch (NoFoundExeption e){
            return e.getMessage();
        }
    }
    public void addDescription(String des){
        this.description.add(des);
    }

    @Override
    public String toString() {
        return this.getName();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        else{
            Thing o = (Thing)obj;
            return this.getName().equals(o.getName())&this.equals(o);
        }
    }

    @Override
    public int hashCode() {
        int result = 14;
        result += this.getName().hashCode() * 14;
        result += this.getDescription(0).hashCode() * 14;
        return result;
    }
}
