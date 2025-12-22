package in.Engine.Beans;

public class DieselEngine implements IEngine {
    @Override
    public int start() {
        System.out.println("Diesel Engine Start...");
        return 1;
    }
}
