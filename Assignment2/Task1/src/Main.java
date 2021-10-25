public class Main {
    public static void main(String[] args) {
        IDividedByThirteen fInterface = value -> value % 13 == 0;
        int[] values = new int[] { 13, 26, 27, 0, 39, 40, 130};
        for (int value: values) {
            System.out.println(value + ((fInterface.divideByThirteen(value) ? " can " : " can not ")) + "be divided by 13.");
        }
    }
}
