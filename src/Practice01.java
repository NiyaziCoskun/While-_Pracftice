public class Practice01 {
    public static void main(String[] args) {
        String[] names = {"Alex", "Mary","Tobias", "Jan", "Michael","Leo"};
        int index = 0;

        while(index< names.length) {
            if (names[index].equals("Leo")) {
                System.out.println("leo names is contains.");
            }
            index++;
        }
    }
}
