public class Radio implements ElectricityConsumer {

    public void playMusic(){
        System.out.println("Радио играет!");
    }

    public void electricityOn() {
        playMusic();
    }
}
