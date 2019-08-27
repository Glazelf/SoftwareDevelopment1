import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class main {
    private int daysLeft;
    private java.util.Random nextInt;
    private int penguinEnergyUsedForADay = 30;
    private int polarBearEnergyUsedForADay = 300;
    private penguin penguin1;
    private penguin penguin2;
    private penguin penguin3;
    private polarBear polarBear;


    private main(){
        daysLeft = 7;
        this.nextInt = new java.util.Random();
        penguin1 = new penguin();
        penguin2 = new penguin();
        penguin3 = new penguin();
        polarBear = new polarBear();
    }

    private void ShowWelcome(){
        String msg =  " ***  WELCOME at the  ***\n"
                + "   *  three PENGUINS  *\n"
                + "   *  and a POLARBEAR *\n"
                + "   *      ZOO         *\n"
                + ""
                + " This week, YOU will be the ZOO caretaker";
        System.out.println(msg);
    }
    private void ShowInstructions(){
        String msg = "You must feed the animals to keep up the zoo.\n"
                + "Use 'new day' to advance to the next day\n"
                + "Use 'feed penguin' to throw a fish to the penguins\n"
                + "Take care that all penguins are fed each day\n"
                + "Oh, and don't forget the polar bear.";
        System.out.println(msg);
    }
    private boolean checkDaysLeft(){
        return this.daysLeft > 0;
    }
    private void CloseApp(){
        System.out.println("bye ...");
        System.exit(0);
    }
    private void showUnknownCmd(String cmd) {
        System.out.println("The Zoo caretaker does not understand '" + cmd + "'.");
    }
    private int getNumber(int from, int to){
        return from+this.nextInt.nextInt(to);
    }
    private void DayChange(){
        int penguinAmount=0;
        if(penguin1.isAlive()){++penguinAmount;};
        if(penguin2.isAlive()){++penguinAmount;};
        if(penguin3.isAlive()){++penguinAmount;};
        this.daysLeft -= 1;
        if(penguinAmount==3&&daysLeft==0){
            ShowFullScreen();
            return;
        }
        if(penguinAmount==0||polarBear.energy<0){
            System.out.println("You lose!! Try again.");
            return;
        }

        penguin1.passDay();
        penguin2.passDay();
        penguin3.passDay();
        polarBear.passDay();
        if (polarBear.energy<polarBear.starveThresh){
            int penguinNumber = getNumber(1, 3);
            switch(penguinNumber){
                case 1: if(penguin1.energy>0) {
                            polarBear.energy += penguin1.energy;
                            penguin1.energy = 0;
                            break;
                        }
                case 2: if(penguin2.energy>0) {
                            polarBear.energy += penguin2.energy;
                            penguin2.energy = 0;
                            break;
                        }
                case 3: if(penguin3.energy>0) {
                            polarBear.energy += penguin3.energy;
                            penguin3.energy = 0;
                            break;
                        }
            }
        }

        System.out.println(" *** A new day is coming. ***");
    }
    private void ShowStatus() {
        int penguinAmount=0;
        if(penguin1.isAlive()){++penguinAmount;};
        if(penguin2.isAlive()){++penguinAmount;};
        if(penguin3.isAlive()){++penguinAmount;};
        switch(penguinAmount){
            case 3:
                System.out.println("Three penguins and a polar bear."); break;
            case 2:
                System.out.println("Two penguins and a polar bear."); break;
            case 1:
                System.out.println("One penguin and a polar bear."); break;
            case 0:
                System.out.println("Just a lonely (dead?) polar bear."); break;
        }
    }
    private void ShowFullScreen(){
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

        System.out.println(msg);
    }
    private void feedPenguins(){
        int penguinNumber = getNumber(1, 3);
        switch(penguinNumber){
            case 1: penguin1.feed();
                System.out.println("1");
                break;
            case 2: penguin2.feed();
                System.out.println("2");
                break;
            case 3: penguin3.feed();
                System.out.println("3");
                break;
        }
    }
    private void feedPolarBear(){
        polarBear.feed();
    }






    public static void main(String[] args) throws IOException{
        main zoo = new main();

        // Start with message
        zoo.ShowWelcome();

        // listen for commands
        while(zoo.checkDaysLeft())
        {
            String cmd = (new BufferedReader(new InputStreamReader(System.in))).readLine();

            switch(cmd){
                // close command
                case "close": case "quit": case "exit":
                zoo.CloseApp();
                break;

                // feed penguin command
                case "feed penguin":
                    zoo.feedPenguins();
                    break;

                // feed penguin command
                case "feed polar bear":
                    zoo.feedPolarBear();
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
                    zoo.showUnknownCmd(cmd);
                    break;
            }
        }
    }
}
