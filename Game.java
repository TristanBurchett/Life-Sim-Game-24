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
    public static int health = (int)(rand.nextDouble() * 100 + 15);
    public static int happiness = (int)(rand.nextDouble() * 100 + 15);
    public static int intelligence = (int)(rand.nextDouble() * 100 + 15);
    public static int age = 0;
    public static int money = 0;
    public static boolean alive = true;
    public static String yourJob = "";
    public static boolean inPrison = false;
    public static int currentYrsInPrison = 0;
    public static int pay = 0;

    /**
     * Constructor for objects of class Game
     */
    public Game(int health, int happiness, int intelligence, int age, String yourJob, int money, boolean inPrison, int currentYrsInPrison, int pay)
    {
        health = this.health;
        happiness = this.happiness;
        intelligence = this.intelligence;
        age = this.age;
        yourJob = this.yourJob;
        money = this.money;
        inPrison = this.inPrison;
        currentYrsInPrison = this.currentYrsInPrison;
        pay = this.pay;
    }
    
    public static void ageUp() {
        age+=1;
    }
    
    public static void babyQ1() {
        System.out.println("You are given food. OPTIONS:");
        System.out.println("A. Throw it on the ground");
        System.out.println("B. Accept it");
        System.out.println("C. Feed it to your dog");
        System.out.println("What will you chose? ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch(option) {
            case "A": 
                System.out.println("Your parents are very angry. Happiness: -5");
                happiness-=5;
                break;
            case "B":
                System.out.println("Your parents congratulate you!. Health: +7");
                health+=7;
                break;
            case "C":
                System.out.println("Your parents are annoyed, but it was funny. Happiness +3. Health -3.");
                health-=3;
                happiness+=3;
                break;
            default:
                System.out.println("You did nothing");
        }
        
    }
    
    public static void babyQ2() {
        System.out.println("You are going to daycare. OPTIONS:");
        System.out.println("A. Get really angry");
        System.out.println("B. Go and try to make friends");
        System.out.println("C. Go but don't make friends");
        System.out.println("What will you chose? ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch(option) {
            case "A": 
                System.out.println("Your parents force you to go. Happiness: -7");
                happiness-=7;
                break;
            case "B":
                System.out.println("You make some friends! Nice. Happiness: +10. Intelligence +3");
                happiness+=10;
                intelligence+=3;
                break;
            case "C":
                System.out.println("It ends up going OK. You might've learned smth. Intelligence +3");
                intelligence+=3;
                break;
            default:
                System.out.println("You did nothing");
        }
    }
    
    public static void babyQ3() {
        System.out.println("You are supposed to go to sleep, but you still feel awake. OPTIONS:");
        System.out.println("A. Try to go to sleep");
        System.out.println("B. Get up and play.");
        System.out.println("C. Complain to your parents about unfair bedtime rules.");
        System.out.println("What will you chose? ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch(option) {
            case "A": 
                System.out.println("You end up falling asleep after trying for 45 mins. Health: +5. Happiness -3.");
                happiness-=3;
                health+=5;
                break;
            case "B":
                System.out.println("You ended up wandering the house without anyone noticing. Happiness +5. Health -5");
                health-=5;
                happiness+=5;
                break;
            case "C":
                System.out.println("They didn't agree with you. Happiness -3. Health -3");
                health-=3;
                happiness-=3;
                break;
            default:
                System.out.println("You did nothing");
        }
    }
    
    public static void childQ1() {
        System.out.println("You accidently figured out the password to your Mom's phone. What do you do? OPTIONS:");
        System.out.println("A. Put it down");
        System.out.println("B. Download and play videogames");
        System.out.println("C. Download a ton of malware definetely by accident");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch(option) {
            case "A":
                System.out.println("You move on with your day. Happiness -2. Intelligence +2");
                happiness-=2;
                intelligence+=2;
                break;
            case "B":
                System.out.println("You have a ton of fun, but your parents are suspicious of why there are a ton of new apps on their phone. Happiness +7");
                happiness +=7;
                break;
            case "C":
                System.out.println("Your parents are very angry at you! Happiness -5. Intelligence +3");
                happiness-=5;
                intelligence+=3;
                break;
            default:
                System.out.println("You did nothing");
        }
    }
    
    public static void childQ2() {
        System.out.println("You have an opportunity to make some friends at school. What do you do? OPTIONS:");
        System.out.println("A. Run away as fast as possible");
        System.out.println("B. Try to make friends");
        System.out.println("C. Be hostile towards them for some reason.");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        switch(option) {
            case "A":
                System.out.println("You forgot that you're in school, so you can't just run away. Happiness -3. Intelligence +=3");
                happiness-=3;
                intelligence+=3;
                break;
            case "B":
                System.out.println("You make a few friends! Nice. Happiness +7. Health +3");
                happiness+=7;
                health+=3;
                break;
            case "C":
                System.out.println("The teacher warns you. Happiness -5.");
                happiness-=5;
                break;
            default:
                System.out.println("You did nothing");
        }
    }
    
    public static void childQ3() {
        System.out.println("All your friends are talking about how GTA 6 isn't coming out until 2025. What do do? OPTIONS:");
        System.out.println("A. Complain about it with them");
        System.out.println("B. Tell them that you don't care about the GTA 6 release date");
        System.out.println("C. Talk about GTA 5 instead");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You all are pretty annoyed. Happiness -5. Health +3.");
                happiness-=5;
                health+=3;
                break;
            case "B":
                System.out.println("They ignore you. Happiness -3. Intelligence +5");
                happiness-=3;
                intelligence+=5;
                break;
            case "C":
                System.out.println("You all enjoy talking about GTA 5. Happiness +8. Health +3");
                happiness+=8;
                health+=3;
                break;
            default:
                System.out.println("You did nothing.");
        }
    }
    
    public static void childQ4() {
        System.out.println("You observe a cat while outside. What do you do? OPTIONS:");
        System.out.println("A. Rush back inside");
        System.out.println("B. Try to pet it");
        System.out.println("C. Bring it some food");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You hurry back inside to escape danger. Health -3. Intelligence +5");
                health-=3;
                intelligence+=5;
                break;
            case "B":
                System.out.println("It bites you! Health -10. Happiness -5. Intelligence +5");
                health-=10;
                happiness-=5;
                intelligence+=5;
                break;
            case "C":
                System.out.println("It is appreciative. Happiness +7");
                happiness+=7;
                break;
            default:
                System.out.println("You do nothing");
        }
    }
    
    public static void childQ5() {
        System.out.println("You wake up early and can't fall back asleep. What do you do? OPTIONS:");
        System.out.println("A. Continue trying to fall asleep");
        System.out.println("B. Play some videogames");
        System.out.println("C. Wake up your parents");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You manage to fall asleep after an hour. Happiness -5. Health +3");
                happiness-=5;
                health+=3;
                break;
            case "B":
                System.out.println("You don't get caught. It was rly fun. Happiness +8. Health -3");
                happiness+=8;
                health-=3;
                break;
            case "C":
                System.out.println("They put you back to bed. Happiness +3 Intelligence - 5");
                happiness+=3;
                intelligence-=5;
                break;
            default:
                System.out.println("You do nothing");
            
        }
    }
    
    public static void teenQ1() {
        System.out.println("Some friends invite you over to a sleepover. OPTIONS: ");
        System.out.println("A. Stay home");
        System.out.println("B. Go but don't rly interact with anyone");
        System.out.println("C. Talk to everyone");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You stay home while everyone else has fun. Happiness-5. Health +3");
                happiness-=5;
                health+=3;
                break;
            case "B":
                System.out.println("You just scroll on your phone the whole time which was pretty boring. Happiness -5. Health -5");
                happiness-=5;
                health-=5;
                break;
            case "C":
                System.out.println("You have a great time though you don't fall asleep until 3am. Happiness +7. Health -5");
                happiness+=7;
                health-=5;
                break;
            default: System.out.println("You did nothing");
        }
    }
    
    public static void teenQ2() {
        System.out.println("Your classmate asks you if they can cheat off your test in school. OPTIONS: ");
        System.out.println("A. Agree to help them cheat");
        System.out.println("B. Help them study instead");
        System.out.println("C. Report them");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You don't get caught but you don't feel great about it. Happiness -5");
                happiness-=5;
                break;
            case "B":
                System.out.println("They appreciate your help and pass the test. Happiness +5. Intelligence +3");
                happiness+=5;
                intelligence+=3;
                break;
            case "C":
                System.out.println("You reported the classmate to your teacher. Health-=3");
                health-=3;
                break;
            default: System.out.println("You ignored them.");
        }
    }
    
    public static void teenQ3() {
        System.out.println("You are thinking about doing some prank calls. OPTIONS: ");
        System.out.println("A. Decide against it");
        System.out.println("B. Do 100 prank calls");
        System.out.println("C. Do only a few prank calls");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You are glad you make this choice. Happiness + 5 Health +3");
                happiness+=5;
                health+=3;
                break;
            case "B":
                System.out.println("The people you call mostly get angry at you. Happiness -5");
                happiness-=5;
                break;
            case "C":
                System.out.println("It's pretty fun! Happiness +5 Intelligence -5");
                happiness+=5;
                intelligence-=5;
                break;
            default: System.out.println("You did nothing");
                
        }
    }
    
    public static void teenQ4() {
        System.out.println("Your phone breaks after you accidently drop it off the Empire State Building on a trip to NYC. OPTIONS: ");
        System.out.println("A. Buy a new phone but don't get the iPhone 15 Pro Max b/c it's made of titanium for some reason");
        System.out.println("B. Buy a used phone");
        System.out.println("C. Try to salvage it");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You buy a pretty nice android phone. Happiness +5. Money-600");
                happiness+=5;
                money-=600;
                break;
            case "B":
                System.out.println("You buy an old-ish iphone 11. Happiness +5. Money-550");
                happiness+=5;
                money-=550;
                break;
            case "C":
                System.out.println("It was unsalvagable. Happiness -7. Health -5");
                happiness-=7;
                health-=5;
                break;
            default: System.out.println("You did nothing");
        }
        
    }
    
    public static void teenQ5() {
        System.out.println("A bunch of your friends are snowboarding down a tall slope. OPTIONS: ");
        System.out.println("A. Snowboard with them");
        System.out.println("B. Try to do a fancy trick");
        System.out.println("C. Deny their invitation");
        Scanner s = new Scanner(System.in);
        String option = s.nextLine();
        switch(option) {
            case "A":
                System.out.println("You have a lot of fun! Happiness +7");
                happiness+=7;
                break;
            case "B":
                System.out.println("You end up breaking your arm! happiness -10. health -10");
                happiness-=10;
                health-=10;
                break;
            case "C":
                System.out.println("You deny their invitation");
                break;
            default: System.out.println("You ignore them");
        }
        
    }
    
    
    
    public static void chooseBabyQ() {
        int babyQ = rand.nextInt(3) + 1;
        switch(babyQ) {
            case 1: babyQ1(); break;
            case 2: babyQ2(); break;
            case 3: babyQ3(); break;
            default: System.out.println("Error.");
            
        }
    }
    
    public static void chooseChildQ() {
        int childQ = rand.nextInt(5) + 1;
        switch(childQ) {
            case 1: childQ1(); break;
            case 2: childQ2(); break;
            case 3: childQ3(); break;
            case 4: childQ4(); break;
            case 5: childQ5(); break;
            default: System.out.println("Error.");
            
        }
    }
    
    public static void chooseTeenQ() {
        int teenQ = rand.nextInt(5) + 1;
        switch(teenQ) {
            case 1: teenQ1(); break;
            case 2: teenQ2(); break;
            case 3: teenQ3(); break;
            case 4: teenQ4(); break;
            case 5: teenQ5(); break;
            default: System.out.println("Error.");
        }
    }
    
    public static void displayStats() {
        System.out.println();
        System.out.println("Age: " + age);
        System.out.println("Health: " + health);
        System.out.println("Happiness: " + happiness);
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
            if(health < 40 && health > 30 && (rand.nextInt(25) + 1) == 5) {alive = false;}
            if(health < 50 && health > 40 && (rand.nextInt(30) + 1) == 5) {alive = false;}
            if(health < 60 && health > 50 && (rand.nextInt(35) + 1) == 5) {alive = false;}
            if(health < 70 && health > 60 && (rand.nextInt(40) + 1) == 5) {alive = false;}
            if(health < 80 && health > 70 && (rand.nextInt(45) + 1) == 5) {alive = false;}
            if(health < 90 && health > 80 && (rand.nextInt(50) + 1) == 5) {alive = false;}
            if(health >= 90 && (rand.nextInt(55) + 1) == 5) {alive = false;}
        }
        
        else {
            if(health < 10 && (rand.nextInt(4) + 1) == 3) { alive = false;}
            if(health < 20 && health > 10 && (rand.nextInt(10) + 1) == 5) {alive = false;}
            if(health < 30 && health > 20 && (rand.nextInt(15) + 1) == 5) {alive = false;}
            if(health < 40 && health > 30 && (rand.nextInt(20) + 1) == 5) {alive = false;}
            if(health < 50 && health > 40 && (rand.nextInt(25) + 1) == 5) {alive = false;}
            if(health < 60 && health > 50 && (rand.nextInt(30) + 1) == 5) {alive = false;}
            if(health < 70 && health > 60 && (rand.nextInt(35) + 1) == 5) {alive = false;}
            if(health < 80 && health > 70 && (rand.nextInt(40) + 1) == 5) {alive = false;}
            if(health < 90 && health > 80 && (rand.nextInt(40) + 1) == 5) {alive = false;}
            if(health >= 90 && (rand.nextInt(45) + 1) == 5) {alive = false;}
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
    
    public static void checkStats() {
        if(health > 100) { health = 100;}
        if(health < 0) { health = 0;}
        if(intelligence > 100) {intelligence = 100;}
        if(intelligence < 0) {intelligence = 0;}
        if(happiness > 100) {happiness = 100;}
        if(happiness < 0) {happiness = 0;}
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Life Sim 2024 (beta release) \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a first name: ");
        String firstName = scan.nextLine();
        System.out.println("Enter a last name: ");
        String lastName = scan.nextLine();
        
        // baby question cycle
        while(alive && age <= 5) {
            displayStats();
            checkStats();
            chooseBabyQ();
            yearlyFluxuations();
            checkIfAlive();
            if(!alive) {System.out.println("you have died."); break;}
            ageUp();
        }
        
        // child question cycle
        while(alive && (age > 5 && age <=12)){
            displayStats();
            checkStats();
            chooseChildQ();
            yearlyFluxuations();
            checkIfAlive();
            if(!alive) {System.out.println("you have died."); break;}
            ageUp();
        }
        
        // teen Q cycle
        while(alive && (age >=13 && age < 18)) {
            displayStats();
            checkStats();
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
                checkStats();
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
                
                checkStats();
                Scanner s = new Scanner(System.in);
                String option = s.nextLine();
                ActionBar bar = new ActionBar();
                switch(option) {
                    case "1": bar.getAJob(); break;
                    case "2": bar.playLottery(); break;
                    case "3": bar.takeVacation(); break;
                    case "4": bar.buyHouse(); break;
                    case "5": bar.goToTheGym(); break;
                    case "6": bar.readBook(); break;
                    case "7": bar.leisureTime(); break;
                    case "8": bar.commitCrime(); break;
                    case "9": bar.runForOffice(); break;
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
