public class MyClass {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i <= array.length; i++) { // Error: Should be i < array.length
            array[i] = i * 2;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}