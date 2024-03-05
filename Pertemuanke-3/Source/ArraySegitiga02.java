public class ArraySegitiga02 {
    public static void main(String[] args) {
        Segitiga02[] sgArray = new Segitiga02[4];
        sgArray[0] = new Segitiga02(10, 4);
        sgArray[1] = new Segitiga02(20, 10);
        sgArray[2] = new Segitiga02(15, 6);
        sgArray[3] = new Segitiga02(25, 10);
        
        for (int i = 0; i < sgArray.length; i++) {
            System.out.println("Luas Segitiga ke-" + i + ": " + sgArray[i].hitungLuas());
            System.out.println("Keliling Segitiga ke-" + i + ": " + sgArray[i].hitungKeliling());
        }
    }
}