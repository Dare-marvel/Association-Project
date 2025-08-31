// Base Human class
public class Human {
    String name;
    Organ organ;

    public Human(String name) {
        this.name = name;
        this.organ = new Organ();
    }

    void makePlan(String plan) {
        System.out.println(name + " plans to " + plan);
    }

    SpecialJuice11 useDispenser(Dispenser11 d) {
        System.out.println(name + " uses the dispenser to create a special juice...");
        return d.dispenseJuice();
    }

    void serveSpecialJuice(SpecialJuice11 j)
    {
        System.out.println(name + " serves the " + j.name + " to evaluators.");

    }

    Ticket distributeTickets() {
        return new Ticket(name);
    }

    void setUpStage(Stage stage, String details) {
        stage.setup(details);
    }

    void react() {
        {
            System.out.println(name + ": \"Wow! What an innovation. Reminds me of my mushroom curry!\"");
        }
    }
    public void eatMushroomCurry() {
        System.out.println(name + " ate Mushroom Curry!");
        organ.reactToMushroomCurry();
    }


    Hallucination drinkSpecialJuice()
    {
        System.out.println(name + " drank the hypnotising mushroom juice!");
        return new Hallucination();
    }
    public void thinks(String s)
    {
        System.out.println(name+" thinks...." + " " + s);
    }
    public void smileWeirdly() {
        System.out.println(name + " is smiling weirdly ");
    }

    public void clapToImaginaryMusic() {
        System.out.println(name + " claps hands to imaginary music");
    }


    public void panicAtVirus() {
        System.out.println(name + " panics and swings sticks at the Virus ");
    }

    // Cake related actions
    public void attendCakeParty() {
        System.out.println(name + " attends the cake party ");
    }


}

// Organ class
class Organ {
    public void reactToMushroomCurry() {
        System.out.println("Organs bouncing with joy after eating Mushroom Curry! ");
    }
}
// Student class
class Student extends Human {
    Project project; // each student may or may not have a project
    public Student(String name)
    {
        super(name);
        this.project=null;
    }
    public void doProject(Project p)
    {
      this.project=p;
    }
    public void showProject() {
        if (project != null) {
            System.out.println(name + "'s Project: " + project.getProjectName());
            System.out.println(name + " presents his project to evaluators ");

        } else {
            System.out.println(name + " has no project.");
        }
    }

}

// Evaluator class
class Evaluator extends Human {
    public Evaluator(String name) {
        super(name);
    }

    public void evaluateProject() {
        System.out.println("Evaluators evaluate the project strictly ");
    }
}

// Virus
class Virus extends Human {
    public Virus(String name) {
        super(name);
    }
}
