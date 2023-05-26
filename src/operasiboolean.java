public class operasiboolean {
    public static void main(String[] args) {
        
    var absen = 75;
    var nilaiAkhir = 80;

    boolean lulusAbsen = absen >= 75;
    boolean lulusNilai = nilaiAkhir >= 75;

    var lulus = lulusAbsen && lulusNilai;
    System.out.println("Nilai Absen: "+absen);
    System.out.println("Nilai Akhir: "+nilaiAkhir);
    System.out.println("Apakah Lulus: "+ lulus);
    }
}
