package in.Engine.Beans;

public class EngineService {
    private IEngine engine;

    public EngineService(){
        System.out.println("EngineService :: Constructor");
    }

    public EngineService(IEngine engine){
        this.engine = engine;
    }

    public void working(){
        int status = engine.start();
        if (status == 1){
            System.out.println("Engine is working...");
        }else{
            System.out.println("Engine is not working...");
        }
    }
}
