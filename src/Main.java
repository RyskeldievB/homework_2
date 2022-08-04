import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dawn");
        whenGoWalk(24,35);

        System.out.println("Noon");
        whenGoWalk(30, 14);

        System.out.println("Sunset");
        whenGoWalk(28, 16);

        System.out.println("Twilight");
        whenGoWalk(31, 27);

        System.out.println("Night");
        whenGoWalk(16, 26);

    }
        public static void whenGoWalk (int ageMen, int temperature) {
            if (ageMen > 20 && ageMen < 45 && temperature > -20 && temperature < 30) {
                System.out.println("Go for a walk");
            } else if (ageMen < 20 && temperature > 0 && temperature < 28) {
                System.out.println("Go for a walk");
            } else if (ageMen > 45 && temperature > -10 && temperature < 25) {
                System.out.println("Go for a walk");
            } else {
                System.out.println("Stay at home");
            }
        }
}