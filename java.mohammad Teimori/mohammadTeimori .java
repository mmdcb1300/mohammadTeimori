public class BigIntegerOperations {

    public static void main(String[] args) {
        // ایجاد دو بیگ اینتیجر
        String firstNumber = "12345678901234567890";
        String secondNumber = "98765432109876543210";

        // جمع دو بیگ اینتیجر
        BigInteger sum = new BigInteger(firstNumber).add(new BigInteger(secondNumber));
        System.out.println("جمع دو بیگ اینتیجر: " + sum);

        // ضرب دو بیگ اینتیجر
        BigInteger product = new BigInteger(firstNumber).multiply(new BigInteger(secondNumber));
        System.out.println("ضرب دو بیگ اینتیجر: " + product);
    }
}