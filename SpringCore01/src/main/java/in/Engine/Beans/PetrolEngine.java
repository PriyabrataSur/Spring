package in.Engine.Beans;

public class PetrolEngine implements IEngine {
    @Override
    public int start() {
        System.out.println("Petrol Engine Start...");
        return 1;
    }
}
