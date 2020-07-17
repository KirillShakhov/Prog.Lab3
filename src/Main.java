import objects.*;

abstract class Act{
    //Статический вложенный класс
    public static class Dots {
        public static final String SPACE = " ";
        public static final String AND = " и ";
        public static final String COMMA = ", ";
        public static final String DOT = ".";
        public static final String BUT = "но";
        public static final String NOT = "нет";
    }
    abstract void one();
    abstract void two();
    abstract void three();
    abstract void four();
}

public class Main {
    /*
    Тут он осекся и выпустил из лап сахарницу, которая со звоном упала на пол.
    Все обернулись и посмотрели. Какая-то тень отделилась от стены в темном углу.
    Что-то серое и сморщенное прошаркало по полу гостиной, заморгало от солнечного света и затрясло седыми усами,
    враждебно оглядывая семью муми-троллей.
     */
    public static void main(String[] args) {
        //Анонимный класс
        Act act = new Act(){
            @Override
            void one() {
                Here here = new Here("Тут");
                He he = new He("он");
                SugarBowl sugarBowl = new SugarBowl("сахарница");

                Floor floor = new Floor("пол");

                System.out.println(here + Dots.SPACE + he + Dots.SPACE + he.oseksya() + Dots.AND + he.released(sugarBowl) + Dots.COMMA + sugarBowl + Dots.SPACE + sugarBowl.fell(floor) + Dots.DOT);
            }

            @Override
            void two() {
                Everything everything = new Everything("Все");

                System.out.println(everything + Dots.SPACE + everything.look() + Dots.AND + everything.turnBack() + Dots.DOT);
            }

            @Override
            void three() {
                Shadow shadow = new Shadow("тень");
                shadow.addDescription("Какая-то");

                Wall wall = new Wall("стена");

                System.out.println(shadow.getDescription(0) + Dots.SPACE + shadow + Dots.SPACE + shadow.separate() + Dots.DOT);
            }

            @Override
            void four() {
                Something something = new Something("Что-то");
                something.addDescription("серое");
                something.addDescription("сморщенное");

                Light light = new Light("света");
                light.addDescription("солнечого");

                Mustache mustache = new Mustache("усами");
                mustache.addDescription("седыми");

                Family family = new Family("семью муми-троллей");


                System.out.println(something + Dots.SPACE + something.getDescription(0) + Dots.AND + something.getDescription(1)
                        + Dots.SPACE + something.shuffled() + Dots.COMMA
                        + something.blinked(light.getDescription(0) + Dots.SPACE + light) + Dots.AND
                        +something.shake(mustache.getDescription(0) + Dots.SPACE + mustache) + Dots.COMMA
                        +something.look(family.toString()) + Dots.DOT);
            }
        };
        act.one();
        act.two();
        act.three();
        act.four();

        Family family = new Family("");
    }
}
