public class Frog extends myPets
{
    private boolean isPoisonous;

    public Frog (boolean isPoisonous, boolean isFriendly, String foodType, double amtSleep, String name)
    {
        super (isFriendly, foodType, amtSleep, name);
        this.isPoisonous = isPoisonous;
    }

    public String toString()
    {
        String output = super.toString() +
                        "\nIs Poisonous: " + isPoisonous;
        return output;
    }
}
