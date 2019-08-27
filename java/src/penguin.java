public class penguin {
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

        private void ShowNoPenguinToHunt()
        {
            Say("There is no penguin left to hunt for the polar bear. You better be careful!");
        }

        private void ShowNoPenguinFeeded()
        {
            Say("The zoo caretaker ate the fish himself.");
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
}
