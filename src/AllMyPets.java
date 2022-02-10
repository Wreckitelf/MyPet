public class AllMyPets
{
    public static void main(String[] args)
    {
        myPets testPet = new myPets(false, "food", 2, "Test pet");
        //  System.out.println(testPet.toString());
        Frog shrimp = new Frog(false, true, "worms", 6, "Shrimp");
        //  System.out.println(shrimp.toString());
        Hamster jgerome = new Hamster(false, true, true, "rats",  0.5, "jgerome");
        //   System.out.println(jgerome.toString());

        //Test Pet
        testPet.setName("NaMe");
        System.out.println("Test Pet is now named " + testPet.getName());

        //Shrimp (Frog)
        shrimp.setIsPoisonous(true);
        System.out.println("Poisonous status of shrimp: " + shrimp.getIsPoisonous());

        //Jgerome (Hamster)
        jgerome.setIsFriendly(false);
        System.out.println("Jgerome's Friendly Status: " + jgerome.getIsFriendly());
        System.out.println("Jgerome's sleep in seconds: " + jgerome.sleepInSeconds());

    }
}
