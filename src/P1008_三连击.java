public class P1008_三连击 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        for (a = 129; a <= 333; a++) {
            b = a * 2;
            c = a * 3;
            int addition = (a/100+a/10%10+a%10+b/100+b/10%10+b%10+c/100+c/10%10+c%10);
            int oneToNineAddition = 1+2+3+4+5+6+7+8+9;
            int multiplication =((a/100)*(a/10%10)*(a%10)*(b/100)*(b/10%10)*(b%10)*(c/100)*(c/10%10)*(c%10));
            int oneToNineMultiplication = 1*2*3*4*5*6*7*8*9;
            if (addition == oneToNineAddition && multiplication == oneToNineMultiplication) {
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}
