package objects;

import exeptions.NoNameExeption;

public abstract class Aught {
    private String name;
    public Aught(){
        throw new NoNameExeption("Отсутствует имя у класса");
    }

    public Aught(String name) {
        if(name.equals("")){throw new NoNameExeption("Отсутствует имя у класса"); }
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}
