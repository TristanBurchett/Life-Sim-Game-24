import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GameGUI {
    private static JFrame frame = new JFrame();
    private static String name = "LifeSim25 LLC";
    private static String stats = "STATS \n";
    private static Game game = new Game();

    private static void frameStarters() {
        frame.setTitle("Life Simulator 2025");
        frame.setSize(400, 450);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(Color.GREEN);
    }

    private static void gameInit(JPanel mainGame, JLabel gameText) {
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());
        inputPanel.setPreferredSize(new Dimension(150, 40));

        JLabel promptLabel = new JLabel("Enter your name:");
        JTextField nameInput = new JTextField();
        nameInput.setPreferredSize(new Dimension(100, 25));

        inputPanel.add(promptLabel);
        inputPanel.add(nameInput);

        frame.add(inputPanel, BorderLayout.CENTER);
        frame.revalidate();
        frame.repaint();

        nameInput.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = nameInput.getText();
                JOptionPane.showMessageDialog(frame, "Your name is " + name);

                // Update the main game panel with name and stats
                updateGameText(gameText);
                frame.remove(inputPanel);
                frame.add(mainGame, BorderLayout.CENTER);
                frame.revalidate();
                frame.repaint();
            }
        });
    }

    private static void liveYear(JLabel gameText) {
        String[] options = {};

        // BABY DIALOGS
        if (game.age >= 0 && game.age <= 5) {
            int q = game.chooseBabyQ();
            switch (q) {
                case 1 -> options = game.babyQ1();
                case 2 -> options = game.babyQ2();
                case 3 -> options = game.babyQ3();
                default -> System.out.println("stderr:OUT question not found");
            }

            String selectedOption = (String) JOptionPane.showInputDialog(
                    null,
                    "Baby Life",
                    "What will you do?",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (selectedOption != null) {
                if (selectedOption.equals("A. Throw it on the ground")) {
                    JOptionPane.showMessageDialog(null, "Your parents are very angry. Game.happiness: -5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                }
                else if (selectedOption.equals("B. Accept it")) {
                    JOptionPane.showMessageDialog(null, "Your parents congratulate you!. Health: +5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.health+=5;
                }
                else if (selectedOption.equals("C. Feed it to your dog")) {
                    JOptionPane.showMessageDialog(null, "Your parents are annoyed, but it was funny. Happiness +3. Health -3.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.health-=3;
                    game.happiness+=3;
                }
                else if (selectedOption.equals("A. Get really angry")) {
                    JOptionPane.showMessageDialog(null, "Your parents force you to go. Happiness: -7", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=7;
                }
                else if (selectedOption.equals("B. Go and try to make friends")) {
                    JOptionPane.showMessageDialog(null, "You make some friends! Nice. Happiness: +10. Intelligence +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=10;
                    game.intelligence+=3;
                }
                else if (selectedOption.equals("C. Go but don't make friends")) {
                    JOptionPane.showMessageDialog(null, "It ends up going OK. You might've learned smth. Intelligence +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.intelligence+=3;
                }
                else if (selectedOption.equals("A. Try to go to sleep")) {
                    JOptionPane.showMessageDialog(null, "You end up falling asleep after trying for 45 mins. Health: +5. Happiness -3.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.health+=5;
                    game.happiness-=3;
                }
                else if (selectedOption.equals("B. Get up and play.")) {
                    JOptionPane.showMessageDialog(null, "You ended up wandering the house without anyone noticing. Happiness +5. Health -5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=5;
                    game.health-=5;
                }
                else if (selectedOption.equals("C. Complain to your parents about unfair bedtime rules.")) {
                    JOptionPane.showMessageDialog(null, "They didn't agree with you. Happiness -3. Health -3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=3;
                    game.health-=3;
                }
                else{}
                updateGameText(gameText);
            }
        }

        // CHILD DIALOGS
        else if (game.age > 5 && game.age < 13) {
            int q = game.chooseChildQ();
            switch (q) {
                case 1 -> options = game.childQ1();
                case 2 -> options = game.childQ2();
                case 3 -> options = game.childQ3();
                case 4 -> options = game.childQ4();
                case 5 -> options = game.childQ5();
                default -> System.out.println("stderr:OUT question not found");
            }

            String selectedOption = (String) JOptionPane.showInputDialog(
                    null,
                    "Child Life",
                    "What will you do?",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (selectedOption != null) {
                if (selectedOption.equals("A. Put it down")) {
                    JOptionPane.showMessageDialog(null, "You move on with your day. Happiness -2. Intelligence +2", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=2;
                    game.intelligence+=2;
                }
                else if (selectedOption.equals("B. Download and play videogames")) {
                    JOptionPane.showMessageDialog(null, "You have a ton of fun, but your parents are suspicious of why there are a ton of new apps on their phone. Happiness +7", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=7;
                }
                else if (selectedOption.equals("C. Download a ton of malware definetely by accident")) {
                    JOptionPane.showMessageDialog(null, "Your parents are very angry at you! Happiness -5. Intelligence +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                    game.intelligence+=3;
                }
                else if (selectedOption.equals(("A. Run away as fast as possible"))) {
                    JOptionPane.showMessageDialog(null, "You forgot that you're in school, so you can't just run away. Happiness -3. Intelligence +=3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=3;
                    game.intelligence+=3;
                }
                else if (selectedOption.equals(("B. Try to make friends"))) {
                    JOptionPane.showMessageDialog(null, "You make a few friends! Nice. Happiness +7. Health +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=7;
                    game.health+=3;
                }
                else if (selectedOption.equals(("C. Be hostile towards them for some reason."))) {
                    JOptionPane.showMessageDialog(null, "The teacher warns you. Happiness -5.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                }
                else if (selectedOption.equals(("A. Complain about it with them"))) {
                    JOptionPane.showMessageDialog(null, "You all are pretty annoyed. Happiness -5. Health +3.", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                    game.health+=3;
                }
                else if (selectedOption.equals(("B. Tell them that you don't care about the GTA 6 release date"))) {
                    JOptionPane.showMessageDialog(null, "They ignore you. Happiness -3. Intelligence +5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=3;
                    game.intelligence+=5;
                }
                else if (selectedOption.equals(("C. Talk about GTA 5 instead"))) {
                    JOptionPane.showMessageDialog(null, "You all enjoy talking about GTA 5. Happiness +8. Health +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=8;
                    game.health+=3;
                }
                else if (selectedOption.equals(("A. Rush back inside"))) {
                    JOptionPane.showMessageDialog(null, "You hurry back inside to escape danger. Health -3. Intelligence +5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.intelligence+=5;
                    game.health-=3;
                }
                else if (selectedOption.equals(("B. Try to pet it"))) {
                    JOptionPane.showMessageDialog(null, "It bites you! Health -10. Happiness -5. Intelligence +5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.health-=10;
                    game.happiness-=5;
                    game.intelligence+=5;
                }
                else if (selectedOption.equals(("C. Bring it some food"))) {
                    JOptionPane.showMessageDialog(null, "It is appreciative. Happiness +7", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=7;
                }
                else if (selectedOption.equals(("A. Continue trying to fall asleep"))) {
                    JOptionPane.showMessageDialog(null, "You manage to fall asleep after an hour. Happiness -5. Health +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                    game.health+=3;
                }
                else if (selectedOption.equals(("B. Play some videogames"))) {
                    JOptionPane.showMessageDialog(null, "You don't get caught. It was rly fun. Happiness +8. Health -3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=8;
                    game.health-=3;
                }
                else if (selectedOption.equals(("C. Wake up your parents"))) {
                    JOptionPane.showMessageDialog(null, "They put you back to bed. Happiness +3 Intelligence - 5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=3;
                    game.intelligence-=5;
                }
                else{}

            }
        }

        // TEEN DIALOGS
        else if (game.age >= 13 && game.age < 18) {
            int q = game.chooseTeenQ();
            switch (q) {
                case 1 -> options = game.teenQ1();
                case 2 -> options = game.teenQ2();
                case 3 -> options = game.teenQ3();
                case 4 -> options = game.teenQ4();
                case 5 -> options = game.teenQ5();
                default -> System.out.println("stderr:OUT question not found");
            }

            String selectedOption = (String) JOptionPane.showInputDialog(
                    null,
                    "Child Life",
                    "What will you do?",
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    options,
                    options[0]
            );

            if (selectedOption != null) {
                if (selectedOption.equals(("A. Stay home"))) {
                    JOptionPane.showMessageDialog(null, "You stay home while everyone else has fun. Happiness-5. Health +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                    game.health+=3;
                }
                else if (selectedOption.equals(("B. Go but don't really interact with anyone"))) {
                    JOptionPane.showMessageDialog(null, "You just scroll on your phone the whole time which was pretty boring. Happiness -5. Health -5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                    game.health-=5;
                }
                else if (selectedOption.equals(("C. Talk to everyone"))) {
                    JOptionPane.showMessageDialog(null, "You have a great time though you don't fall asleep until 3am. Happiness +7. Health -5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=7;
                    game.happiness-=5;
                }
                else if (selectedOption.equals(("A. Agree to help them cheat"))) {
                    JOptionPane.showMessageDialog(null, "You don't get caught but you don't feel great about it. Happiness -5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                }
                else if (selectedOption.equals(("B. Help them study instead"))) {
                    JOptionPane.showMessageDialog(null, "They appreciate your help and pass the test. Happiness +5. Intelligence +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=5;
                    game.intelligence+=3;
                }
                else if (selectedOption.equals(("C. Report them"))) {
                    JOptionPane.showMessageDialog(null, "You reported the classmate to your teacher. Health -3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.health-=3;
                }
                else if (selectedOption.equals(("A. Decide against it"))) {
                    JOptionPane.showMessageDialog(null, "You are glad you make this choice. Happiness + 5 Health +3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=5;
                    game.health+=3;
                }
                else if (selectedOption.equals(("B. Do 100 prank calls"))) {
                    JOptionPane.showMessageDialog(null, "The people you call mostly get angry at you. Happiness -5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=5;
                }
                else if (selectedOption.equals(("C. Do only a few prank calls"))) {
                    JOptionPane.showMessageDialog(null, "It's pretty fun! Happiness +5 Intelligence -3", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=5;
                    game.intelligence-=3;
                }
                else if (selectedOption.equals(("A. Buy a new phone but don't get the iPhone 16 Pro Max because it's made of titanium for some reason"))) {
                    JOptionPane.showMessageDialog(null, "You buy a pretty nice android phone. Happiness +5. Game.money-600", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=5;
                    game.money -=600;
                }
                else if (selectedOption.equals(( "B. Buy a used phone"))) {
                    JOptionPane.showMessageDialog(null, "You buy an old-ish iphone 11. Happiness +5. Game.money-550", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=5;
                    game.money -= 550;
                }
                else if (selectedOption.equals(("C. Try to salvage it"))) {
                    JOptionPane.showMessageDialog(null, "It was unsalvagable. Happiness -7. Health -5", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=7;
                    game.health-=5;
                }
                else if (selectedOption.equals(("A. Snowboard with them"))) {
                    JOptionPane.showMessageDialog(null, "You have a lot of fun! Happiness +7", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness+=7;
                }
                else if (selectedOption.equals(("B. Try to do a fancy trick"))) {
                    JOptionPane.showMessageDialog(null, "You end up breaking your arm! happiness -10. health -10", "Message", JOptionPane.INFORMATION_MESSAGE);
                    game.happiness-=10;
                    game.health -= 10;
                }
                else if (selectedOption.equals(("C. Deny their invitation"))) {
                    JOptionPane.showMessageDialog(null, "You deny their invitation", "Message", JOptionPane.INFORMATION_MESSAGE);
                }
                else {
                }

            }
        }

        // adult -- increase money
        else {
            game.money += game.pay;
        }
    }

    private static void updateGameText(JLabel gameText) {
        stats = "Age: " + game.age + "<br>Health: " + game.health +
                "<br>Happiness: " + game.happiness +
                "<br> Money: " + game.money +
                "<br> Health: " + game.health +
                "<br>Intelligence: " + game.intelligence;
        gameText.setText("<html>Your name is " + name + "<br>" + stats + "</html>");
    }

    private static void constrainStats() {
        game.happiness = Math.max(0, Math.min(100, game.happiness));
        game.intelligence = Math.max(0, Math.min(100, game.intelligence));
        game.health = Math.max(0, Math.min(100, game.health));
    }

    public static void main(String[] args) {
        frameStarters();

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.BLUE);
        bottomPanel.setPreferredSize(new Dimension(frame.getWidth(), 40));

        JButton startLife = new JButton("Start a new life");

        JPanel mainGame = new JPanel();
        mainGame.setBackground(Color.LIGHT_GRAY);
        mainGame.setLayout(new BorderLayout());

        stats = "Age: " + game.age + "<br>Health: " + game.health +
                "<br>Happiness: " + game.happiness +
                "<br> Money: " + game.money +
                "<br> Health: " + game.health +
                "<br>Intelligence: " + game.intelligence;
        JLabel gameText = new JLabel("<html>" + stats + "</html>");
        mainGame.add(gameText, BorderLayout.WEST);

        startLife.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "You have started a new life!");
                startLife.setEnabled(false);
                bottomPanel.remove(startLife);
                frame.revalidate();
                frame.repaint();

                gameInit(mainGame, gameText);
            }
        });

        // AGING UP AND CHECKS FOR EACH YEAR
        JButton ageUp = new JButton("AGE UP");
        JButton actions = new JButton("Take an action");
        JButton prisonBar = new JButton("Try to escape from prison!");

        ageUp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                game.age++;
                liveYear(gameText);
                game.yearlyFluxuations();
                game.money -= 0.2 * game.pay;
                constrainStats();
                game.checkIfAlive();
                updateGameText(gameText);

                // Handle prison state
                if (game.currentYrsInPrison > 0) {
                    // Disable actions and add prison escape button
                    actions.setEnabled(false);
                    bottomPanel.add(prisonBar);
                    frame.revalidate(); // Ensure the UI is updated
                    frame.repaint();

                    // Prison escape logic
                    prisonBar.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            Random r = new Random();
                            if (r.nextInt(1, 5) == 3) { // 1 in 4 chance to escape
                                JOptionPane.showMessageDialog(null, "You escaped from prison and are on the run!", "Escaped!", JOptionPane.INFORMATION_MESSAGE);
                                bottomPanel.remove(prisonBar); // Remove the button after escaping
                                actions.setEnabled(true); // Enable actions again
                                game.currentYrsInPrison = 0; // Reset prison time
                                frame.revalidate(); // Update UI after removal
                                frame.repaint();
                            } else {
                                JOptionPane.showMessageDialog(null, "You were caught trying to escape. Sentence + 1 year", "Caught!", JOptionPane.INFORMATION_MESSAGE);
                                game.currentYrsInPrison++; // Increase prison time
                            }
                        }
                    });
                } else {
                    // If not in prison, ensure actions are enabled
                    actions.setEnabled(true);

                    if (game.currentYrsInPrison == 0) {
                        bottomPanel.remove(prisonBar); // Remove the escape button if not in prison
                        frame.revalidate();
                        frame.repaint();
                    }
                }

                // Check if player has died
                if (!game.alive) {
                    JOptionPane.showMessageDialog(null, "You have died :(", "Died", JOptionPane.INFORMATION_MESSAGE);
                    ageUp.setEnabled(false);
                    actions.setEnabled(false);
                }

                // Add actions button when age is 18+ and not in prison
                if (game.age >= 18 && game.currentYrsInPrison == 0) {
                    if (!bottomPanel.isAncestorOf(actions)) {
                        bottomPanel.add(actions);
                        frame.revalidate();
                        frame.repaint();
                    }
                }

                // Job logic
                if (!game.yourJob.isEmpty()) {
                    game.money += game.pay;
                }

                // Random event: Lose job
                Random r = new Random();
                if (r.nextInt(1, 5) == 3 && !game.yourJob.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "You lost your job!");
                    game.yourJob = ""; // Reset job
                    game.pay = 0; // Reset salary
                }

                // Random event : buisness
                if (game.buisness) {
                    game.money += new Random().nextDouble(-0.05, 0.05) * game.money;
                }

                if (game.investor) {
                    game.money += new Random().nextDouble(0, 0.05 * game.money);
                }

                String[] randomEvents = {
                        "You won a small lottery prize! +$500.",
                        "You found a wallet on the ground. You return it to its owner and gain some good karma.",
                        "You lost your phone and had to buy a new one. -$300.",
                        "You accidentally bumped into a celebrity and got an autograph!",
                        "A friend invited you to a weekend trip. Happiness +10, Money -$200.",
                        "You met someone famous at a party. Your social standing increases.",
                        "You were caught in a car accident. Health -10, Money -$500.",
                        "A hurricane damages your house. Health -5, Money -$2000.",
                        "You helped a stray animal. Happiness +5.",
                        "Your childhood friend returns to town. Happiness +10.",
                        "You missed an important deadline at work. Intelligence -5, Happiness -5.",
                        "You got a surprise inheritance! +$2000.",
                        "A fire broke out in your apartment. Health -15, Money -$1000.",
                        "You volunteered at a soup kitchen. Happiness +5, Social standing +2.",
                        "You had a medical emergency. Health -20, Money -$1500.",
                        "You were the victim of identity theft. Money -$1000.",
                        "You were promoted at work! Salary increased by +$500 per month.",
                        "You got a perfect score on your test. Intelligence +7.",
                        "You lost your job. Money -$1000, Happiness -5.",
                        "You found a treasure map. Money +$2000, Happiness +5.",
                        "You fell seriously ill. Health -20, Money -$500.",
                        "You were fined for jaywalking. Money -$100.",
                        "You got a significant raise at work. Money +$2000.",
                        "You were scammed online. Money -$300.",
                        "Your pet ran away! Happiness -10.",
                        "You just missed your train. Time wasted, Happiness -5.",
                        "You won an all-expenses-paid trip to a luxury resort! Happiness +15, Money -$5000.",
                        "A close friend betrayed you. Happiness -10.",
                        "You found an old letter from a lost relative. Happiness +5.",
                        "You decided to buy a new car! Money -$10,000, Happiness +15.",
                        "You adopted a pet. Happiness +10, Money -$200."
                };

                if (game.age > 16) {
                    JOptionPane.showMessageDialog(null, randomEvents[new Random().nextInt(0, randomEvents.length)]);
                }
            }
        });

        String[] potentialActions = {"1. Get a Job", "2. Play the Lottery", "3. Take a Vacation",
                "4. Buy a House", "5. Go to the Gym", "6. Read a Book", "7. Enjoy some Leisure Time", "8. Commit a Crime",
                "9. Run for Political Office", "10. Go on a date with someone", "11. Start a buisness", "12. Invest in stocks",
                "13. Do something risky"
        };


        // ADULT ACTIONS
        String actionSelected = null;

        actions.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String actionSelected = (String) JOptionPane.showInputDialog(
                        null,
                        "Now that you're an adult, you can do more things.",
                        "What will you do?",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        potentialActions,
                        potentialActions[0]
                );

                if (actionSelected != null) {
                    switch (actionSelected) {
                        case "1. Get a Job" -> {
                            ActionBar.createJobs();
                            String jobSelected = (String) JOptionPane.showInputDialog(
                                    null,
                                    "List of jobs",
                                    "Get a job",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    ActionBar.jobs.keySet().toArray(),
                                    ActionBar.jobs.keySet().toArray()[0]
                            );
                            if (jobSelected != null) {
                                if (new Random().nextInt(0, 100) < game.intelligence) {
                                    JOptionPane.showMessageDialog(null, "You got the job!: ");
                                    game.pay = ActionBar.jobs.get(jobSelected);
                                } else {
                                    JOptionPane.showMessageDialog(null, "You did not get the job for job: " + jobSelected);
                                }
                            }
                        }

                        case "2. Play the Lottery"-> {
                            if (ActionBar.playLottery() != 0) {
                                JOptionPane.showMessageDialog(null, "You won a million dollars!");
                                game.money += 1000000;
                            } else {
                                JOptionPane.showMessageDialog(null, "You didn't win :(");
                            }
                        }

                        case "3. Take a Vacation" -> {
                            String[] vacationTypes = {"A. Budget ($1000)", "B. Medium ($5000)", "C. 1st class ($10000)"};
                            String vacationType = (String) JOptionPane.showInputDialog(
                                    null,
                                    "Vacation",
                                    "Go on a vacation!",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    vacationTypes,
                                    vacationTypes[0]
                            );
                            if (vacationType != null) {
                                ActionBar.takeVacation(vacationType);
                                JOptionPane.showMessageDialog(null, "You took a : " + vacationType + " vacation!");
                            }
                        }

                        case "4. Buy a House" -> {
                            String[] houseOptions = {"A. Apartment ($75k)", "B. Small House ($200k)", "C. Large House ($1,200,000)"};
                            String house = (String) JOptionPane.showInputDialog(
                                    null,
                                    "Buy a house!",
                                    "house time",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    houseOptions,
                                    houseOptions[0]
                            );

                            if (house != null) {
                                ActionBar.buyHouse(house);
                                JOptionPane.showMessageDialog(null, "You bought a " + house + " if you could afford it.");
                                game.happiness += 7;
                                game.health += 3;
                            }
                        }

                        case "5. Go to the Gym" -> {
                            if (game.money > 50) {
                                ActionBar.goToTheGym();
                                JOptionPane.showMessageDialog(null, "You went to the gym! Happiness +5 Health +3. Money -50");
                            } else {
                                JOptionPane.showMessageDialog(null, "You couldn't go to the gym because you only have $" + game.money);
                            }
                        }

                        case "6. Read a Book" -> {
                            ActionBar.readBook();
                            JOptionPane.showMessageDialog(null, "You liked your book. Happiness +5. Intelligence +5");
                        }

                        case "7. Enjoy some Leisure Time" -> {
                            ActionBar.leisureTime();
                            JOptionPane.showMessageDialog(null, "You enjoyed your leisure time. Health +3. Happiness +7. Intelligence -3.");
                        }

                        case "8. Commit a Crime" -> {
                            String[] crimeOptions = {"A. Steal a Car", "B. Rob a Bank", "C. Rob a House", "D. Steal from a Store"};
                            String crime = (String) JOptionPane.showInputDialog(
                                    null,
                                    "You just got hit by you just got hit by ... a smooth criminal",
                                    "Crime",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    crimeOptions,
                                    crimeOptions[0]
                            );

                            if (crime != null) {
                                JOptionPane.showMessageDialog(null, ActionBar.commitCrime(crime));
                            }
                        }

                        case "9. Run for Political Office" -> {
                            String[] polticalOptions = {"A. Local Council", "B. Mayor", "C. Governor", "D. President"};
                            String politics = (String) JOptionPane.showInputDialog(
                                    null,
                                    "Politics",
                                    "Politics",
                                    JOptionPane.QUESTION_MESSAGE,
                                    null,
                                    polticalOptions,
                                    polticalOptions[0]
                            );

                            if (politics != null) {
                                JOptionPane.showMessageDialog(null, ActionBar.runForOffice(politics));
                            }
                        }

                        case "10. Go on a date with someone" -> {
                            if (new Random().nextBoolean()) {
                                JOptionPane.showMessageDialog(null, "It went well! Happiness +7 Health -3");
                                game.happiness += 7;
                                game.health -=3;
                            } else {
                                JOptionPane.showMessageDialog(null, "It didn't go  well! Happiness -7");
                                game.happiness -= 5;
                            }
                        }

                        case "11. Start a buisness" -> {
                            if (game.money > 100000) {
                                JOptionPane.showMessageDialog(null, "You started a buisness!");
                                game.buisness = true;
                            } else {
                                JOptionPane.showMessageDialog(null, "You need at least $100k to start a buisness");
                            }
                        }

                        case "12. Invest in stocks" -> {
                            int stockMoney = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter your how much you'd like to invest:"));
                            if (game.money < stockMoney) {
                                JOptionPane.showMessageDialog(null, "You don't have that much money.");
                            }
                            else {
                                double gainLoss = new Random().nextDouble(-0.1, 0.1) * stockMoney;
                                JOptionPane.showMessageDialog(null, "You earned " + stockMoney + " from investments!");
                                game.money += gainLoss;
                                game.investor = true;
                            }
                        }
                        
                        case "13. Do something risky" -> {
                            String[] risks = {"Try illegal drugs", "Go skydiving", "Try pilot lessons", "Don't sleep for 24 hours straight", "Go cave exploring"};
                            JOptionPane.showMessageDialog(null, "You tried " + risks[new Random().nextInt(0, risks.length)]);
                            int healthrisk = new Random().nextInt(-15, 15);
                            JOptionPane.showMessageDialog(null, "Health: " + healthrisk);
                            game.health += healthrisk;
                        }

                        // Handle other cases here
                        default -> JOptionPane.showMessageDialog(null, "You chose to: " + actionSelected);
                    }
                }
            }
        });

        bottomPanel.add(startLife);
        bottomPanel.add(ageUp);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.add(mainGame, BorderLayout.CENTER);

        frame.setVisible(true);
    }
}
