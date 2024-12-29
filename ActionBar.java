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
    public static HashMap<String, Integer> jobs = new HashMap<String, Integer>();

    public ActionBar()
    {
        super();
    }

    public static void createJobs() {
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
        jobs.put("Graphic Designer", 101843);
        jobs.put("Social Media", new Random().nextInt(5000, 50000));
        jobs.put("Realtor", 87609);
    }

    public static void getAJob() {
        if(age < 18) {
            System.out.println("You are not old enough to get a job");
        }

        else {

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

    public static int playLottery() {
        Random rand = new Random();
        if(money < 5) {return 0;}
        else {
            money-=5;
            if(rand.nextInt(100000) + 1 == 1000) {money+=1000000; happiness+=10; return 1000000;}
            else {return 0;}
        }

    }

    public static void takeVacation(String typeVacation) {
        switch (typeVacation) {
            case "A. Budget ($1000)": money -= 1000; happiness += 15;
            case "B. Medium ($5000)": money -= 5000; happiness += 20;
            case "C. 1st class ($10000)": money -= 10000; happiness += 25;
            default: System.out.println("stderr: typevacation not defined as Std:Type:type");
        }
    }

    public static void buyHouse(String house) {
        switch(house) {
            case "A. Apartment ($75k)":
                if(money >=75000) {money-=75000; happiness+=10;}
                else{System.out.println("You can't afford this house");}
                break;
            case "B. Small House ($200k)":
                if(money >= 200000) {money-=200000; happiness+=15;}
                else{System.out.println("You can't afford this house");}
                break;
            case "C. Large House ($1,200,000)":
                if(money >=1200000) {money-=1200000; happiness +=20;}
                else{System.out.println("You can't afford this house");}
                break;
            default: System.out.println("Incorrect selection");
        }


    }

    public static void goToTheGym() {
            health+=3;
            happiness+=5;
            money-=50;
    }

    public static void readBook() {
        happiness+=5;
        intelligence+=5;
    }

    public static void leisureTime() {
        System.out.println();
        health+=3;
        happiness+=7;
        intelligence-=3;
    }

    public static String commitCrime(String crime) {
        Random rand = new Random();
        switch(crime) {
            case "A. Steal a Car":
                if(rand.nextInt(3) + 1 != 2) { inPrison = true; happiness-=20; currentYrsInPrison+=1; return "You have been sentenced to one year in prison";}
                else{money+=40000; return "You succesfully stole a car. money +40,000";}
            case "B. Rob a Bank":
                if(rand.nextInt(7) + 1 != 2) { inPrison = true; happiness-=50; currentYrsInPrison+=10; return "You have been sentenced to ten years in prison";}
                else{ money+=100000; return "You succesfully robbed a bank. money +100,000";}
            case "C. Rob a House":
                if(rand.nextInt(4) + 1 != 2) { inPrison = true; happiness-=20; currentYrsInPrison+=1; return "You have been sentenced to one year in prison";}
                else{ money+=2000; return "You succesfully robbed a house. money +2000";}
            case "D. Steal from a Store":
                if(rand.nextInt(4) + 1 != 2) { inPrison = true; happiness-=25; currentYrsInPrison+=2; return "You have been sentenced to two years in prison";}
                else{money+=3000; return "You succesfully robbed a store. money +3000";}
            default: return "You decided not to commit a crime";

        }
    }

    public static String runForOffice(String politicalOffice) {

        Random rand = new Random();
        switch(politicalOffice) {
            case "A. Local Council":
                if(money >= 50000) {
                    if(rand.nextInt(3) + 1 != 2) {return "You lost :(";}
                    else{money-=50000; yourJob=""; yourJob = "Local Council"; pay = 50000; return "You won!";}
                }
                else{return "You do not have enough money to run for Local Council";}
            case "B. Mayor":
                if(money >= 500000) {
                    if(rand.nextInt(4) + 1 != 2) {return "You lost :(";}
                    else{money-=500000; yourJob = "Mayor"; pay = 80000; return "You won!";}
                }
                else{return "You do not have enough money to run for Mayor";}
            case "C. Governor":
                if(money >= 1500000) {
                    if(rand.nextInt(5) + 1 != 2) {return "You lost :(";}
                    else{money-=1500000; yourJob=""; yourJob = "Governor"; pay = 200000; return "You won!";}
                }
                else{return "You do not have enough money to run for Governor";}
            case "D. President":
                if(money >= 8000000) {
                    if(rand.nextInt(9) + 1 !=3) {return "You lost :(";}
                    else{money-=8000000; yourJob=""; yourJob = "President"; pay = 1000000; return "You won!";}
                }
                else{return "You do not have enough money to run for President";}

            default: return "You decided not to run for political office";
        }
    }

    public static void age() {
        age+=1;
    }


    public static void main(String[] args) {
    }
}
