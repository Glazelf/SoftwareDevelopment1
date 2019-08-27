public class polarBear {
        public int energy;
        public static int starveThresh = 150;

        public polarBear(){
            energy = 1000;
        }

        public boolean isAlive(){
            return this.energy > 0;
        }

        public void feed(){
            this.energy += 50;
            System.out.println("Polar bear snatches a fish.");
        }
        public void passDay(){
            this.energy -= 300;
        }
}
