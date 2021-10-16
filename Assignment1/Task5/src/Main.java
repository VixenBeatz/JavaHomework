public class Main {
    public static void main(String[] args) {
        Bus ikarus = new Bus("ikarus");
        Bus anotherIkarus = new Bus("ikarus");
        Bus liaz = new Bus("liaz");

        System.out.println(ikarus.equals(anotherIkarus));
        System.out.println(ikarus.equals(liaz));
    }
}
