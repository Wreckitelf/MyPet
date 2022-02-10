public class Hamster extends myPets
{
    private boolean needToEx;
    private boolean needsGrooming;

    public Hamster(boolean needToEx, boolean needsGrooming, boolean isFriendly, String foodType, double amtSleep, String name)
    {
        super(isFriendly, foodType, amtSleep, name);
        this.needToEx = needToEx;
        this.needsGrooming = needsGrooming;
    }

    public String toString()
    {
        String output = "Needs to Exercise: " + needToEx +
                        "\nNeeds Grooming: " + needsGrooming + "\n" +
                        super.toString();

        return output;
    }
}
