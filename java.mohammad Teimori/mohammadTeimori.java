public class Fibonacci {

    public static void main(String[] args) {
        // تعداد اعداد فیبوناچی که می خواهیم محاسبه کنیم
        int n = 10;

        // مقداردهی اولیه دو عدد اول
        int a = 0;
        int b = 1;

        // چاپ اعداد فیبوناچی
        for (int i = 0; i < n; i++) {
            System.out.println(a);

            // محاسبه عدد بعدی
            int c = a + b;
            a = b;
            b = c;
        }
    }
}