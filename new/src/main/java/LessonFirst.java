public class LessonFirst {

    public static void exercise1() {

        int start = 10;
        double percent = 0.1;
        int day = 7;

        double total = start;
        double current = start;
        double temp;

        for (int i = 0; i < day; i++) {
            temp = current + (current * percent);
            current = temp;
            total += current;
        }

        System.out.println("Общее растояние: " + total);
    }

    public static void exercise3() {
        int sum = 0;

        for (int i = 1; i <= 256; i = i * 2) {
            sum = sum + i;
        }

        System.out.println("Sum: " + sum);
    }


    public static void exercise6() {

        for (int i = 2; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i);
            }
        }

    }

    public static void exercise7() {
        int sum = 0;

        for (int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }

        System.out.println("Сумма всех не чётных чисел в диапазоне [1:99]: " + sum);
    }

    public static void main(String... args) {
        LessonFirst.exercise1();
        LessonFirst.exercise3();
        LessonFirst.exercise6();
        LessonFirst.exercise7();
    }

}


