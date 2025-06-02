package _29_Builder.Computer;

public class ComputerLombokMain {
    public static void main(String[] args) {
        ComputerLombok computerLombok = ComputerLombok.builder()
                .storage(256)
                .hasWifi(true)
                .hasBluetooth(true)
                .build();
    }
}
