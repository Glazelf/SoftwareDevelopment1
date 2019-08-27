import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class zoop {
        private int numberOfDaysLeft;

        private int penguinOneEnergy;
        private int penguinTwoEnergy;
        private int penguinThreeEnergy;

        private int polarBearEnergy;
        private final int polarBearStarvationEnergyThreshold = 150;

        private java.util.Random nextInt ;

        private zoop() {
            numberOfDaysLeft = 7;

            penguinOneEnergy = 100;
            penguinTwoEnergy = 100;
            penguinThreeEnergy = 100;
            polarBearEnergy = 1000;

            this.nextInt = new java.util.Random();
        }

        private void ShowWelcome(){
            String msg =  " ***  WELCOME at the  ***\n"
                    + "   *  three PENGUINS  *\n"
                    + "   *  and a POLARBEAR *\n"
                    + "   *      ZOO         *\n"
                    + ""
                    + " This week, YOU will be the ZOO caretaker";

            Say(msg);
        }

        private void ShowInstructions()
        {
            String msg = "You must feed the animals to keep up the zoo.\n"
                    + "Use 'new day' to advance to the next day\n"
                    + "Use 'feed penguin' to throw a fish to the penguins\n"
                    + "Take care that all penguins are fed each day\n"
                    + "Oh, and dont forget the polar bear.";

            Say(msg);
        }

        /**
         * Output text to the user
         */
        private static void Say(String msg)
        {
            System.out.println(msg);
        }

        private boolean IsPenguinOneAlive()
        {
            return this.penguinOneEnergy > 0;
        }

        private boolean IsPenguinTwoAlive()
        {
            return this.penguinTwoEnergy > 0;
        }

        private boolean IsPenguinThreeAlive()
        {
            return this.penguinThreeEnergy > 0;
        }

        public boolean IsPolarBearAlive()
        {
            return this.polarBearEnergy > 0;
        }

        private void FeedPenguinOne(int energy)
        {
            this.penguinOneEnergy += energy;
            Say("Penguin 1 snatches a fish.");
        }

        private void FeedPenguinTwo(int energy)
        {
            this.penguinTwoEnergy += energy;
            Say("Penguin 2 snatches a fish.");
        }

        private void FeedPenguinThree(int energy)
        {
            this.penguinThreeEnergy += energy;
            Say("Penguin 3 snatches a fish.");
        }

        public void FeedPolarBear(int energy)
        {
            this.polarBearEnergy += energy;
            Say("Polar bear snatches a fish.");
        }

        private void PolarBearHuntsPenguinOne()
        {
            this.polarBearEnergy += this.penguinOneEnergy;
            this.penguinOneEnergy = 0;

            Say("The polar bear has eaten a penguin!");
        }

        private void PolarBearHuntsPenguinTwo()
        {
            this.polarBearEnergy += this.penguinTwoEnergy;
            this.penguinTwoEnergy = 0;

            Say("The polar bear has eaten a penguin!");
        }

        private void PolarBearHuntsPenguinThree()
        {
            this.polarBearEnergy += this.penguinThreeEnergy;
            this.penguinThreeEnergy = 0;

            Say("The polar bear has eaten a penguin!");
        }

        private void ShowFullScreen()
        {
            String msg = "::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + ":::::::::::::::::::::::::::::::::::::::://::::::::::::::::::::::::::::::::::::::::::::::::::::::::::\n"
                    + ":::::::::::::::::::::::::::::::::::::::yNmmo:::::::::::::/::::::::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::::::::::::::::::::::::::::::::yMMNMyoso::::::::+mmdo::::::::::::::::::::::::::::::::::::::::\n"
                    + ":::::::::::odmh/::::::::::::::::::::/dMMMMdy++/:::::::sNMNNs+oo/::::::::::::::::::::::::::::::::::::\n"
                    + "::::::::++/yNMMmo///:::::::::::::::oNMMMMd.o::::::::omMMMMhs+oo/::::::::::::::::::::::::::::::::::::\n"
                    + ":::::::/osddmdNMMNNNmhs::::::::::::NMMMMMy -+::::::yMMMMMo-o::::::::::::::::::::::::::::::::::::::::\n"
                    + "+/////:::/+/+:-yNMMNs:::::::::::::oMMMMMMMy:/y+:::+NMMMMM/`+/:::::::::::::::::::::::::::::::::::::::\n"
                    + "/oyhy+:::::+s`  :mMMNy:::::::::::-sMMMMMm+/:-yo:::hMMMMMNm:-o-::::::::::::::::::::::::::::::::::::::\n"
                    + "+//::-----om.    :NMMMo-----------yMMMMMN:  /+---:mMMMMM/---+---------------------------------------\n"
                    + "----------+s.    `hMMMy----------:dMMMMMN- :o:---+MMMMMM: `o:---------------------------------------\n"
                    + "-----------/+     oMMMy-::/+++osydNMNNMNo:sy+///sNMMMMNs.:+/----------------------------------------\n"
                    + "------------/+-`./dMMMmhys+//::-//:---:o++osossdNmdhdmmysho+:---------------------------------------\n"
                    + "-------------:yhhNNho+o/``               ``    ....``..--:/osso+:-----------------------------------\n"
                    + "-----------:shyys+-`                                        `.:/oso+/:------------------------------\n"
                    + "---------:sh+.```                                                `-+ossssooo++++sy+::---------------\n"
                    + "--------/ho.`                                                          ```../ooo/-::++/+/:----------\n"
                    + "-----:+/:-`                WELL DONE!                                      `ho::.   .+`.:oso+:------\n"
                    + "----/s:`                                                                    ./++.    `    `.:/++----\n"
                    + "----s./`             ``                                                      `             `  +mdo--\n"
                    + "--.od/+             `````                                                   ``                -ysd:-\n"
                    + "...omh:             `````                                                    `             -:::/+h:.\n"
                    + "....:ss `            ``./`               -                                          `.-::::oossys:..\n"
                    + "...../m-``            ``./.              /-`                        ```` ````...////+oo+///:::-.....\n"
                    + ".....-sm/.`        .`    ./`             ./:                     //++sysss+::+sss//-................\n"
                    + ".......mms-``      ``    `:-`             `s/`              `o-`/Ny+://:-...........................\n"
                    + "......+mo+y+.``       ``-+s+-             `/o.             -ss./m+..................................\n"
                    + "....-+s:..-sy+.``    ```./hd-```         `-hmh`            -h/-+:...................................\n"
                    + "..:+o-....-+hMmy-`    ```.:ds/:-......:++sys+m-`            -do.....................................\n"
                    + ":ho-.....-sMmdsoho.    ```.yMNNmdhhoo+/:.....ss:.`           .yo....................................\n"
                    + "/d-......omy:...-ys.    ```yh:::--...........-/sys/.`         `+y+-.................................\n"
                    + " sh-.....-:+:` ``oy.`    `.hs.......```````      .sdo-`         .sd:           `````````````...`````\n"
                    + " `ho---..-ysh`   /h.`    `.+o/```                 /d+yo:``        -yy+++:`                          \n"
                    + "  .oyyyhyyNNo    /m-.``      .//+s/`             /d+..:oso/.```     -+:-/sy/                        \n"
                    + ".......-:::.``...+N+::..````  `:o:m+`......`````sy-......:yds/-.```    `/s:y-``````````````````     \n"
                    + "``````````````````/o++//+/////+ss+/.````````````:yysysssyysyyhosyo+++///+ms+-......```````````````  ";

            Say(msg);
        }

        /**
         * Avoid starvation, try to catch a penguin
         */
        private void PolarBearHunts()
        {
            int penguinNumber = GetNumber(1, 3);

            switch (penguinNumber)
            {
                case 1:
                    if (IsPenguinOneAlive()) PolarBearHuntsPenguinOne(); break;

                case 2:
                    if (IsPenguinTwoAlive()) PolarBearHuntsPenguinTwo(); break;

                case 3:
                    if (IsPenguinThreeAlive()) PolarBearHuntsPenguinThree(); break;

                default: ShowNoPenguinToHunt(); break;
            }
        }

        private void ShowNoPenguinToHunt()
        {
            Say("There is no penguin left to hunt for the polar bear. You better be careful!");
        }

        private void ShowNoPenguinFeeded()
        {
            Say("The zoo caretaker ate the fish himself.");
        }

        private void ShowGoodBye()
        {
            Say("bye ...");
        }

        private void ShowWhatDoYouWant(String cmd)
        {
            String msg = "The Zoo caretaker does not understand '" + cmd + "'.";

            Say(msg);
        }

        private void CloseApp()
        {
            ShowGoodBye();
            System.exit(0);
        }

        /**
         * The zoo caretaker feeds one of the penguins
         */
        private void FeedPenguin()
        {
            int fish = 50;

            int penguinNumber = GetNumber(1, 3);

            switch(penguinNumber)
            {
                case 1:
                    if(IsPenguinOneAlive() ) FeedPenguinOne(fish); break;

                case 2:
                    if (IsPenguinTwoAlive()) FeedPenguinTwo(fish); break;

                case 3:
                    if (IsPenguinThreeAlive()) FeedPenguinThree(fish); break;

                default: ShowNoPenguinFeeded(); break;
            }
        }

        private void FeedPolarBear()
        {
            int fish = 50;

            this.polarBearEnergy += fish;
        }

        private int GetNumberOfLivingPenguins()
        {
            int numberOfPinguins = 0;
            if (IsPenguinOneAlive()) numberOfPinguins++;
            if (IsPenguinTwoAlive()) numberOfPinguins++;
            if (IsPenguinThreeAlive()) numberOfPinguins++;

            return numberOfPinguins;
        }

        private void ShowStatus()
        {
            int numberOfPinguins = GetNumberOfLivingPenguins();

            String penguinMsg = "";

            switch(numberOfPinguins)
            {
                case 3:
                    penguinMsg = "Three penguins and a polar bear."; break;
                case 2:
                    penguinMsg = "Two penguins and a polar bear."; break;
                case 1:
                    penguinMsg = "One penguin and a polar bear."; break;
                case 0:
                    penguinMsg = "Just a lonely dead? polar bear."; break;
            }

            Say(penguinMsg);
        }

        private int GetNumber(int from, int to)
        {
            return from+this.nextInt.nextInt(to);
        }

        private boolean IsPolarBearStarving()
        {
            return this.polarBearEnergy <= polarBearStarvationEnergyThreshold;
        }

        private boolean AllAnimalsAreAlive()
        {
            boolean allPenguinsAreAlive = GetNumberOfLivingPenguins() == 3;
            boolean polarBearIsAlive = this.polarBearEnergy > 0;

            return allPenguinsAreAlive && polarBearIsAlive;
        }

        private boolean AreThereAnyDaysLeft()
        {
            return this.numberOfDaysLeft > 0;
        }

        private boolean IsGameWon()
        {
            return ! AreThereAnyDaysLeft() && AllAnimalsAreAlive();
        }

        private boolean IsGameOver()
        {
            return !( AreThereAnyDaysLeft() || AllAnimalsAreAlive());
        }

        /**
         * Each day, the animals consume energy
         */
        private void DayChange()
        {
            this.numberOfDaysLeft -= 1;

            if(IsGameWon())
            {
                ShowFullScreen();
                return;
            }

            if(IsGameOver())
            {
                Say("You loose!! Try again.");
                return;
            }

            int penguinEnergyUsedForADay = 30;
            int polarBearEnergyUsedForADay = 300;


            this.penguinOneEnergy -= penguinEnergyUsedForADay;
            this.penguinTwoEnergy -= penguinEnergyUsedForADay;
            this.penguinThreeEnergy -= penguinEnergyUsedForADay;

            this.polarBearEnergy -= polarBearEnergyUsedForADay;


            if (IsPolarBearStarving()) PolarBearHunts();

            Say(" *** A new day is coming. ***");
        }

        public static void main(String[] args) throws IOException {
            zoop zoo = new zoop();

            // Start with message
            zoo.ShowWelcome();

            // listen for commands
            while(zoo.AreThereAnyDaysLeft())
            {
                String cmd = (new BufferedReader(new InputStreamReader(System.in))).readLine();

                switch (cmd)
                {
                    // close command
                    case "close": case "quit": case "exit":
                    zoo.CloseApp();
                    break;

                    // feed penguin command
                    case "feed penguin":
                        zoo.FeedPenguin();
                        break;

                    // feed penguin command
                    case "feed polar bear":
                        zoo.FeedPolarBear();
                        break;

                    // help command
                    case "help": case "?":
                    zoo.ShowInstructions();
                    break;

                    // new day command
                    case "new day":
                        zoo.DayChange();
                        zoo.ShowStatus();
                        break;

                    // unknown command
                    default:
                        zoo.ShowWhatDoYouWant(cmd);
                        break;

                }
            }
        }
    }
