public class Hamster extends myPets
{
    //1 Instance variables
    private boolean needToEx;
    private boolean needsGrooming;

    //2 Constructor(s)
    public Hamster(boolean needToEx, boolean needsGrooming, boolean isFriendly, String foodType, double amtSleep, String name)
    {
        super(isFriendly, foodType, amtSleep, name);
        this.needToEx = needToEx;
        this.needsGrooming = needsGrooming;
    }

    //4 Getters
    public boolean getNeedsToEx()
    {
        return needToEx;
    }

    public boolean getNeedsGrooming()
    {
        return needsGrooming;
    }

    //5 Setters
    public void setNeedToEx(boolean needToEx)
    {
        this.needToEx = needToEx;
    }

    public void setNeedsGrooming(boolean needsGrooming)
    {
        this.needsGrooming = needsGrooming;
    }

    //3 To String
    public String toString()
    {
        String output = "Needs to Exercise: " + needToEx +
                        "\nNeeds Grooming: " + needsGrooming + "\n" +
                        super.toString();

        return output;
    }
}
