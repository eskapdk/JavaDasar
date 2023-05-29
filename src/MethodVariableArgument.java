public class MethodVariableArgument {
    public static void main(String[] args) {
        statusLulus("eska", 80,85,75,85,90);
        statusLulus("pratama", 60,85,65,85,70);
    }

    public static void statusLulus(String nama, int... nilai) {
        var total = 0;
        for(var hasil : nilai){
            total += hasil;
        }
        
        var nilaiakhir = total/nilai.length;

        if (nilaiakhir >= 80) {
            System.out.println("Selamat "+nama+", Anda Lulus dengan Nilai : "+nilaiakhir);
        } else {
            System.out.println("Maaf "+nama+", Anda Tidak Lulus dengan Nilai : "+nilaiakhir);
        }

    }
}
