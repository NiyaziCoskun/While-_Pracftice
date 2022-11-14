public class Practice03 {
    public static void main(String[] args) {
        //Bir sayinin rakamlari toplamini while döngüsünü kullanarak bulan bir program yaziniz
        //Write a program that finds the sum of the digits of a number using the while loop
        //Schreiben Sie ein Programm, das die Summe der Ziffern einer Zahl mithilfe der while-Schleife findet
        int digit = 0;
        int sum = 0;
        int number = 12365;

        while(number > 0){
            digit = number %10;
            sum += digit;
            number /= 10;
        }

        System.out.println("Toplam :" + sum);


    }
}
