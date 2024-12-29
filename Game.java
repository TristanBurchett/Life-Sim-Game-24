import java.util.Scanner;
import java.util.Random;

/**
 * Write a description of class Game here.
 *
 * @author
 * @version (a version number or a date)
 */
public class Game
{
    private static Random rand = new Random();
    public static int health;
    public static int happiness;
    public static int intelligence;
    public static int age;
    public static int money;
    public static boolean alive;
    public static String yourJob;
    public static boolean inPrison;
    public static int currentYrsInPrison;
    public static int pay;
    public static boolean buisness;
    public static boolean investor;

    public Game() {
        health = rand.nextInt(40, 60);
        happiness = rand.nextInt(40, 60);
        intelligence = rand.nextInt(40, 60);
        age = 0;
        yourJob = "";
        money = 0;
        alive = true;
        inPrison = false;
        currentYrsInPrison = 0;
        pay = 0;
    }

    public static void ageUp() {
        age+=1;
    }

    public static String[] babyQ1() {
        String[] txt = new String[4];
        txt[0] = "You are given food. OPTIONS:";
        txt[1] = "A. Throw it on the ground";
        txt[2] = "B. Accept it";
        txt[3] = "C. Feed it to your dog";
        return txt;
    }

    public static String[] babyQ2() {
        String[] txt = new String[4];
        txt[0] = "You are going to daycare. OPTIONS:";
        txt[1] = "A. Get really angry";
        txt[2] = "B. Go and try to make friends";
        txt[3] = "C. Go but don't make friends";
        return txt;
    }

    public static String[] babyQ3() {
        String[] txt = new String[4];
        txt[0] = "You are supposed to go to sleep, but you still feel awake. OPTIONS:";
        txt[1] = "A. Try to go to sleep";
        txt[2] = "B. Get up and play.";
        txt[3] = "C. Complain to your parents about unfair bedtime rules.";
        return txt;
    }

    public static String[] childQ1() {
        String[] txt = new String[4];
        txt[0] = "You accidently figured out the password to your Mom's phone. What do you do? OPTIONS:";
        txt[1] = "A. Put it down";
        txt[2] = "B. Download and play videogames";
        txt[3] = "C. Download a ton of malware definetely by accident";
        return txt;
    }

    public static String[] childQ2() {
        String[] txt = {
                "You have an opportunity to make some friends at school. What do you do?",
                "A. Run away as fast as possible",
                "B. Try to make friends",
                "C. Be hostile towards them for some reason."
        };

        return txt;
    }

    public static String[] childQ3() {
        String[] txt = {
                "All your friends are talking about how GTA 6 isn't coming out until 2027. What do you do?",
                "A. Complain about it with them",
                "B. Tell them that you don't care about the GTA 6 release date",
                "C. Talk about GTA 5 instead"
        };

        return txt;
    }

    public static String[] childQ4() {
        String[] txt = {
                "You observe a cat while outside. What do you do?",
                "A. Rush back inside",
                "B. Try to pet it",
                "C. Bring it some food"
        };

        return txt;
    }

    public static String[] childQ5() {
        String[] txt = {
                "You wake up early and can't fall back asleep. What do you do?",
                "A. Continue trying to fall asleep",
                "B. Play some videogames",
                "C. Wake up your parents"
        };

        return txt;
    }

    public static String[] teenQ1() {
        String[] txt = {
                "Some friends invite you over to a sleepover. What do you do?",
                "A. Stay home",
                "B. Go but don't really interact with anyone",
                "C. Talk to everyone"
        };
        return txt;
    }

    public static String[] teenQ2() {
        String[] txt = {
                "Your classmate asks you if they can cheat off your test in school. What do you do?",
                "A. Agree to help them cheat",
                "B. Help them study instead",
                "C. Report them"
        };

        return txt;
    }

    public static String[] teenQ3() {
        String[] txt = {
                "You are thinking about doing some prank calls. What do you do?",
                "A. Decide against it",
                "B. Do 100 prank calls",
                "C. Do only a few prank calls"
        };
        return txt;
    }

    public static String[] teenQ4() {
        String[] txt = {
                "Your phone breaks after you accidentally drop it off the Empire State Building on a trip to NYC. What do you do?",
                "A. Buy a new phone but don't get the iPhone 16 Pro Max because it's made of titanium for some reason",
                "B. Buy a used phone",
                "C. Try to salvage it"
        };
        return txt;
    }

    public static String[] teenQ5() {
        String[] txt = {
                "A bunch of your friends are snowboarding down a tall slope. What do you do?",
                "A. Snowboard with them",
                "B. Try to do a fancy trick",
                "C. Deny their invitation"
        };
        return txt;
    }

    public static int chooseBabyQ() {
        int babyQ = rand.nextInt(1, 3);
        return babyQ;
    }

    public static int chooseChildQ() {
        int childQ = rand.nextInt(1, 5);
        return childQ;
    }

    public static int chooseTeenQ() {
        int teenQ = rand.nextInt(1,5);
        return teenQ;
    }

    public static void displayStats() {
        System.out.println();
        System.out.println("Age: " + age);
        System.out.println("Health: " + health);
        System.out.println("Happiness: " + Game.happiness);
        System.out.println("Intelligence: " + intelligence);
        System.out.println("Money: " + money);
        if(age >= 18 && !yourJob.equals("")) {
            System.out.println("Job: " + yourJob);
        }

        else {
            System.out.println("Job: None");
        }
        System.out.println();
    }

    public static void checkIfAlive() {

        if(age < 60) {
            if(health < 10 && (rand.nextInt(5) + 1) == 3) { alive = false;}
            if(health < 20 && health > 10 && (rand.nextInt(15) + 1) == 5) {alive = false;}
            if(health < 30 && health > 20 && (rand.nextInt(20) + 1) == 5) {alive = false;}
            if(health < 40 && health > 30 && (rand.nextInt(25) + 1) == 5 && happiness < 20) {alive = false;}
            if(health < 50 && health > 40 && (rand.nextInt(30) + 1) == 5 && happiness < 20)  {alive = false;}
            if(health < 60 && health > 50 && (rand.nextInt(35) + 1) == 5 && happiness < 20) {alive = false;}
            if(health < 70 && health > 60 && (rand.nextInt(40) + 1) == 5 && happiness < 20) {alive = false;}
            if(health < 80 && health > 70 && (rand.nextInt(45) + 1) == 5 && happiness < 20) {alive = false;}
            if(health < 90 && health > 80 && (rand.nextInt(50) + 1) == 5 && happiness < 20) {alive = false;}
            if(health >= 90 && (rand.nextInt(55) + 1) == 5 && happiness < 20) {alive = false;}
        }

        else {
            if(health < 10 && (rand.nextInt(4) + 1) == 3) { alive = false;}
            if(health < 20 && health > 10 && (rand.nextInt(10) + 1) == 5) {alive = false;}
            if(health < 30 && health > 20 && (rand.nextInt(15) + 1) == 5) {alive = false;}
            if(health < 40 && health > 30 && (rand.nextInt(20) + 1) == 5) {alive = false;}
            if(health < 50 && health > 40 && (rand.nextInt(25) + 1) == 5 && happiness < 25) {alive = false;}
            if(health < 60 && health > 50 && (rand.nextInt(30) + 1) == 5 && happiness < 25) {alive = false;}
            if(health < 70 && health > 60 && (rand.nextInt(35) + 1) == 5 && happiness < 25) {alive = false;}
            if(health < 80 && health > 70 && (rand.nextInt(40) + 1) == 5 && happiness < 25) {alive = false;}
            if(health < 90 && health > 80 && (rand.nextInt(40) + 1) == 5&& happiness < 25 ) {alive = false;}
            if(health >= 90 && (rand.nextInt(45) + 1) == 5 && happiness < 25) {alive = false;}
        }

    }

    public static void yearlyFluxuations() {
        health += rand.nextInt(3 + 3 +1) -3;
        happiness += rand.nextInt(3 + 3 +1) -3;
        intelligence += rand.nextInt(3 + 3 +1) -3;
    }

    public static void chanceToLoseJob() {
        Random rand = new Random();
        if(rand.nextInt(10) + 1 == 3) {System.out.println("Your lost your job!!!"); yourJob = "";}
    }

    public static void main(String[] args) {

        // baby question cycle
        while(alive && age <= 5) {
            displayStats();
            chooseBabyQ();
            yearlyFluxuations();
            checkIfAlive();
            if(!alive) {System.out.println("you have died."); break;}
            ageUp();
        }

        // child question cycle
        while(alive && (age > 5 && age <=12)){
            displayStats();
            chooseChildQ();
            yearlyFluxuations();
            checkIfAlive();
            if(!alive) {System.out.println("you have died."); break;}
            ageUp();
        }

        // teen Q cycle
        while(alive && (age >=13 && age < 18)) {
            displayStats();
            chooseTeenQ();
            yearlyFluxuations();
            checkIfAlive();
            if(!alive) {System.out.println("you have died."); break;}
            ageUp();
        }


        // adult life cycle
        if(alive && age >= 18) {
            System.out.println("You are now an adult. Good job! You can now take actions using the Action Bar");
        }

        while(alive && age >= 18) {
            displayStats();
            System.out.println();


            if(inPrison && currentYrsInPrison > 0) {
                System.out.println("You are in prison");
                yearlyFluxuations();
                checkIfAlive();
                health-=10;
                yourJob = "";
                if(!alive) {System.out.println("You have died."); break;}
                currentYrsInPrison--;
                ageUp();
                continue;
            }

            else {

                System.out.println("ACTIONS");
                System.out.println("1. Get a Job");
                System.out.println("2. Play the Lottery");
                System.out.println("3. Take a vacation");
                System.out.println("4. Buy a House");
                System.out.println("5. Go to The Gym");
                System.out.println("6. Read a Book");
                System.out.println("7. Enjoy some leisure time");
                System.out.println("8. Commit a Crime");
                System.out.println("9. Run for Political Office");
                System.out.println("10. Age up");
                System.out.println();
                System.out.println();

                Scanner s = new Scanner(System.in);
                String option = s.nextLine();
                ActionBar bar = new ActionBar();
                switch(option) {

                    case "1": bar.getAJob(); break;
                    case "2": bar.playLottery(); break;
                    //case "3": bar.takeVacation(); break;
                    //case "4": bar.buyHouse(); break;
                    case "5": bar.goToTheGym(); break;
                    case "6": bar.readBook(); break;
                    case "7": bar.leisureTime(); break;
                    //case "8": bar.commitCrime(); break;
                   // case "9": bar.runForOffice(); break;
                    case "10":
                        yearlyFluxuations();
                        checkIfAlive();

                        if(!yourJob.equals("")) {
                            money+=pay;
                            money-=30000;
                            chanceToLoseJob();
                        }
                        else {
                            money-=25000;
                        }

                        bar.age();
                        break;
                    default: System.out.println("Incorrect selection");

                }

                if(!alive) {System.out.println("You have died.");}

            }

        }



    }
}
