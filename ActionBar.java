import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 * Write a description of class ActionBar here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ActionBar extends Game
{
    
    public ActionBar()
    {
       super(health, happiness, intelligence, age, yourJob, money, inPrison, currentYrsInPrison, pay);
    }
    
    public static void getAJob() {
        if(age < 18) {
            System.out.println("You are not old enough to get a job");
        }
        
        else {
            HashMap<String, Integer> jobs = new HashMap<String, Integer>();
            jobs.put("Mailman", 30000);
            jobs.put("Firefighter", 43000);
            jobs.put("Police", 45300);
            jobs.put("Teacher", 42000);
            jobs.put("Writer", 37500);
            jobs.put("Retail", 31000);
            jobs.put("Stock Broker", 234123);
            jobs.put("Editor", 41093);
            jobs.put("Sales", 92424);
            jobs.put("Computer Programmer", 342103);
            
            String[] theJobs = new String[10];
            int i = 0;
            Random rand = new Random();
            
            for (String s : jobs.keySet()) {
                theJobs[i] = s;
                i++;
            }
            
            if(rand.nextInt(3) + 1 !=2 || intelligence > 95) {
                yourJob = theJobs[rand.nextInt(theJobs.length)];
                System.out.println("Your job is " + yourJob + " with a pay of " + jobs.get(yourJob));
                pay = jobs.get(yourJob);
            }
            
            else{
                System.out.println("You didn't get the job.");
            }
            
            
        }
    }
    
    public static void playLottery() {
        Random rand = new Random();
        if(money < 5) {System.out.println("You don't have enough money for the lottery");}
        else {
            money-=5;
            if(rand.nextInt(100000) + 1 == 1000) {money+=1000000; happiness+=10; System.out.println("You won a million dollars!");}
            else {System.out.println("You lost :(");
        }
    
        }
    }
    
    public static void takeVacation() {
        System.out.println("What type of vacation do you want to take. OPTIONS: ");
        System.out.println("A. Budget ($1000)");
        System.out.println("B. Medium ($5000)");
        System.out.println("C. 1st class ($10000)");
        Scanner s = new Scanner(System.in);
        String vacationType = s.nextLine();
        
        switch(vacationType) {
            case "A":
                if(money >= 1000) {money-=1000; happiness+=15;}
                else{System.out.println("You cannot afford this vacation");}
                break;
            case "B":
                if(money >= 5000) {money-=5000; happiness+=20;}
                else{System.out.println("You cannot afford this vacation");}
                break;
            case "C":
                if(money >= 10000) {money-=10000; happiness+=25;}
                else{System.out.println("You cannot afford this vacation");}
                break;
            default: System.out.println("Incorrect selection");
                
        }
    }
    
    public static void buyHouse() {
        System.out.println("There are a few house options");
        System.out.println("A. Apartment ($75k)");
        System.out.println("B. Small House ($200k)");
        System.out.println("C. Large House ($1,200,000)");
        Scanner s = new Scanner(System.in);
        String houseType = s.nextLine();
        
        switch(houseType) {
            case "A":
                if(money >=75000) {money-=75000; happiness+=10;}
                else{System.out.println("You can't afford this house");}
                break;
            case "B":
                if(money >= 200000) {money-=200000; happiness+=15;}
                else{System.out.println("You can't afford this house");}
                break;
            case "C":
                if(money >=1200000) {money-=1200000; happiness +=20;}
                else{System.out.println("You can't afford this house");}
                break;
            default: System.out.println("Incorrect selection");
        }
                
           
    }
    
    public static void goToTheGym() {
        if(money < 50) {
            System.out.println("You don't have enough money to go to the gym");
        }
        
        else {
            System.out.println("You enjoyed going to the gym. Health +5. Happiness +5. Money -50");
            health+=5;
            happiness+=5;
            money-=50;
        }
        
    }
    
    public static void readBook() {
        System.out.println("You liked your book. Happiness +5. Intelligence +5");
        happiness+=5;
        intelligence+=5;
    }
    
    public static void leisureTime() {
        System.out.println("You enjoyed your leisure time. Health +5. Happiness +7. Intelligence -3.");
        health+=5;
        happiness+=7;
        intelligence-=3;
    }
    
    public static void commitCrime() {
        System.out.println("Crime options: ");
        System.out.println("A. Steal a Car");
        System.out.println("B. Rob a Bank");
        System.out.println("C. Rob a House");
        System.out.println("D. Steal from a Store");
        
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        String crimeOption = s.nextLine();
        switch(crimeOption) {
            case "A":
                if(rand.nextInt(3) + 1 != 2) { inPrison = true; happiness-=20; currentYrsInPrison+=1; System.out.println("You have been sentenced to one year in prison");}
                else{System.out.println("You succesfully stole a car. money +40,000"); money+=40000;}
                break;
            case "B":
                if(rand.nextInt(7) + 1 != 2) { inPrison = true; happiness-=50; currentYrsInPrison+=10; System.out.println("You have been sentenced to ten years in prison");}
                else{System.out.println("You succesfully robbed a bank. money +100,000"); money+=100000;}
                break;
            case "C":
                if(rand.nextInt(4) + 1 != 2) { inPrison = true; happiness-=20; currentYrsInPrison+=1; System.out.println("You have been sentenced to one year in prison");}
                else{System.out.println("You succesfully robbed a house. money +2000"); money+=2000;}
                break;
            case "D":
                if(rand.nextInt(4) + 1 != 2) { inPrison = true; happiness-=25; currentYrsInPrison+=2; System.out.println("You have been sentenced to two years in prison");}
                else{System.out.println("You succesfully robbed a store. money +3000"); money+=3000;}
                break;
            default: System.out.println("You decided not to commit a crime");
                
        }
    }
    
    public static void runForOffice() {
        Scanner s = new Scanner(System.in);
        System.out.println("Which political office would you like to run for?");
        System.out.println("A. Local Council");
        System.out.println("B. Mayor");
        System.out.println("C. Governor");
        System.out.println("D. President");
        String option = s.nextLine();
        Random rand = new Random();
        
        switch(option) {
            case "A":
                if(money >= 50000) { 
                    if(rand.nextInt(3) + 1 != 2) {System.out.println("You lost :(");}
                    else{System.out.println("You won!"); money-=50000; yourJob=""; yourJob = "Local Council"; pay = 50000;}
                }
                else{System.out.println("You do not have enough money to run for Local Council");}
                break;
            case "B":
                if(money >= 500000) { 
                    if(rand.nextInt(4) + 1 != 2) {System.out.println("You lost :(");}
                    else{System.out.println("You won!"); money-=500000; yourJob=""; yourJob = "Mayor"; pay = 80000;}
                }
                else{System.out.println("You do not have enough money to run for Mayor");}
                break;
            case "C":
                if(money >= 1500000) { 
                    if(rand.nextInt(5) + 1 != 2) {System.out.println("You lost :(");}
                    else{System.out.println("You won!"); money-=1500000; yourJob=""; yourJob = "Governor"; pay = 200000;}
                }
                else{System.out.println("You do not have enough money to run for Governor");}
                break;
            case "D":
                if(money >= 8000000) { 
                    if(rand.nextInt(9) + 1 !=3) {System.out.println("You lost :(");}
                    else{System.out.println("You won!"); money-=8000000; yourJob=""; yourJob = "President"; pay = 1000000;}
                }
                else{System.out.println("You do not have enough money to run for President");}
                break;
            default: System.out.println("You decided not to run for political office");
                    
        }
    }
    
    public static void age() {
        age+=1;
    }
    
}
