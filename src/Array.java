public class Array {
    public static void main(String[] args) throws Exception {
        String[] stringArray;
        stringArray = new String[4];
    
        stringArray[0] = "Eska";
        stringArray[1] = "Pratama";
        stringArray[2] = "Dian";
        stringArray[3] = "Kurniawan";
    
        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray[3]);
        System.out.println("===============");
        //ganti nilai array
        stringArray[0] = "Bayu";

        System.out.println(stringArray[0]);
        System.out.println(stringArray[1]);
        System.out.println(stringArray[2]);
        System.out.println(stringArray[3]);
        System.out.println("===============");
    
    //inisiasi array
    String[] namaNama = {
        "Eska", "Pratama", "Dian" , "Kurniawan"
    };
    System.out.println(namaNama[0]);
    System.out.println(namaNama[1]);
    System.out.println(namaNama[2]);
    System.out.println(namaNama[3]);

    int[] arrayInt = new int[]{
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    };
    System.out.println(arrayInt[5]);
    System.out.println(arrayInt.length);
    System.out.println("===============");

    //array didalam array
    String[][] members = {
        {"Eska", "Pratama"},
        {"Dian", "Kurniawan"},
        {"Bayu"}
    };

    System.out.println(members[0][1]);
    System.out.println(members[1][0]);
    System.out.println(members[2][0]);


    }
}
