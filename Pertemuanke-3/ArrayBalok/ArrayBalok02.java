public class ArrayBalok02 {
    public static void main(String[] args) {
        Balok02[] blArray = new Balok02[3];
    blArray[0] = new Balok02(100, 30, 12);
    blArray[1] = new Balok02(120, 40, 15);
    blArray[2] = new Balok02(210, 50, 25);
    for(int i = 0; i < 3; i++) {
        System.out.println("Volume Balok ke-" + i + ": " + blArray[i].hitungVolume());
    }
}
}
