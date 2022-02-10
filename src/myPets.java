public class myPets
{
   //1 Instance Variables
   public boolean isFriendly;
   public String foodType;
   public double amtSleep;
   public String name;

   //2 Constructor(s)
   public myPets(boolean isFriendly, String foodType, double amtSleep, String name)
   {
       this.isFriendly = isFriendly;
       this.foodType = foodType;
       this.amtSleep = amtSleep;
       this.name = name;

   }

   //4 Getters
   public boolean getIsFriendly()
   {
       return isFriendly;
   }

   public String getFoodType()
   {
       return foodType;
   }
   public double getAmtSleep()
   {
       return amtSleep;
   }

   public String getName()
   {
       return name;

   }

   //5 Setters
   public void setIsFriendly(boolean isFriendly)
   {
       this.isFriendly = isFriendly;
   }

   public void setFoodType(String foodType)
   {
       this.foodType = foodType;
   }

   public void setAmtSleep(double amtSleep)
   {
       this.amtSleep = amtSleep;
   }

   public void setName(String name)
   {
       this.name = name;
   }

   //3 To String
   public String toString()
   {
       String output = "Name: "  + name +
                        "\nFriendly: " + isFriendly +
                        "\nhours of sleep: " + amtSleep +
                        "\nfood type: " + foodType;
       return output;
   }
}
