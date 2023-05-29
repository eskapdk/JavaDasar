
public class Break {
    public static void main(String[] args) {
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke : "+counter);
            counter++;

            if (counter > 20) {
                break;
            }

        }
        System.out.println("Perulangan berhenti ke : "+counter);
    }
}
