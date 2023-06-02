public class MethodOverloading{
    public static void main(String[] args) {
        bilangHallo();
        bilangHallo("eska");
        bilangHallo("eska", 29);
    }
    public static void bilangHallo() {
        System.out.println("Hallo");
    }

    public static void bilangHallo(String nama) {
        System.out.println("Hallo "+ nama);
    }

    public static void bilangHallo(String nama, int umur) {
        System.out.println("Hallo "+ nama + " Umur "+umur);
    }
}
