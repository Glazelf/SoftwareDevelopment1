public class penguin {
    public int energy;

    public penguin(){
        energy = 100;
    }

    public boolean isAlive(){
        return this.energy > 0;
    }

    public void feed(){
        this.energy += 50;
        System.out.println("Penguin snatches a fish.");
    }
    public void passDay(){
        this.energy -= 30;
    }
}
