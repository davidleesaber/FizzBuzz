public class Multiples {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 3; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                num ++;
            }
        }
        System.out.println(num);
    }
}
