package Model.Classes;

public class NoCosmosException extends IllegalStateException{

    public NoCosmosException(String info)
    {
        super(info);
        System.out.println("Sorry, you have to train even more. ELEVATE YOUR COSMOS!");
    }
}
