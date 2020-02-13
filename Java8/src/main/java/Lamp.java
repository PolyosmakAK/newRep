public class Lamp implements ElectricityConsumer {
    public void lampOn() {
        System.out.println("Лампа зажглась!");
    }

    public void electricityOn() {
        lampOn();
    }
}
