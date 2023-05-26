public class Switch {
    public static void main(String[] args) {
    
    //basic switch
        var nilai = "B";

    switch (nilai) {
      case "A":
        System.out.println("Wow, Anda Lulus Dengan Baik");
        break;
      case "B":
      case "C":
        System.out.println("Nilai Anda Cukup Baik");
        break;
      case "D":
        System.out.println("Anda tidak lulus");
        break;
      default:
        System.out.println("Mungkin Anda salah jurusan");
    }
System.out.println("===========================");

//switch lamda
String nilai2 = "A";
switch (nilai2) {
    case "A" -> System.out.println("Wow, Anda Lulus Dengan Baik");
    case "B", "C" -> System.out.println("Nilai Anda Cukup Baik");
    case "D" -> System.out.println("Anda Tidak Lulus");
    default -> {
      System.out.println("Muungkin Anda Salah Jurusan");
    }
  }

  System.out.println("===========================");
//switch yield
//tanpa yield
String ucapan;
String nilai3 = "D";
switch (nilai3) {
  case "A" -> ucapan = "Wow, Anda Lulus Dengan Baik";
  case "B", "C" -> ucapan = "Nilai Anda Cukup Baik";
  case "D" -> ucapan = "Anda Tidak Lulus";
  default -> {
    ucapan = "Muungkin Anda Salah Jurusan";
  }
}
System.out.println(ucapan);

//dengan yield
ucapan = switch (nilai3) {
    case "A":
      yield "Wow, Anda Lulus Dengan Baik";
    case "B", "C":
      yield "Nilai Anda Cukup Baik";
    case "D":
      yield "Anda Tidak Lulus";
    default:
      yield "Muungkin Anda Salah Jurusan";
  };

  System.out.println(ucapan);




    }
}
