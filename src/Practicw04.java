public class Practicw04 {
    public static void main(String[] args) {
        int[] array = {20, 50, 60, 70};
        int sira = 0;
        int uzunluk = array.length;
        int sum = 0;

        while (sira< uzunluk) {
            sum += array[sira];
            sira++;
        }

        System.out.println("Toplam :" + sum);
    }
}
