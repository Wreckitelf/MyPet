public class Frog extends myPets
{
    //1 Instance variables
    private boolean isPoisonous;

    //2 Constructor(s)
    public Frog (boolean isPoisonous, boolean isFriendly, String foodType, double amtSleep, String name)
    {
        super (isFriendly, foodType, amtSleep, name);
        this.isPoisonous = isPoisonous;
    }

    //4 Getters
    public boolean getIsPoisonous()
    {
        return isPoisonous;
    }


    //5 Setters
    public void setIsPoisonous(boolean isPoisonous)
    {
        this.isPoisonous = isPoisonous;
    }

    //3 To String
    public String toString()
    {
        String output = super.toString() +
                        "\nIs Poisonous: " + isPoisonous;
        return output;
    }
}
