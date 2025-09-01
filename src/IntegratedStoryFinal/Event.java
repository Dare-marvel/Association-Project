class Event
{
    String name;
    String date;
    String venue;
    Stage stage = new Stage();
}
class Stage
{
    void setup(String details) {
        System.out.println("Stage is set with " + details + ".");
    }
}
class ProjectEvaluation extends Event
{
    ProjectEvaluation(String name, String Date, String venue)
    {
        System.out.println("*************** " + name + " at " + venue + "on Date " + Date+  " ****************");
    }
    void announceEntry() {
        System.out.println("Evaluators enter the Events Hall, expecting boring projects");
    }
}
class Ticket {
    String name;
    Ticket(String name) {
        System.out.println("Meanwhile " + name + " gives the Music Concert Tickets to the evaluators");
    }
}
class MusicConcert extends Event {

    Band mushroomBand = new Band("Mushroom Band");


    void startConcert() {
        System.out.println("The Evaluators start imagining the Music concert happening right before them as they saw music concert tickets recently");
        mushroomBand.perform();
    }

}

class Band {
    String name;
    Instrument guitar = new Guitar();
    Instrument drums = new Drums();
    Instrument keyboard = new Keyboard();

    Band(String name)
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

abstract class Instrument {
    abstract void play();
}

class Guitar extends Instrument {
    void play()
    {
        System.out.println("******** Illusional Guitarist appears ********");
        System.out.println("Guitar looks like a giant fungi stalk...");
    }
}

class Drums extends Instrument
{
    void play()
    {
        System.out.println("******** Illusional Drumer appears ********");
        System.out.println("Drums bounce like jelly mushrooms...");
    }
}

class Keyboard extends Instrument {
    void play()
    {
        System.out.println("******** Illusional Pianist appears ********");
        System.out.println("Keyboard sprouts glowing mushrooms instead of keys...");
    }
}

class CakeParty extends Event{
    CakeParty()
    {
        System.out.println("***Cake Party Begins***");
    }
}