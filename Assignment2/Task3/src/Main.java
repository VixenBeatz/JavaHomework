public class Main {
    public static void main(String[] args) {
        ICalc dis = (double a, double b, double c) -> Math.pow(b, 2) - 4 * a * c;
        double a = 3.15;
        double b = 4.56;
        double c = -5.4;

        System.out.println("Discriminant for a = " + a + "; b = " + b + "; c = " + c + " is " + dis.calculate(a, b, c) + "!");

    }
}
