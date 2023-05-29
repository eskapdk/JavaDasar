public class MethodReturnValue {
    public static void main(String[] args) {
        var hasil1 = tambah(200,300);
        System.out.println(hasil1);
        System.out.println(tambah(123,321));

        System.out.println(hitung(120, "-", 90));
        System.out.println(hitung(30, "+", 40));
        System.out.println(hitung(12, "salah", 0));

    }

    static int tambah(int nilai1, int nilai2){
        var total = nilai1+nilai2;
        return total;
    }

    static int hitung(int nilai1, String operasi, int nilai2){
        switch (operasi) {
            case "+":
                return nilai1+nilai2;
            case "-":
                return nilai1-nilai2;
            default:
                return 0;
        }
    }
}
