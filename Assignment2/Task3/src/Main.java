public class Main {
    public static void main(String[] args) {

        ICalc dis = (double a, double b, double c) -> Math.pow(b, 2) - 4 * a * c;

        ICalc func = (double a, double b, double c) -> a * Math.pow(b, c);

        double a = 3.15;
        double b = 4.56;
        double c = -5.4;

        System.out.println("Discriminant for a = " + a + "; b = " + b + "; c = " + c + " is " + dis.calculate(a, b, c) + "!");

        System.out.println("a * b^c for a = " + a + "; b = " + b + "; c = " + c + " is " + func.calculate(a, b, c) + "!");
    }
}
