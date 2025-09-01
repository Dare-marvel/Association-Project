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

    void useDispenser(Dispenser d) {
        System.out.println(name + " uses the dispenser to create a special Hypnotic juice...");
        d.prepareWeirdDrink();
    }

    void serveSpecialJuice()
    {
        System.out.println(name + " serves the hypnotic juice to evaluators.");

    }

    void serveCake(){
        System.out.println(this.name + " is now going to serve the cake, the preparation has begun");
        Oven1 oven = new Oven1();

        Ingredient[] ingredients = {
                new Ingredient("Flour", 500),
                new Ingredient("Butter", 100),
                new Ingredient("Sugar", 200),
                new Ingredient("Cocoa Powder", 100)
        };

        CakeDefinition def = new CakeDefinition("Mushroom", "Square", 1, "Thai Chillis");
        Electricity1 e = new Electricity1("Reliance", 8);

        Cake1 cake = oven.bakeCake(def, ingredients, e);
//        Cake1 cake1 = oven.bakeCake(def, ingredients);

        cake.cakeInfo();
        System.out.println(this.name + " has served the cake");
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
        System.out.println("Evaluator  panics, seeing the Virus as a rotten Mushroom and swing sticks and dodge glowing Cakes!");
    }
        public void sneakAndComment() {
        System.out.println("Meanwhile, Rancho, Farhaan, and Raju sneaked past the chaos, laughing: "
                + "\"This is even more fun than Chatur\'s Teacher\'s Day speech!");
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


