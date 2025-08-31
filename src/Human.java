// Base Human class
class Human {
    String name;
    Organ organ;

    public Human(String name) {
        this.name = name;
        this.organ = new Organ();
    }

    public void eatMushroomCurry() {
        System.out.println(name + " ate Mushroom Curry!");
        organ.reactToMushroomCurry();
    }

    public void drinkSpecialJuice() {
        System.out.println(name + " drank the hypnotising mushroom juice!");
        smileWeirdly();
        clapToImaginaryMusic();
        hallucinate();
    }

    public void smileWeirdly() {
        System.out.println(name + " is smiling weirdly 😏");
    }

    public void clapToImaginaryMusic() {
        System.out.println(name + " claps hands to imaginary music 👏🎶");
    }

    public void hallucinate() {
        System.out.println(name + " is hallucinating a Mushroom Band 🎸🥁🎹");
    }

    public void panicAtVirus() {
        System.out.println(name + " panics and swings sticks at the Virus 🍄🪓");
    }

    // Cake related actions
    public void attendCakeParty() {
        System.out.println(name + " attends the cake party 🎂🎉");
    }

//    public void eatCake(Cake cake) {
//        System.out.println(name + " eats cake made of " + cake.ingredients + " 🤢");
//    }
//
//    public void throwCake(Cake cake) {
//        System.out.println(name + " throws a glowing, bouncing cake at the Virus 🍰💥");
//    }
}

// Organ class
class Organ {
    public void reactToMushroomCurry() {
        System.out.println("Organs bouncing with joy after eating Mushroom Curry! ❤️🎉");
    }
}
// Student class
class Student extends Human {
    public Student(String name) {
        super(name);
    }

    public void presentProject() {
        System.out.println(name + " presents their project to evaluators 📚💡");
    }
}

// Evaluator class
class Evaluator extends Human {
    public Evaluator(String name) {
        super(name);
    }

    public void evaluateProject() {
        System.out.println(name + " evaluates the project strictly 🔍");
    }
}

// Virus (Delivery Agent)
class Virus extends Human {
    public Virus(String name) {
        super(name);
    }

//    public void deliverCake(Cake cake) {
//        System.out.println(name + " delivers cake, but appears like a rotten mushroom 🍄😱");
//    }
}