public class Main {

    public static void main(String[] args) {
        ICompareStrings func = (String s1, String s2) -> s1.length() > s2.length() ? s1 : s2;

        String[] strings = new String[] {
                "Common string",
                "Very Very long string",
                "Short string"
        };

        System.out.println("Comparing " + strings[0] + " and " + strings[1] + ": "
                + func.compare(strings[0], strings[1]) + " is longer!");
        System.out.println("Comparing " + strings[0] + " and " + strings[2] + ": "
                + func.compare(strings[0], strings[2]) + " is longer!");
        System.out.println("Comparing " + strings[0] + " and " + strings[1] + " in different order: "
                + func.compare(strings[1], strings[0]) + " is still longer!");
        System.out.println("Comparing " + strings[0] + " and " + strings[2] + " in different order: "
                + func.compare(strings[2], strings[0]) + " is still longer!");


    }

}
