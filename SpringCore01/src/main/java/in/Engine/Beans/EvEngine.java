package in.Engine.Beans;

public class EvEngine implements IEngine{
    @Override
    public int start() {
        System.out.println("Electric Engine Start...");
        return 1;
    }
}
