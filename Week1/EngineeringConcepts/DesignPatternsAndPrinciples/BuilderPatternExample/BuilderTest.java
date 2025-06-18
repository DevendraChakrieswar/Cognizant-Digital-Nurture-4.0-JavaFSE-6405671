package Week1.EngineeringConcepts.DesignPatternsAndPrinciples.BuilderPatternExample;

public class BuilderTest {
    public static void main(String[] args) {
        Computer gamingPC = new Computer.Builder()
                .setCpu("Intel Core i9")
                .setRam("32GB")
                .setStorage("2TB SSD")
                .setGraphicsCard("NVIDIA RTX 4090")
                .setBluetoothEnabled(true)
                .setWiFiEnabled(true)
                .build();

        Computer officePC = new Computer.Builder()
                .setCpu("Intel Core i3")
                .setRam("8GB")
                .setStorage("512GB HDD")
                .setBluetoothEnabled(false)
                .setWiFiEnabled(true)
                .build();

        System.out.println("Gaming PC: " + gamingPC);
        System.out.println("Office PC: " + officePC);
    }
}
