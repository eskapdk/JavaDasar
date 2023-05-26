public class IfStatement {
    public static void main(String[] args) {
       
       // basic IF .....
        var nilai = 80;
        var absen = 60;
    
        var lulusNilai = nilai >= 75;
        var lulusAbsen = absen >= 75;
    
        var lulus = lulusNilai && lulusAbsen;
        System.out.println("Apakah Lulus: "+lulus);
        System.out.println("===================");

        //IF ..... ELSE ......
        if (nilai >= 75 && absen >= 75) {
          System.out.println("Selamat Anda Lulus");
        } else {
          System.out.println("Silahkan Coba Lagi Tahun Depan");
        }
        System.out.println("===================");

        //IF ..... ELSE IF.....
        if (nilai >= 80 && absen >= 80) {
          System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && absen >= 70) {
          System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && absen >= 60) {
          System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && absen >= 50) {
          System.out.println("Nilai Anda D");
        } else {
          System.out.println("Nilai Anda E");
        }
    }
}
