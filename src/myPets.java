public class myPets
{
   public boolean isFriendly;
   public String foodType;
   public double amtSleep;
   public String name;

   public myPets(boolean isFriendly, String foodType, double amtSleep, String name)
   {
       this.isFriendly = isFriendly;
       this.foodType = foodType;
       this.amtSleep = amtSleep;
       this.name = name;

   }


   public String toString()
   {
       String output = "Name: "  + name +
                        "\nFriendly: " + isFriendly +
                        "\nhours of sleep: " + amtSleep +
                        "\nfood type: " + foodType;
       return output;
   }
}
