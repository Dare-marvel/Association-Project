class startEvent {
    public static void main(String[] args)
    {
        //created rough objects for the story flow
        Human11 ranchu = new Human11("Ranchu", "EnggStud");
        Human11 farhaan = new Human11("Farhaan", "EnggStud");
        Human11 raju = new Human11("Raju", "EnggStud");
        Human11 evaluator1 = new Human11("Ev1", "Examiner");
        Human11 evaluator2 = new Human11("Ev2", "Examiner");
        //additionally should add the virus object
        //include mushroomfarm,electricity,water objects

        //project evaluation extends event class ... (Project evaluation isA event)
        ProjectEvaluation11 projEval = new ProjectEvaluation11("Project Evaluation", "1st September 2025");
        projEval.announceEntry();
        //ranchu is setting up the stage...stage object is created in the events class (event HasA stage)
        ranchu.setUpStage(projEval.stage, "posters, lights, and gadgets");
        //defined all the methods like makePlan, useDispenser, distributeTickets in the Human class (as these are the human actions)
        ranchu.makePlan("Hypnotize evaluators...");

        Dispenser11 dispenser = new Dispenser11();
        //Dispenser producesA specialJuice
        SpecialJuice11 juice = ranchu.useDispenser(dispenser);

        //distributeTickets method is in Human class
        Ticket11 tickets = raju.distributeTickets();

        //serveSpecialJuice is in class Human
        Drinks11 drink = farhaan.serveSpecialJuice(juice, evaluator1, evaluator2);

        //produceHallucination() returns Hallucination (Drinking special juice producesA Hallucination)
        Hallucination11 hallucination = drink.produceHallucination();

        //hallucination producesA fake Music Concert
        MusicConcert11 concert = hallucination.imagineMusicConcert();
        concert.startConcert();

        //react method is also defined in Human class (representing human action)
        evaluator1.react();
        evaluator2.react();
    }
}

class Human11 {
    String name;
    String role;
    Human11(String n, String r) {
        name = n;
        role = r;
    }
    //sysout to introduce all the humans and their roles
    //include organ objects and relevant dialogues (Organs started bouncing out of joy)
    void makePlan(String plan) {
        System.out.println(name + " plans to " + plan);
    }

    SpecialJuice11 useDispenser(Dispenser11 d) {
        System.out.println(name + " uses the dispenser to create a special juice...");
        return d.dispenseJuice();
    }

    Drinks11 serveSpecialJuice(SpecialJuice11 juice, Human11... toWhom) {
        System.out.println(name + " serves the 'special juice' to evaluators.");
        for (Human11 h : toWhom) {
            System.out.println(h.name + " drinks it.");
        }
        return new Drinks11();
    }

    Ticket11 distributeTickets() {
        return new Ticket11(name);
    }

    void setUpStage(Stage11 stage, String details) {
        stage.setup(details);
    }

    void react() {
        if (role.equals("Examiner")) {
            System.out.println(name + ": \"Wow! What an innovation. Reminds me of my mushroom curry!\"");
        }
    }
}


class Stage11 {
    void setup(String details) {
        System.out.println("Stage is set with " + details + ".");
    }
}

class Event11
{
    String name;
    String date;
    Stage11 stage = new Stage11();
}

class ProjectEvaluation11 extends Event11
{
     ProjectEvaluation11(String name, String Date)
    {
        System.out.println("*************** " + name + " on " + Date + " ****************");
    }
    void announceEntry() {
        System.out.println("Evaluators enter the Events Hall, expecting boring projects");
    }
}

class Ticket11 {
    String name;
    Ticket11(String name) {
        System.out.println("Meanwhile " + name + " gives the Music Concert Tickets to the evaluators");
    }
}

class Dispenser11
{    //replace the useDispenser with the method that returns the weird juice
    SpecialJuice11 dispenseJuice() {
        System.out.println("Dispenser: mixing bizarre ingredients...");
        return new SpecialJuice11();
    }
}

class SpecialJuice11 {
    SpecialJuice11() {
        System.out.println("Special Juice is ready...");
    }
}

class Drinks11
{
    Hallucination11 produceHallucination() {
        System.out.println("Drinks cause hallucination...");
        return new Hallucination11();
    }
}

class Hallucination11
{
    MusicConcert11 imagineMusicConcert() {
        System.out.println("Hallucination begins...");
        return new MusicConcert11();
    }
}

class MusicConcert11 extends Event11 {

    Band11 mushroomBand = new Band11("Mushroom Band");


    void startConcert() {
        System.out.println("The Evaluators start imagining the Music concert happening right before them as they saw music concert tickets recently");
        mushroomBand.perform();
    }

}

class Band11 {
    String name;
    Instrument11 guitar = new Guitar11();
    Instrument11 drums = new Drums11();
    Instrument11 keyboard = new Keyboard11();
    Band11(String name)
    {
        this.name=name;
    }
    void perform() {
        System.out.println("***************** "+ name + " starts Performing ***************");
        guitar.play();
        drums.play();
        keyboard.play();
    }
}

abstract class Instrument11 {
    abstract void play();
}

class Guitar11 extends Instrument11 {
    void play()
    {
        System.out.println("******** Illusional Guitarist appears ********");
        System.out.println("Guitar looks like a giant fungi stalk...");
    }
}

class Drums11 extends Instrument11
{
    void play()
    {
        System.out.println("******** Illusional Drumer appears ********");
        System.out.println("Drums bounce like jelly mushrooms...");
    }
}

class Keyboard11 extends Instrument11 {
    void play()
    {
        System.out.println("******** Illusional Pianist appears ********");
        System.out.println("Keyboard sprouts glowing mushrooms instead of keys...");
    }
}
