public class RecursiveMethod {
    public static void main(String[] args) {
       System.out.println("Hasil faktorial dengan method loop : "+factorialloop(5));
       System.out.println("Hasil faktorial dengan method rekursif : "+ factorialRecursive(5));
    }

    public static int factorialloop(int value) {
        var result = 1;
        for (var counter = 1;counter<=value;counter++){
            result *= counter;
        }
        
        return result;
    }

    public static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}
