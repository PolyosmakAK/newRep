public class Program {
    public static void fire(){
        System.out.println("FIIIREeEE!");
    }
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        Radio nasheRadio = new Radio();
        Switcher switcher = new Switcher();
        switcher.addConsumer(lamp);
        switcher.switchOn();
        switcher.removeConsumer(lamp);
        switcher.addConsumer(nasheRadio);
        switcher.switchOn();
//        switcher.addConsumer( new ElectricityConsumer() {
//            public void electricityOn() {
//                System.err.println("Пожар");
//            }
//        });
        switcher.addConsumer(() -> System.err.println("Пожар")); // лямбда выражение = 11- 15 строки
        switcher.addConsumer(Program::fire);// вызов метода лямбда выражения
        switcher.switchOn();

    }
}