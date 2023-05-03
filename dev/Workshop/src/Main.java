public class Main {
    public static void main(String[] args) {
        multiply(2, 5);
        concatenate("Am fost", "aici la masa");
        countLetters("Alfabeta");
    }

    // This function returns the product of two different numbers;
    public static void multiply(int a, int b){
        System.out.println(a * b);
    }

    // This function concatenates (merges) two different strings, with a space provided in between;
    public static void concatenate(String a, String b){
        System.out.println(a +" "+ b);
    }

    // This function returns the number of characters in a string, including white spaces;
    public static void countLetters(String str){
        int a = 0;
        for (int i = 0; i <= str.length(); i++){
            a++;
        }
        System.out.println("A final:" + a);
    }
}