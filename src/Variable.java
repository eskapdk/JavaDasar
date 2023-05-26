public class Variable {
    public static void main(String[] args) {
        String name;
        name = "Eska Pratama";
    
        System.out.println(name);
    
        int age = 30;
        String address = "Indonesia";
    
        System.out.println(age);
        System.out.println(address);
    
        name = "Dian Kurniawan";
        System.out.println(name);
        System.out.println("===============");
        //dengan var harus dideklarasikan var nya
        var firstName = "Eska";
        var middleName = "Pratama";
        var lastName = "Kurniawan";

        System.out.println(firstName);
        System.out.println(middleName);
        System.out.println(lastName);
        System.out.println("===============");
        //var yang tidak dapat dirubah isinnya karena ada final
        final String application = "Belajar Java";
        System.out.println(application);
    }
}
