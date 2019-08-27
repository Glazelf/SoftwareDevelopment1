import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class main {
    private int daysLeft;
    private java.util.Random nextInt ;

    private main(){
        daysLeft = 7;
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
    private void ShowInstructions(){
        String msg = "You must feed the animals to keep up the zoo.\n"
                + "Use 'new day' to advance to the next day\n"
                + "Use 'feed penguin' to throw a fish to the penguins\n"
                + "Take care that all penguins are fed each day\n"
                + "Oh, and dont forget the polar bear.";
        Say(msg);
    }
    private static void Say(String msg){
        System.out.println(msg);
    }
    private boolean checkDaysLeft(){
        return this.daysLeft > 0;
    }
    private void CloseApp(){
        Say("bye ...");
        System.exit(0);
    }








    public static void main(String[] args) throws IOException{
        main zoo = new main();

        // Start with message
        zoo.ShowWelcome();

        // listen for commands
        while(zoo.checkDaysLeft())
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
