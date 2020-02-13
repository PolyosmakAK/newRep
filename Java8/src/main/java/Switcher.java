import java.util.ArrayList;
import java.util.List;

public class Switcher {
   private List<ElectricityConsumer> listeners = new ArrayList<ElectricityConsumer>();

    public void addConsumer(ElectricityConsumer listener) {
        listeners.add(listener);
    }
    public void removeConsumer(ElectricityConsumer listener) {
        listeners.remove(listener);
        System.out.println("Выключили");
    }
    public void switchOn(){
        System.out.println("Выключатель включили!");
       for (ElectricityConsumer b:listeners ){
           b.electricityOn();
       }
    }
}
