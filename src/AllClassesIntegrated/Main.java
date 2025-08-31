class Main {
    public static void main(String[] args)
    {
        Student ranchu = new Student("Ranchu");
        Student farhaan = new Student("Farhaan");
        Student raju = new Student("Raju");
        Evaluator evaluator1 = new Evaluator("Ev1");
        Evaluator evaluator2 = new Evaluator("Ev2");
        Virus virus=new Virus("Virus");
        System.out.println("****** 3 Idiots inspired story ******");
        ProjectEvaluation projEval = new ProjectEvaluation("Project Evaluation", "1st September 2025" , "ICE");
        projEval.announceEntry();
        ranchu.setUpStage(projEval.stage, "posters, lights, and gadgets");
        Project mushroomFarmAutomation = new Project("Mushroom Farm Automation");
        ranchu.doProject(mushroomFarmAutomation);
        ranchu.showProject();
        // Create farmer
        Farmer ranchuasFarmer = new Farmer("Ranchu");
        // Create mushrooms
        Mushroom[] mushrooms = {
                new Mushroom("Button Mushroom"),
                new Mushroom("Shiitake"),
                new Mushroom("Oyster")
        };
        // Create resources
        Electricity electricity = new Electricity("MSEB", 10); // Rs.10 per unit
        Water water = new Water(50); // 50 liters per day
        // Create farm
        MushroomFarm farm = new MushroomFarm(ranchuasFarmer);
        // Simulate farming
        Harvest harvest = farm.farmMushrooms(mushrooms, electricity, water, 7);
        // Show harvest details
        harvest.showHarvestDetails();
        farhaan.showProject();
        raju.showProject();
        ranchu.thinks("!!!!!!!!!!! Lets help Raju and Farhaan so that they don't fail !!!!!!!!!!");
        ranchu.makePlan("Hypnotize evaluators...");
//        Dispenser11 dispenser = new Dispenser11();
        Dispenser dispenser = new Dispenser();
        ranchu.useDispenser(dispenser);
        Ticket tickets = raju.distributeTickets();
        farhaan.serveSpecialJuice();
        Hallucination hallucination1 = evaluator1.drinkSpecialJuice();
        Hallucination hallucination2 = evaluator2.drinkSpecialJuice();
        MusicConcert concert = hallucination1.imagineMusicConcert();
        virus.serveCake();
        concert.startConcert();
        evaluator1.smileWeirdly();
        evaluator2.clapToImaginaryMusic();
        evaluator1.react();
        evaluator2.react();
    }
}


class Dispenser11
{
    SpecialJuice11 dispenseJuice() {
        System.out.println("Dispenser: mixing bizarre ingredients...");
        return new SpecialJuice11("Special juice");
    }
}

class SpecialJuice11
{   String name;

    SpecialJuice11(String name) {
        this.name=name;
        System.out.println("Special Juice is ready...");
    }
}
class Hallucination
{
    MusicConcert imagineMusicConcert() {
        System.out.println("Hallucination begins...");
        return new MusicConcert();
    }
}



